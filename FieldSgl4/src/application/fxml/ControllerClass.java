package application.fxml;

import application.fxml.SglDsc.SglType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextAlignment;

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
    firstSgl = SglType.VORTEX;
    secondCB.setValue( "-----" ); //$NON-NLS-1$
    secondSgl = SglType.SOURCE;
    thirdCB.setValue( "-----" ); //$NON-NLS-1$
    thirdSgl = SglType.SOURCE;
    fourthCB.setValue( "-----" ); //$NON-NLS-1$
    fourthSgl = SglType.SOURCE;
    firstCB.setItems( CBL );
    secondCB.setItems( CBL );
    thirdCB.setItems( CBL );
    fourthCB.setItems( CBL );
    NetStepX.setText( "0" ); //$NON-NLS-1$
    NetStepY.setText( "0" ); //$NON-NLS-1$
    firstPtext.setText( "0" ); //$NON-NLS-1$
    secondPtext.setText( "0" ); //$NON-NLS-1$
    thirdPtext.setText( "0" ); //$NON-NLS-1$
    fourthPtext.setText( "0" ); //$NON-NLS-1$
    firstXtext.setText( "0" ); //$NON-NLS-1$
    secondXtext.setText( "0" ); //$NON-NLS-1$
    thirdXtext.setText( "0" ); //$NON-NLS-1$
    fourthXtext.setText( "0" ); //$NON-NLS-1$
    firstYtext.setText( "0" ); //$NON-NLS-1$
    secondYtext.setText( "0" ); //$NON-NLS-1$
    thirdYtext.setText( "0" ); //$NON-NLS-1$
    fourthYtext.setText( "0" ); //$NON-NLS-1$
    firstaccordeon.setText( (String)firstCB.getValue() );
    secondaccordeon.setText( (String)secondCB.getValue() );
    thirdaccordeon.setText( (String)thirdCB.getValue() );
    fourthaccordeon.setText( (String)fourthCB.getValue() );
    Givename1( null );
    Givename2( null );
    Givename3( null );
    Givename3( null );
  }

  @FXML
  private TextField firstYtext;

  @FXML
  private TextField fourthXtext;

  @SuppressWarnings( "rawtypes" )
  @FXML
  private ChoiceBox secondCB;

  @FXML
  private TextField thirdYtext;

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
  private Label fourthP;

  @FXML
  private Label thirdP;

  @FXML
  private TextField fourthYtext;

  @FXML
  private TextField secondPtext;

  @FXML
  private TextField thirdXtext;

  @FXML
  private TextField firstPtext;

  @FXML
  private TextField fourthPtext;

  @FXML
  private TextField secondXtext;

  @SuppressWarnings( "rawtypes" )
  @FXML
  private ChoiceBox fourthCB;

  @FXML
  private TitledPane firstaccordeon;

  @FXML
  private TitledPane secondaccordeon;

  @FXML
  private TitledPane thirdaccordeon;

  @FXML
  private TitledPane fourthaccordeon;

  @FXML
  private TextField NetStepX;

  @FXML
  private TextField NetStepY;

  @FXML
  private Button Paint;

  @FXML
  private Canvas canvas;

  private SglType firstSgl;

  private SglType secondSgl;

  private SglType thirdSgl;

  private SglType fourthSgl;

  @FXML
  void Givename1( @SuppressWarnings( "unused" ) MouseEvent event) {
    String name = new String();
    name = (String)firstCB.getValue();
    firstaccordeon.setText( name );
    if( name.equals( "Вихрь" ) ) { //$NON-NLS-1$
      firstP.setText( "Циркуляция" ); //$NON-NLS-1$
      firstSgl = SglType.VORTEX;
    }
    else {
      firstP.setText( "Мощность" ); //$NON-NLS-1$
      firstSgl = SglType.SOURCE;
    }
  }

  @FXML
  void Givename2( @SuppressWarnings( "unused" ) MouseEvent event) {
    String name = new String();
    name = (String)secondCB.getValue();
    secondaccordeon.setText( name );
    if( name.equals( "Вихрь" ) ) { //$NON-NLS-1$
      secondP.setText( "Циркуляция" ); //$NON-NLS-1$
      secondSgl = SglType.VORTEX;
    }
    else {
      secondP.setText( "Мощность" ); //$NON-NLS-1$
      secondSgl = SglType.SOURCE;
    }
  }

  @FXML
  void Givename3( @SuppressWarnings( "unused" ) MouseEvent event) {
    String name = new String();
    name = (String)thirdCB.getValue();
    thirdaccordeon.setText( name );
    if( name.equals( "Вихрь" ) ) { //$NON-NLS-1$
      thirdP.setText( "Циркуляция" ); //$NON-NLS-1$
      thirdSgl = SglType.VORTEX;
    }
    else {
      thirdP.setText( "Мощность" ); //$NON-NLS-1$
      thirdSgl = SglType.SOURCE;
    }
  }

  @FXML
  void Givename4( @SuppressWarnings( "unused" ) MouseEvent event) {
    String name = new String();
    name = (String)fourthCB.getValue();
    fourthaccordeon.setText( name );
    if( name.equals( "Вихрь" ) ) { //$NON-NLS-1$
      fourthP.setText( "Циркуляция" ); //$NON-NLS-1$
      fourthSgl = SglType.VORTEX;
    }
    else {
      fourthP.setText( "Мощность" ); //$NON-NLS-1$
      fourthSgl = SglType.SOURCE;
    }
  }

  SingularityList sgl = new SingularityList();

  @FXML
  void toPaint( @SuppressWarnings( "unused" ) ActionEvent event) {
    String name = new String();
    name = (String)firstCB.getValue();
    @SuppressWarnings( "unused" )
    double dname;
    try {
      name = NetStepX.getText();
      dname = Double.parseDouble( name.toString() );
      name = NetStepY.getText();
      dname = Double.parseDouble( name.toString() );
      name = firstPtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = firstXtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = firstYtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = secondPtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = secondXtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = secondYtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = thirdPtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = thirdXtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = thirdYtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = fourthPtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = fourthXtext.getText();
      dname = Double.parseDouble( name.toString() );
      name = fourthYtext.getText();
      dname = Double.parseDouble( name.toString() );
      GraphicsContext gc = canvas.getGraphicsContext2D();
      gc.clearRect( 0, 0, canvas.getWidth(), canvas.getHeight() );
      SglDsc firstsgl = new SglDsc( Double.parseDouble( firstXtext.getText() ),
          Double.parseDouble( firstYtext.getText() ), Double.parseDouble( firstPtext.getText() ), firstSgl );
      SglDsc secondsgl = new SglDsc( Double.parseDouble( secondXtext.getText() ),
          Double.parseDouble( secondYtext.getText() ), Double.parseDouble( secondPtext.getText() ), secondSgl );
      SglDsc thirdsgl = new SglDsc( Double.parseDouble( thirdXtext.getText() ),
          Double.parseDouble( thirdYtext.getText() ), Double.parseDouble( thirdPtext.getText() ), thirdSgl );
      SglDsc fourthsgl = new SglDsc( Double.parseDouble( fourthXtext.getText() ),
          Double.parseDouble( fourthYtext.getText() ), Double.parseDouble( fourthPtext.getText() ), fourthSgl );
      SingularityList.list.add( firstsgl );
      SingularityList.list.add( secondsgl );
      SingularityList.list.add( thirdsgl );
      SingularityList.list.add( fourthsgl );

    }
    catch( Exception e ) {
      GraphicsContext gc = canvas.getGraphicsContext2D();
      gc.setTextAlign( TextAlignment.CENTER );
      gc.setTextBaseline( VPos.CENTER );
      gc.fillText( "Ошибка формата", Math.round( canvas.getWidth() / 2 ), Math.round( canvas.getHeight() / 2 ) ); //$NON-NLS-1$
    }
  }

}
