package src.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
//    int width = (int) Screen.getPrimary().getBounds().getWidth();
//    int height = (int) Screen.getPrimary().getBounds().getHeight();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login/view/login.fxml"));
        primaryStage.setTitle("Đăng nhập phần mềm thu phí tại làn");
        primaryStage.setScene(new Scene(root));
//        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
