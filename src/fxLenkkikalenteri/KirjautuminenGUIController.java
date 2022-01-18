/**
 * 
 */
package fxLenkkikalenteri;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import fi.jyu.mit.fxgui.ModalController;
import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * @author juuso
 * @version 17 Jan 2022
 * kirjautumis-ikkunan kontrolleri
 */
public class KirjautuminenGUIController implements Initializable, ModalControllerInterface<String> {
    
    @FXML
    private Button avaaKalenteriButton;
    
    @FXML
    private Button ikkunaLuoKalenteriButton;
    
    @FXML
    void handleAvaaKalenteri() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Avaa tiedosto"); 
        fileChooser.getExtensionFilters().add(
                new ExtensionFilter("Dat tiedostot", "*.dat"));
        fileChooser.showOpenDialog(avaaKalenteriButton.getParent().getScene().getWindow());
        try {
        BorderPane ikkuna = (BorderPane)FXMLLoader.load(getClass().getResource("Lenkkikalenteri.fxml"));
        Scene scene2 = new Scene(ikkuna,800,500);
        scene2.getStylesheets().add(getClass().getResource("lenkkikalenteri.css").toExternalForm());
        Stage paaikkuna = new Stage();
        paaikkuna.setScene(scene2);
        paaikkuna.setResizable(false);
        paaikkuna.getIcons().add(new Image("/juoksija.png"));
        paaikkuna.setTitle("Lenkkikalenteri");
        paaikkuna.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage kirjautuminen = (Stage) avaaKalenteriButton.getScene().getWindow();
        kirjautuminen.close();


    }

    @FXML
    void handleLuoKalenteri() {
        ModalController.showModal(KirjautuminenGUIController.class.getResource("Luouusikalenteri.fxml"),
                "Luo uusi kalenteri", null, "");

    }
    
    @FXML
    void handleIkkunaLuoKalenteri() {
        //
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getResult() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void handleShown() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setDefault(String arg0) {
        // TODO Auto-generated method stub
        
    }
}
