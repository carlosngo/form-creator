/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Dialog;

import javafx.scene.control.Alert;

/**
 *
 * @author user
 */
public class AlertController {

    public static void showAlert(String title, String header, String content, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);

        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);

        alert.getDialogPane().getStylesheets().add("/View/Interface/material-fx-v0_3.css");
        alert.getDialogPane().getStylesheets().add("/View/Interface/materialfx-toggleswitch.css");

        alert.showAndWait();
    }
}
