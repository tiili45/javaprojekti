package fxLenkkikalenteri;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.HBox;

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
    void handleLopeta() {
        Platform.exit();
    }
}
