package fxReseptikirja;

import javafx.application.Platform;
import javafx.fxml.FXML;
import fi.jyu.mit.fxgui.*;
/**
 *
 * Luokka k‰yttˆliittym‰n tapahtumien hoitamiseksi
 * @author Atte Sarkonen & Petri Lukin
 * @version 26.5.2016
 *
 */
public class ReseptikirjaController {
	/**
     * K‰sitell‰‰n uuden reseptin lis‰‰minen
     */
	@FXML private void handleUusiResepti() {
        Dialogs.showMessageDialog("Ei osata viel‰ lis‰t‰");
    }

    /**
     * Lis‰t‰‰n ruoka-aine
     */
    @FXML private void handleLisaaruokaaine(){
    	Dialogs.showMessageDialog("No ei pysty viel‰ kuule lis‰‰m‰n safkoja, syˆ porkkanaa saatana");
    }
    
    @FXML private void handleTallennaResepti(){
    	Dialogs.showInputDialog("Kirjoita reseptin nimi", "");
    }
	
    @FXML private void handleApua(){
    	Dialogs.showMessageDialog("Etkˆ osaa k‰ytt‰‰ t‰t‰? No ei kuule oo mun ongelma");
    }
    
	/**
     * Tarkistetaan onko tallennus tehty
     * @return true jos saa sulkaa sovelluksen, false jos ei
     */
    public boolean voikoSulkea() {
        tallenna();
        return true;
    }
	
	
	/**
     * K‰sitell‰‰n tallennusk‰sky
     */
    @FXML private void handleTallenna() {
        tallenna();
    }
    
    
    /**
     * K‰sitell‰‰n lopetusk‰sky
     */
    @FXML private void handleLopeta() {
        tallenna();
        Platform.exit();
    }

    
    /**
     * Tietojen tallennus
     */
    private void tallenna() {
        Dialogs.showMessageDialog("Tallennetetaan! Mutta ei toimi viel‰");
    }
    

    

}


