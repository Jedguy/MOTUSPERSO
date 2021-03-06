package motus.vue;


import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import motus.vue.MainApp;

public class VuePrincipaleController {
	
	@FXML
	private void exitButtonOnAction(ActionEvent event){
	        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();      
	}
	
	@FXML
	private void bParametre(){
		mainApp.afficheVue("Parametres.fxml");
	}
	
	@FXML
	private void bJouer(){
		mainApp.afficheVue("VuePartie.fxml");
	}
	
	private MainApp mainApp;

	/**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
	
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

    }
	
}