package fxLenkkikalenteri;

import java.io.File;
import java.io.IOException;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * @author juuso
 * @version 17 Jan 2022
 * pääikkunan kontrolleri
 */
public class LenkkikalenteriGUIController {
    
    @FXML 
    private MenuItem avaaTiedostoValikko;
    
    @FXML
    private MenuItem avaaTilastoValikko;
	
    @FXML
    private HBox paaIkkuna;
    
    @FXML
    private MenuBar ylaValikko;
    
    /* Yläpalkin toiminnot */
    
    @FXML
    void handleAvaaTiedostoValikko() {
      FileChooser fileChooser = new FileChooser();
      fileChooser.setTitle("Avaa tiedosto"); 
      fileChooser.getExtensionFilters().add(
      new ExtensionFilter("Dat tiedostot", "*.dat"));
      File valittuTiedosto = fileChooser.showOpenDialog(null);
      if (valittuTiedosto != null) {
          return;
      }
      Dialogs.showMessageDialog("tiedostoa ei voi avata, valitse toinen tiedosto");          
    }
    
    @FXML
    void handleAvaaTilastoValikko() {
        try {
            BorderPane panenaytatilastot = (BorderPane)FXMLLoader.load(getClass().getResource("Tilastot.fxml"));
            Scene scenenaytatilastot = new Scene(panenaytatilastot,400,300);
            scenenaytatilastot.getStylesheets().add(getClass().getResource("lenkkikalenteri.css").toExternalForm());
            Stage stagenaytatilastot = new Stage();
            stagenaytatilastot.setScene(scenenaytatilastot);
            stagenaytatilastot.setResizable(false);
            stagenaytatilastot.getIcons().add(new Image("/juoksija.png"));
            stagenaytatilastot.setTitle("Tilastot");
            stagenaytatilastot.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    @FXML
    void handleAvaaTiedotValikko() {
        try {
            BorderPane panenaytatiedot = (BorderPane)FXMLLoader.load(getClass().getResource("Tietoja.fxml"));
            Scene scenenaytatiedot = new Scene(panenaytatiedot,250,200);
            scenenaytatiedot.getStylesheets().add(getClass().getResource("lenkkikalenteri.css").toExternalForm());
            Stage stagenaytatiedot = new Stage();
            stagenaytatiedot.setScene(scenenaytatiedot);
            stagenaytatiedot.setResizable(false);
            stagenaytatiedot.getIcons().add(new Image("/juoksija.png"));
            stagenaytatiedot.setTitle("Tilastot");
            stagenaytatiedot.show();
            } catch (IOException e) {
                e.printStackTrace();
            }    
    }
    

    @FXML
    void handleTulostaValikko() {
        try {
            BorderPane panetulosta = (BorderPane)FXMLLoader.load(getClass().getResource("Tulosta.fxml"));
            Scene scenetulosta = new Scene(panetulosta,300,400);
            scenetulosta.getStylesheets().add(getClass().getResource("lenkkikalenteri.css").toExternalForm());
            Stage stagetulosta = new Stage();
            stagetulosta.setScene(scenetulosta);
            stagetulosta.setResizable(false);
            stagetulosta.getIcons().add(new Image("/juoksija.png"));
            stagetulosta.setTitle("Tulosta");
            stagetulosta.show();
            } catch (IOException e) {
                e.printStackTrace();
            }    
    }
    @FXML
    void handleLisaaLenkki() {
        try {
            BorderPane panelisaalenkki = (BorderPane)FXMLLoader.load(getClass().getResource("Lisaalenkki.fxml"));
            Scene scenelisaalenkki = new Scene(panelisaalenkki,324,485);
            scenelisaalenkki.getStylesheets().add(getClass().getResource("lenkkikalenteri.css").toExternalForm());
            Stage stagelisaalenkki = new Stage();
            stagelisaalenkki.setScene(scenelisaalenkki);
            stagelisaalenkki.setResizable(false);
            stagelisaalenkki.getIcons().add(new Image("/juoksija.png"));
            stagelisaalenkki.setTitle("Lisää lenkki");
            stagelisaalenkki.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        /* ModalController.showModal(KirjautuminenGUIController.class.getResource("Lisaalenkki.fxml"),
                "Lisää lenkki", null, ""); */
    }

    @FXML
    void handleLisaaLaji() {
        try {
            BorderPane panelisaalaji = (BorderPane)FXMLLoader.load(getClass().getResource("Lisaalaji.fxml"));
            Scene scenelisaalaji = new Scene(panelisaalaji,300,200);
            scenelisaalaji.getStylesheets().add(getClass().getResource("lenkkikalenteri.css").toExternalForm());
            Stage stagelisaalaji = new Stage();
            stagelisaalaji.setScene(scenelisaalaji);
            stagelisaalaji.setResizable(false);
            stagelisaalaji.getIcons().add(new Image("/juoksija.png"));
            stagelisaalaji.setTitle("Lisää uusi laji");
            stagelisaalaji.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
