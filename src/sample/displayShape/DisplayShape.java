package src.sample.displayShape;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class DisplayShape extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    int width = (int) Screen.getPrimary().getBounds().getWidth();
    int height = (int) Screen.getPrimary().getBounds().getHeight();
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("view/displayShape.fxml"));
            primaryStage.setTitle("VDTC-Phần mềm soát vé Làn thu phí số : 1");
            primaryStage.setScene(new Scene(root,1039.0,652.0));
//            primaryStage.setScene(new Scene(root, 652.0, 400));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
