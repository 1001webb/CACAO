/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author chris
 */
public class LobbyController implements Initializable {

    @FXML
    private Button btn_game;
    @FXML
    private Button btn_listo;
    @FXML
    private Button btn_rojo;
    @FXML
    private Button btn_azul;
    @FXML
    private Button btn_amarillo;
    @FXML
    private Button btn_blanco;
    
    String color;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  

    @FXML
    private void click(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/GameVista.fxml"));
            Parent root = loader.load();
        
            GameController controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(LobbyController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void click_listo(ActionEvent event) {
        
    }

    @FXML
    private void click_rojo(ActionEvent event) {
        color = "rojo";
    }

    @FXML
    private void click_azul(ActionEvent event) {
        color = "azul";
    }

    @FXML
    private void click_amarillo(ActionEvent event) {
        color = "amarillo";
    }

    @FXML
    private void click_blanco(ActionEvent event) {
        color = "blanco";
    }
    
}
