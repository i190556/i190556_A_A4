package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class investment_calc_controller {

	@FXML
	Button calculate;
	
	  
    @FXML
    private Button back;
    
	@FXML
	Button clear;
	
	
	@FXML
	TextField investment= new TextField();
	
	@FXML
	TextField rate= new TextField();
	
	@FXML
	TextField duration= new TextField();
	
	@FXML
	TextField t_return= new TextField();

	@FXML
	TextField interest= new TextField();

	
	double calc=0;

	double ret=0;
	
	String complete="";
	
    @FXML
    private void calculate() 
    {
      
    	String in = investment.getText();
        String rt = rate.getText();


    	String dur = duration.getText();
      
        
        
    	double invest=Double.parseDouble(in);
    	double r =Double.parseDouble(rt);
    	double d =Double.parseDouble(dur);
    	
    	calc = ((invest)*(r/100)*d);
    	
    	ret = invest + calc;
    	
    	interest.setText(Double.toString(calc));
    	t_return.setText(Double.toString(ret));
    	
    	
    }
    
    

	@FXML
	 public void back() throws Exception 
		{
		
		
		Stage stage = (Stage) back.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("menu.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
    
    
}
