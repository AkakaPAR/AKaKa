package application.fxml;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

/**
 * Контроллер класс графического интерфейса
 *
 * @author Паша
 */
public class ControllerClass {

  ObservableList<String> CBL = FXCollections.observableArrayList( "Вихрь", "Источник", "-----" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

  @SuppressWarnings( "rawtypes" )
  @FXML
  private ChoiceBox thirdCB;

  @SuppressWarnings( "unchecked" )
  @FXML
  private void initialize() {
    firstCB.setValue( "Вихрь" ); //$NON-NLS-1$
    secondCB.setValue( "-----" ); //$NON-NLS-1$
    thirdCB.setValue( "-----" ); //$NON-NLS-1$
    forthCB.setValue( "-----" ); //$NON-NLS-1$
    firstCB.setItems( CBL );
    secondCB.setItems( CBL );
    thirdCB.setItems( CBL );
    forthCB.setItems( CBL );
    firstaccordeon.setText( (String)firstCB.getValue() );
    secondaccordeon.setText( (String)secondCB.getValue() );
    thirdaccordeon.setText( (String)thirdCB.getValue() );
    fourthaccordeon.setText( (String)forthCB.getValue() );
    Givename1( null );
    Givename2( null );
    Givename3( null );
    Givename3( null );
  }

  @FXML
  private TextField firstYtext;

  @FXML
  private TextField forthXtext;

  @SuppressWarnings( "rawtypes" )
  @FXML
  private ChoiceBox secondCB;

  @FXML
  private TextField thirdYtext;

  @FXML
  private Button Paint;

  @SuppressWarnings( "rawtypes" )
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

  @SuppressWarnings( "rawtypes" )
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
  void Givename1( @SuppressWarnings( "unused" ) MouseEvent event) {
    String name = new String();
    name = (String)firstCB.getValue();
    firstaccordeon.setText( name );
    if( name.equals( "Вихрь" ) ) { //$NON-NLS-1$
      firstP.setText( "Циркуляция" ); //$NON-NLS-1$
    }
    else {
      firstP.setText( "Мощность" ); //$NON-NLS-1$
    }

    double dname;
    if( firstPtext.getText().equals( "" ) ) { //$NON-NLS-1$
      dname = 0;
    }
    else {
      try {
        name = firstPtext.getText();
        dname = Double.parseDouble( name.toString() );
      }
      catch( Exception e ) {
        dname = 0;
      }
    }
    name = Double.toString( dname );
    firstPtext.setText( name );

    if( firstXtext.getText().equals( "" ) ) { //$NON-NLS-1$
      dname = 0;
    }
    else {
      try {
        name = firstXtext.getText();
        dname = Double.parseDouble( name.toString() );
      }
      catch( Exception e ) {
        dname = 0;
      }
    }
    name = Double.toString( dname );
    firstXtext.setText( name );

    if( firstYtext.getText().equals( "" ) ) { //$NON-NLS-1$
      dname = 0;
    }
    else {
      try {
        name = firstYtext.getText();
        dname = Double.parseDouble( name.toString() );
      }
      catch( Exception e ) {
        dname = 0;
      }
    }
    name = Double.toString( dname );
    firstYtext.setText( name );
  }

  @FXML
  void Givename2( @SuppressWarnings( "unused" ) MouseEvent event) {
    String name = new String();
    name = (String)secondCB.getValue();
    secondaccordeon.setText( name );
    if( name.equals( "Вихрь" ) ) { //$NON-NLS-1$
      secondP.setText( "Циркуляция" ); //$NON-NLS-1$
    }
    else {
      secondP.setText( "Мощность" ); //$NON-NLS-1$
    }
  }

  @FXML
  void Givename3( @SuppressWarnings( "unused" ) MouseEvent event) {
    String name = new String();
    name = (String)thirdCB.getValue();
    thirdaccordeon.setText( name );
    if( name.equals( "Вихрь" ) ) { //$NON-NLS-1$
      thirdP.setText( "Циркуляция" ); //$NON-NLS-1$
    }
    else {
      thirdP.setText( "Мощность" ); //$NON-NLS-1$
    }
  }

  @FXML
  void Givename4( @SuppressWarnings( "unused" ) MouseEvent event) {
    String name = new String();
    name = (String)forthCB.getValue();
    fourthaccordeon.setText( name );
    if( name.equals( "Вихрь" ) ) { //$NON-NLS-1$
      forthP.setText( "Циркуляция" ); //$NON-NLS-1$
    }
    else {
      forthP.setText( "Мощность" ); //$NON-NLS-1$
    }
  }

  @FXML
  void Paint( @SuppressWarnings( "unused" ) ActionEvent event) {
    // Будет продолжено
  }

}
