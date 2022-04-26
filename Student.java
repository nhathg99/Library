package library;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeController {


    public void studentModule(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("students.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void bookModule(ActionEvent event) {
    }

    public void rentModule(ActionEvent event) {
    }
}