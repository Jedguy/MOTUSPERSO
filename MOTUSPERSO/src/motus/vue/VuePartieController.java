package motus.vue;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class VuePartieController {

	@FXML
	private Label lJoueur1;
	
	@FXML
	private Label lJoueur2;
	
	@FXML
	private GridPane gJoueur1;
	
	@FXML
	private GridPane gJoueur2;
	
	private MainApp mainApp;
	
	@FXML
	private void initialize() {
	
		TextField TField0 =  new TextField("");
		
		TextField TField1 = new TextField("C");
		TextField TField2 = new TextField("H");
		TextField TField3 = new TextField("I");
		TextField TField4 = new TextField("B");
		TextField TField5 = new TextField("R");
		TextField TField6 = new TextField("E");
		TextField TField7 = new TextField("E");
		TextField TField11 = new TextField("C");
		
		//textField textField8 = new textField("E");
		//textField textField9 = new textField("E");
		
        
    gJoueur1.add(TField1, 0, 0);
    gJoueur1.add(TField2, 1, 0);
    gJoueur1.add(TField3, 2, 0);
    gJoueur1.add(TField4, 3, 0);
    gJoueur1.add(TField5, 4, 0);
    gJoueur1.add(TField6, 5, 0);
    gJoueur1.add(TField7, 6, 0);
    
    //gJoueur1.add(TField11, 0, 1);
    
    if (TField1.getText().equals(TField11.getText())){
    	gJoueur1.add(TField0, 0, 2);    	
    }
    else {
    	gJoueur1.add(TField0, 0, 2);
    }
    

    //Le gridpane peut dépasser la limite que nous mettons dans SceneBuilder
    //gJoueur1.add(textField8, 7, 0);
    //gJoueur1.add(textField9, 8, 0);
    
    
		
	}
	
	
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;   
        
    }
}
