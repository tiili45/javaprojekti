/**
 * 
 */
package fxLenkkikalenteri;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import fi.jyu.mit.fxgui.ModalControllerInterface;
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
    
    /*
     * Kirjautumis-ikkunan 2 buttonia, avautuvan luo uusi kalenteri ikkunan 1 button
     */
    @FXML
    private Button avaaKalenteriButton;
    
    @FXML
    private Button luoUusiKalenteriButton;
    
    @FXML
    private Button ikkunaLuoKalenteriButton;
    
    
    /*
     * Kirjautuminen ikkunan avaa kalenteri buttonin toiminnot, kysyy ensin tiedoston
     * mikä halutaan avata ja sitten avaa kalenterin pääikkunan.
     */
    @FXML
    void handleAvaaKalenteri() {
        //FileChooser fileChooser = new FileChooser();
        //fileChooser.setTitle("Avaa tiedosto"); 
        //fileChooser.getExtensionFilters().add(
                //new ExtensionFilter("Dat tiedostot", "*.dat"));
        //File valittuTiedosto = fileChooser.showOpenDialog(null);
        //avaaKalenteriButton.getParent().getScene().getWindow()
        //if (valittuTiedosto != null) {
            try {
                BorderPane ikkuna = (BorderPane)FXMLLoader.load(getClass().getResource("Lenkkikalenteri.fxml"));
                Scene scene2 = new Scene(ikkuna,820,500);
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

        //}   //else {
                //Dialogs.showMessageDialog("tiedostoa ei voi avata, valitse toinen tiedosto");
        //}

    }

    /*
     * Kirjautuminen-ikkunan luo uusi kalenteri -buttonin toiminnot, avaa 
     * ikkunan kalenterin luomista varten. 
     */
    @FXML
    void handleLuoKalenteri() {
        try {
            BorderPane paneluouusi = (BorderPane)FXMLLoader.load(getClass().getResource("Luouusikalenteri.fxml"));
            Scene sceneluouusi = new Scene(paneluouusi,200,150);
            sceneluouusi.getStylesheets().add(getClass().getResource("lenkkikalenteri.css").toExternalForm());
            Stage stageluouusi = new Stage();
            stageluouusi.setScene(sceneluouusi);
            stageluouusi.setResizable(false);
            stageluouusi.getIcons().add(new Image("/juoksija.png"));
            stageluouusi.setTitle("Uusi kalenteri");
            stageluouusi.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
    
    /*
     * Luo uusi kalenteri-ikkunan luo-button toiminnot
     */
    @FXML
    void handleLuoUusiKalenteri() {
        Dialogs.showMessageDialog("ei toimi vielä");
        Stage luouusi = (Stage) ikkunaLuoKalenteriButton.getScene().getWindow();
        luouusi.close();
    }
    
    /** Automaattisesti luodut metodit **/

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
