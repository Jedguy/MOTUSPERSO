package motus.vue;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MOTUS");

        initRootLayout();

        showVuePrincipale();
        
    }
    

	/**
	 * Constructor
	 */
	public MainApp() {
		// Add some sample data
	
	}

	/**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
        	//Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            //Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showVuePrincipale() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("VuePrincipale.fxml"));
            AnchorPane vuePrincipale = (AnchorPane) loader.load();
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(vuePrincipale);
            
            // Give the controller access to the main app.
            VuePrincipaleController controller = loader.getController();
            controller.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficheVue(String laVue) {
        try {
           // Charge la vue laVue.
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(MainApp.class.getResource(laVue));
           AnchorPane vuePrincipale = (AnchorPane) loader.load();
           
           rootLayout.setCenter(vuePrincipale);

        } catch (IOException e) {
           e.printStackTrace();
        }
     }
    
    /**
	 * Returns the main stage.
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

    public static void main(String[] args) {
        launch(args);
    }
}