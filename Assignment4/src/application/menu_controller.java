package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class menu_controller 

{

	@FXML
	Button basic;
	

	@FXML
	Button bmi;


	@FXML
	Button disc;
	

	@FXML
	Button invest;
	

	@FXML
	Button age;
	

	@FXML
	Button curr;
	
	
	
	
	
	
	@FXML
	 public void basic_calc() throws Exception 
		{
		
		
		Stage stage = (Stage) basic.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("basic_calc.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }


	

	@FXML
	 public void bmi_calc() throws Exception 
		{
		
		
		Stage stage = (Stage) bmi.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("BMI_calc.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	

	@FXML
	 public void invest_calc() throws Exception 
		{
		
		
		Stage stage = (Stage) invest.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("investment_calc.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void disc_calc() throws Exception 
		{
		
		
		Stage stage = (Stage) disc.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("discount_calc.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }

	

	@FXML
	 public void age_calc() throws Exception 
		{
		
		
		Stage stage = (Stage) age.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("age_calc.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }

	
	

	@FXML
	 public void curr_calc() throws Exception 
		{
		
		
		Stage stage = (Stage) curr.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("currency_calc.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
}
