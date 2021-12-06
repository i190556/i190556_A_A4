package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.StringTokenizer;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class age_calc_controller

{

	  
    @FXML
    private Button back;
	@FXML
	Button calculate;
	
	@FXML
	TextField dob_window= new TextField();
	
	@FXML
	TextField day_window= new TextField();
	
	@FXML
	TextField month_window= new TextField();
	
	@FXML
	TextField yr_window= new TextField();
	
	String d,m,y;
	
    @FXML
    private void calculate() throws ParseException 
    
    {
      
    	String dt = dob_window.getText();
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(dt);
        
        
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();

        Period p = Period.between(givenDate, LocalDate.now());
    	 
    	int day = p.getDays();
    	int month = p.getMonths();
    	int year = p.getYears();

    	day_window.setText(Integer.toString(day));

    	month_window.setText(Integer.toString(month));
    	
    	yr_window.setText(Integer.toString(year));

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