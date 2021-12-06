package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BMI_calc_controller 
{
    
    @FXML
    private TextField lower_box,upper_box;
       
    
    @FXML
    private Button back;
    

    @FXML
    private Button one;
    
    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;



    @FXML
    private Button five;

    
    @FXML
    private Button six;


    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button equals;

    @FXML
    private Button decimal;


    @FXML
    private Button zero;

    
    @FXML
    private Button clear;

    @FXML
    private Button next;

    
    
  
   
    double height;
    double weight;
    double ans;
    
   String complete="";
    
    
    @FXML
    
    
    private void handleButtonAction(ActionEvent event) 
    {
        String str = ((Labeled)event.getSource()).getText();
        lower_box.setText(lower_box.getText()+str);
        upper_box.setText(complete+str);
        complete = upper_box.getText();
    }
    
    
    
    
    
    
    @FXML
    private void next()
    {
        
              weight = Double.parseDouble(lower_box.getText());
             // operation = '+' ;
              upper_box.setText(complete+"->");
              complete = upper_box.getText();
            lower_box.setText("");
          
    }
    
    
  
     
    @FXML
    private void equals(){
  
              height = Double.parseDouble(lower_box.getText());
              
              height *= height;
      
             
              
              
              ans = weight/height;
              System.out.println(weight);
              System.out.println(height);
              System.out.println(ans);
              
              if (ans<=18.5)
            	  lower_box.setText(ans+" You are Underweight");
              
              else  if (ans>=18.6 && ans <=24.9)
            	  lower_box.setText(ans+" Normal BMI");
              
            
              else  if (ans>=25)
            	  lower_box.setText(ans+" You are Overweight");
              
              
             
}
 
    @FXML
    private void clearText()
    {
    	lower_box.setText("");
    	upper_box.setText("");
        complete="";
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