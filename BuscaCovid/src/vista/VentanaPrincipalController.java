/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Matias
 */
public class VentanaPrincipalController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Button botonJugar;
    
    private ObservableList<String> items;
    
    private String[] itemLista = {"Facil (9x9)", "Medio (16x16)","Dificil (32x32)"};
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        items = FXCollections.observableArrayList();
        items.addAll(itemLista);
        comboBox.setItems(items);
        comboBox.setValue(comboBox.getItems().get(0));
    }    

    @FXML
    private void cambio(ActionEvent event) {
    }

    @FXML
    private void fueraJugar(MouseEvent event) {
        botonJugar.setStyle("-fx-background-color:#ffffff");
    }

    @FXML
    private void sobreJugar(MouseEvent event) {
        botonJugar.setStyle("-fx-background-color:#f79595");
    }

    @FXML
    private void jugar(ActionEvent event) {
        if (comboBox.getSelectionModel().getSelectedItem().equalsIgnoreCase(itemLista[0])){
            try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/grillaFacil.fxml"));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Busca Covid");
            stage.getIcons().add(new Image("/recurso/coronavirus.png"));
             
            stage.show();
            
            Stage stageActual = (Stage) botonJugar.getScene().getWindow();
            stageActual.hide();
        }catch(Exception e){
            System.out.println("Error carga de vista principal");
        };            
        }
    }
    
}
