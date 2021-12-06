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

public class discount_calc_controller {
    
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
    private Button decimal;


    @FXML
    private Button equals;

    
    @FXML
    private Button zero;

    
    @FXML
    private Button clear;

    @FXML
    private Button next;

    
  
   
    float Price;
    float Discount;
    float ans;
    float save;
    
   String prevStr="";
    
    
    @FXML
    
    
    private void handleButtonAction(ActionEvent event) 
    {
        String str = ((Labeled)event.getSource()).getText();
        lower_box.setText(lower_box.getText()+str);
        upper_box.setText(prevStr+str);
        prevStr = upper_box.getText();
    }
    
    
    
    
    
    
    @FXML
    private void next()
    {
    	
    	
        	  Price=Float.parseFloat(lower_box.getText());
            
             
              upper_box.setText(prevStr+"->");
              prevStr = upper_box.getText();
            lower_box.setText("");
          
    }
    
    
  
     
    @FXML
    private void equals()
    
    {
    	
    	
    	  Discount=Float.parseFloat(lower_box.getText());

    	  	Discount = Discount/100;
    	  
                 
          save= Discount*Price;    
    	  
          ans = Price - save;  
          
          
              System.out.println(Discount);
              System.out.println(ans);
              System.out.println(save);
              
             lower_box.setText("You save: " + save + " Final Price: "+ ans);
              
             
}
 
    
    @FXML
    private void clearText(){
    	lower_box.setText("");
    	upper_box.setText("");
        prevStr="";
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