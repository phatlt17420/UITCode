/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package p02_SuDungKeoTha;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author phatlt17420
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        System.out.println("code 24");
        
        Parent root = null;
        try {
            root = FXMLLoader.load(this.getClass().getResource("D:\\UITCode\\UITCode\\CongNgheJava\\Project\\Chuong08JavaFX_v2\\src\\p02_SuDungKeoTha\\FXML.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(NewFXMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Parent root = FXMLLoader.load(this.getClass().getResource("FXML.fxml"));
                
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
