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

public class basic_calc_controller 
{
    
    @FXML
    private TextField lower_box,upper_box;
       
 
    
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
    private Button zero;

    @FXML
    private Button d_zero;
    
    @FXML
    private Button clear;

    @FXML
    private Button plus;

    @FXML
    private Button decimal;
    
    @FXML
    private Button mult;

    @FXML
    private Button minus;

    
    @FXML
    private Button back;
    
    
    @FXML
    private Button division;
    
    private char operation;
    
    double val_1;
    double val_2;
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
    private void add()
    
    {
        try
        
        {
              val_1 = Double.parseDouble(lower_box.getText());
              operation = '+' ;
              upper_box.setText(complete+"+");
              complete = upper_box.getText();
          }
        
        catch(NumberFormatException e)
        
        {
              System.out.println("Enter value First");
        }
        
        finally
        {
        	  lower_box.setText("");
          }
    }
    
    @FXML
    private void substract()
    
    {
          try
          
          {
              val_1 = Double.parseDouble(lower_box.getText());
              operation = '-' ;
              upper_box.setText(complete+"-");
              complete = upper_box.getText();
          }
          
          catch(NumberFormatException e)
          {
              System.out.println("Enter value First");
          }
          
          finally{
        	  lower_box.setText("");
          }
    }
    
    @FXML
    private void multiply(){
      try{
            val_1 = Double.parseDouble(lower_box.getText());
            operation = '*' ;
            upper_box.setText(complete+"X");
            complete = upper_box.getText();
          }
      
      catch(NumberFormatException e)
      
      {
            System.out.println("Enter value First");
      }
      
      finally
      {
        	lower_box.setText("");
        }
    }
   
    
    @FXML
    private void divide()
    {
         try{
        	 
            val_1 = Double.parseDouble(lower_box.getText());
            operation = '/' ;
            upper_box.setText(complete+"÷");
            complete = upper_box.getText();
        }
         
         catch(NumberFormatException e)
         
         {
            System.out.println("Enter value First");
        }
         finally
         
         {
        	lower_box.setText("");
        }
    }
   
    
   
    @FXML
    private void equals(){
  
              val_2 = Double.parseDouble(lower_box.getText());
              
              
              if (operation == '+')
              {
            	  ans = val_1 + val_2;
            	  lower_box.setText("="+ans);
              }
              
              else if (operation == '-')
              {
            	  ans = val_1 - val_2;
            	  lower_box.setText("="+ans);  
              }
              
              else if (operation == '*')
              {
            	  ans = val_1 * val_2;
            	  lower_box.setText("="+ans);  
              }
              
              else if (operation == '/')
              {
            	  ans = val_1 / val_2; 
            	  lower_box.setText("="+ans);  
              }
              
              
             
}
 
    @FXML
    private void clear()
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