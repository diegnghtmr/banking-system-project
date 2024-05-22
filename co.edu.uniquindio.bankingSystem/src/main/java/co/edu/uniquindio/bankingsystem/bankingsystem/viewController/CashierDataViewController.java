package co.edu.uniquindio.bankingsystem.bankingsystem.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CashierDataViewController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtCashierName;

    @FXML
    private TextField txtEmaiCashier;

    @FXML
    private TextField txtIdCashier;

    @FXML
    private TextField txtPasswordCashier;

    @FXML
    private void onSignOff() {
        browseWindow("/startup.fxml", "Banco - Inicio");
    }

    private void browseWindow(String nameFileFxml, String titleWindow) {
        try {
            Stage currentStage = (Stage) txtCashierName.getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(getClass().getResource(nameFileFxml));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle(titleWindow);
            stage.show();

            currentStage.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
