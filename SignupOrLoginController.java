package edu.okcu.sveloz.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupOrLoginController extends Encryptions {
    @FXML

    private void LoginButtonClick(ActionEvent actionEvent) throws IOException {
        loadScene("hello-view.fxml", actionEvent);
    }

    @FXML
    private void SignupButtonClick(ActionEvent actionEvent) throws IOException {
        loadScene("SignUp.fxml", actionEvent);
    }

    //initializing the correct file to write to
    String fileName = "src/main/resources/info.txt";
    String userName = "";

    //load scene method to switch between popups
    public void loadScene(String fxmlFile, ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));

        //if statement to update label with username
        if(fxmlFile.equals("welcome.fxml")) {
            WelcomeController controller = (WelcomeController) loader.getController();
            controller.nameLabel.setText(userName);
        }

}
}



