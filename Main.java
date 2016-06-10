package fxReseptikirja;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

/**
 * Pääohjelma Reseptikirja-ohjelman käynnistämiseksi
 * 
 * @author Atte Sarkonen & Petri Lukin 
 * @version 26.5.2016
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	    try {
	        FXMLLoader ldr = new FXMLLoader(getClass().getResource("ReseptikirjaGUIView.fxml")); // korjaa tiedostonimi
	        final Pane root = (Pane)ldr.load();
	        final ReseptikirjaController kerhoCtrl = (ReseptikirjaController)ldr.getController(); // korjaa nimet
	        
	        final Scene scene = new Scene(root);
	        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // korjaa tiedostonimi
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Reseptikirja"); // korjaa title
	        
	        Platform.setImplicitExit(false); // jos tämän laittaa, pitää itse sulkea
	        
	        primaryStage.setOnCloseRequest((event) -> {
	            // Kutsutaan voikoSulkea-metodia
	            if ( !kerhoCtrl.voikoSulkea() ) event.consume(); // korjaa nimi
	        });
	        
	        primaryStage.show();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
	/**
	 * Käynnistää käyttöliittymän
	 * @param args komentorivin parametrit
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
