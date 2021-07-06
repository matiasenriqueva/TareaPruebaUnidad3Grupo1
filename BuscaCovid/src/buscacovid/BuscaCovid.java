/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacovid;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class BuscaCovid extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/ventanaPrincipal.fxml"));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setTitle("Busca Covid");
            stage.getIcons().add(new Image("/recurso/coronavirus.png"));
            
            stage.show();
        }catch(Exception e){
            System.out.println("Error carga de vista principal");
        };
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
