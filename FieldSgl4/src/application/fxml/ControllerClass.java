package application.fxml;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;

public class ControllerClass {

	ObservableList<String> CBL = FXCollections.observableArrayList("Вихрь", "Источник", "-----");
	
    @SuppressWarnings("rawtypes")
	@FXML
    private ChoiceBox thirdCB;
    
    @SuppressWarnings("unchecked")
	@FXML
    private void initialize(){
    	firstCB.setValue("Вихрь");
    	secondCB.setValue("-----");
    	thirdCB.setValue("-----");
    	forthCB.setValue("-----");
    	firstCB.setItems(CBL);
    	secondCB.setItems(CBL);
    	thirdCB.setItems(CBL);
    	forthCB.setItems(CBL);
    	firstaccordeon.setText((String) firstCB.getValue());
        secondaccordeon.setText((String) secondCB.getValue());
        thirdaccordeon.setText((String) thirdCB.getValue());
        fourthaccordeon.setText((String) forthCB.getValue());
        Givename1(null);
        Givename2(null);
        Givename3(null);
        Givename3(null);
    }

    @FXML
    private TextField firstYtext;

    @FXML
    private TextField forthXtext;

    @FXML
    private ChoiceBox secondCB;

    @FXML
    private TextField thirdYtext;

    @FXML
    private Button Paint;

    @FXML
    private ChoiceBox firstCB;

    @FXML
    private Label firstP;

    @FXML
    private TextField thirdPtext;

    @FXML
    private TextField secondYtext;

    @FXML
    private Label secondP;

    @FXML
    private TextField firstXtext;

    @FXML
    private Label forthP;

    @FXML
    private Label thirdP;

    @FXML
    private TextField forthYtext;

    @FXML
    private TextField secondPtext;

    @FXML
    private TextField thirdXtext;

    @FXML
    private TextField firstPtext;

    @FXML
    private TextField forthPtext;

    @FXML
    private TextField secondXtext;

    @FXML
    private ChoiceBox forthCB;
    
    @FXML
    private TitledPane firstaccordeon;
    
    @FXML
    private TitledPane secondaccordeon;
    
    @FXML
    private TitledPane thirdaccordeon;
    
    @FXML
    private TitledPane fourthaccordeon;
    
    @FXML
    void Givename1(MouseEvent event) {
    	String name = new String();
    	name = (String) firstCB.getValue();
    	firstaccordeon.setText(name);
    	if(name.equals("Вихрь")){
    	     firstP.setText("Циркуляция");
    	}
    	else{
    		firstP.setText("Мощность");
    	}
    }
    
    @FXML
    void Givename2(MouseEvent event) {
    	String name = new String();
    	name = (String) secondCB.getValue();
    	secondaccordeon.setText(name);
    	if(name.equals("Вихрь")){
    	     secondP.setText("Циркуляция");
    	}
    	else{
    		secondP.setText("Мощность");
    	}
    }
    
    @FXML
    void Givename3(MouseEvent event) {
    	String name = new String();
    	name = (String) thirdCB.getValue();
    	thirdaccordeon.setText(name);
    	if(name.equals("Вихрь")){
    	     thirdP.setText("Циркуляция");
    	}
    	else{
    		thirdP.setText("Мощность");
    	}
    }
    
    @FXML
    void Givename4(MouseEvent event) {
    	String name = new String();
    	name = (String) forthCB.getValue();
    	fourthaccordeon.setText(name);
    	if(name.equals("Вихрь")){
    	     forthP.setText("Циркуляция");
    	}
    	else{
    		forthP.setText("Мощность");
    	}
    }
    
    @FXML
    void Paint(ActionEvent event) {
    }

}
