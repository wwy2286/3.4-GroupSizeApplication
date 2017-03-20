import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * Created by William Yu on 3/19/2017.
 */
public class GroupSizeApplication extends Application {
    public void start (Stage primaryStage){
        TextInputDialog input = new TextInputDialog();
        Alert output = new Alert(Alert.AlertType.INFORMATION);
        int groupSize;
        int numberOfTries=3;
        String username;
        String password;
        while (numberOfTries>0){
            input.setTitle("Username");
            input.setHeaderText("Please enter username");
            input.showAndWait();
            username = input.getResult();
            if (username.equals("William")){
                input.setTitle("Password");
                input.setHeaderText("Please enter password");
                input.showAndWait();
                password = input.getResult();
                if (password.equals("password")){
                    input.setTitle("Number of people");
                    input.setHeaderText("Please enter number of people");
                    input.showAndWait();
                    int numPeople = Integer.parseInt(input.getResult());
                    if (numPeople>3){
                        if (numPeople>10) {
                            groupSize = numPeople/2;
                            output.setContentText("Group size is "+groupSize);
                            output.showAndWait();
                        }else{
                            groupSize = numPeople/3;
                            output.setContentText("Group size is "+groupSize);
                            output.showAndWait();

                        }
                    }else{
                        output.setContentText("The number of people has to be at least 3");
                        output.showAndWait();
                    }
                    input.setTitle("Number of people");
                    input.setHeaderText("Please enter number of people");
                    input.showAndWait();
                    numPeople = Integer.parseInt(input.getResult());

                    if (numPeople>11 && numPeople<55){
                        groupSize = numPeople/11;
                        output.setContentText("Team size is "+groupSize);
                        output.showAndWait();
                    }else{
                        output.setContentText("Team size is 1");
                        output.showAndWait();
                    }
                }else{
                    output.setContentText("Wrong Password");
                    output.showAndWait();
                    numberOfTries--;
                }
            }else{
                output.setContentText("Wrong Username");
                output.showAndWait();
                numberOfTries--;
            }
        }
        if (numberOfTries==0) {
            output.setContentText("Contact Administrator");
            output.showAndWait();
        }



    }

}
