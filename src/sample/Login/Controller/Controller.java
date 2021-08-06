package src.sample.Login.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    TextField userTextField;
    @FXML
    PasswordField passwordField;

    public void login(ActionEvent event) throws IOException {

//        Parent root = FXMLLoader.load(getClass().getResource("Login/view/login.fxml"));
//        primaryStage.setTitle("Đăng nhập phần mềm thu phí tại làn");
//        primaryStage.setScene(new Scene(root, 600, 300));
//        primaryStage.show();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("displayShape.fxml"));
        Parent parent = loader.load();
        Stage primaryStage = new Stage();
        primaryStage.setTitle("VDTC-Phần mềm soát vé Làn thu phí số :");
        primaryStage.setScene(new Scene(parent, 600, 300));
        primaryStage.show();
//        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//        StudentDetailController controller = loader.getController();
//        Student selectStudent = tableView.getSelectionModel().getSelectedItem();
//        controller.setStudent(selectStudent);
//        primaryStage.setScene(new Scene(parent));
//        primaryStage.show();
    }

}
