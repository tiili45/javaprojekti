package fxLenkkikalenteri;

import java.io.IOException;

import fi.jyu.mit.fxgui.ModalController;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author juuso
 * @version 17 Jan 2022
 * pääikkunan kontrolleri
 */
public class LenkkikalenteriGUIController {
	
    @FXML
    private HBox paaIkkuna;
    
    @FXML
    private MenuBar ylaValikko;
    
    @FXML
    void handleLisaaLenkki() {
        try {
            BorderPane ikkuna2 = (BorderPane)FXMLLoader.load(getClass().getResource("Lisaalenkki.fxml"));
            Scene scene3 = new Scene(ikkuna2,324,485);
            scene3.getStylesheets().add(getClass().getResource("lenkkikalenteri.css").toExternalForm());
            Stage lisaalenkki = new Stage();
            lisaalenkki.setScene(scene3);
            lisaalenkki.setResizable(false);
            lisaalenkki.getIcons().add(new Image("/juoksija.png"));
            lisaalenkki.setTitle("Lisää lenkki");
            lisaalenkki.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        /* ModalController.showModal(KirjautuminenGUIController.class.getResource("Lisaalenkki.fxml"),
                "Lisää lenkki", null, ""); */
    }

    @FXML
    void handleLisaaLaji() {
        ModalController.showModal(KirjautuminenGUIController.class.getResource("Lisaalaji.fxml"),
                "Lisää laji", null, "");
    }
    
    @FXML
    void handleLisaaReitti() {
        ModalController.showModal(KirjautuminenGUIController.class.getResource("Lisaareitti.fxml"),
                "Lisää reitti", null, "");
    }
    
    @FXML
    void handleLopeta() {
        Platform.exit();
    }
}
