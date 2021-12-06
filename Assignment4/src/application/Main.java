package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;




public class Main extends Application
{

	@Override
    public void start(Stage stage) throws Exception 
	{
        Parent root1 = FXMLLoader.load(getClass().getResource("menu.fxml"));
       
       
        
       
        Scene scene1 = new Scene(root1);
        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.setScene(scene1);
        stage.show();
       

       
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}





