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
import javafx.scene.paint.Color;
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
    NetStepX.setText( "50" ); //$NON-NLS-1$
    NetStepY.setText( "50" ); //$NON-NLS-1$
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
  private CheckBox firstFree;

  @FXML
  private CheckBox secondFree;

  @FXML
  private CheckBox thirdFree;

  @FXML
  private CheckBox fourthFree;

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
      if( name.equals( "Источник" ) ) {
        firstP.setText( "Мощность" ); //$NON-NLS-1$
        firstSgl = SglType.SOURCE;
      }
      else {
        firstSgl = SglType.NO;
      }
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
      if( name.equals( "Источник" ) ) {
        secondP.setText( "Мощность" ); //$NON-NLS-1$
        secondSgl = SglType.SOURCE;
      }
      else {
        secondSgl = SglType.NO;
      }
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
      if( name.equals( "Источник" ) ) {
        thirdP.setText( "Мощность" ); //$NON-NLS-1$
        thirdSgl = SglType.SOURCE;
      }
      else {
        thirdSgl = SglType.NO;
      }
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
      if( name.equals( "Источник" ) ) {
        fourthP.setText( "Мощность" ); //$NON-NLS-1$
        fourthSgl = SglType.SOURCE;
      }
      else {
        fourthSgl = SglType.NO;
      }
    }
  }

  void drawArrow( VelPoint point ) {
    GraphicsContext gc = canvas.getGraphicsContext2D();
    gc.setStroke( Color.BLACK );
    gc.setLineWidth( 2 );
    double X = point.getX();
    double Y = point.getY();
    double Xend = point.getX() + point.getvelX();
    double Yend = point.getY() + point.getvelY();
    double alpha;
    if( (Y - Yend) == 0 ) {
      alpha = 0;
    }
    else {
      alpha = Math.atan2( X - Xend, Y - Yend );
    }
    gc.strokeLine( Xend, Yend, Xend + 2 * Math.sin( alpha + Math.PI / 4 ), Yend + 4 * Math.cos( alpha + Math.PI / 4 ) );
    gc.strokeLine( Xend, Yend, Xend + 2 * Math.sin( alpha - Math.PI / 4 ), Yend + 4 * Math.cos( alpha - Math.PI / 4 ) );
  }

  void Speedpaint( VelPoint point ) {
    GraphicsContext gc = canvas.getGraphicsContext2D();
    gc.setStroke( Color.BLACK );
    gc.setLineWidth( 2 );
    double X = point.getX();
    double Y = point.getY();
    double VelX = point.getvelX();
    double VelY = point.getvelY();
    gc.strokeLine( X, Y, X + VelX, Y + VelY );
    gc.strokeLine( X + VelX, Y + VelY, X, Y );
    drawArrow( point );
  }

  void drawSgl( TextField X, TextField Y, ChoiceBox CB ) {
    if( (CB.getValue().equals( "Вихрь" )) || (CB.getValue().equals( "Источник" )) ) {//$NON-NLS-1$ //$NON-NLS-2$
      GraphicsContext gc = canvas.getGraphicsContext2D();
      gc.fillOval( Double.parseDouble( X.getText() ) - Math.sqrt( SingularityList.MIN_SING_RADIUS ),
          Double.parseDouble( Y.getText() ) - Math.sqrt( SingularityList.MIN_SING_RADIUS ),
          2 * Math.sqrt( SingularityList.MIN_SING_RADIUS ), 2 * Math.sqrt( SingularityList.MIN_SING_RADIUS ) );
    }
  }

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
      gc.setFill( Color.WHITE );
      gc.clearRect( 0, 0, canvas.getWidth(), canvas.getHeight() );

      SingularityList.SglXUpdate( 0, Double.parseDouble( firstXtext.getText() ) );
      SingularityList.SglYUpdate( 0, Double.parseDouble( firstYtext.getText() ) );
      SingularityList.SglPowUpdate( 0, Double.parseDouble( firstPtext.getText() ) );
      SingularityList.SglTypeUpdate( 0, firstSgl );
      gc.setFill( Color.RED );
      drawSgl( firstXtext, firstYtext, firstCB );

      SingularityList.SglXUpdate( 1, Double.parseDouble( secondXtext.getText() ) );
      SingularityList.SglYUpdate( 1, Double.parseDouble( secondYtext.getText() ) );
      SingularityList.SglPowUpdate( 1, Double.parseDouble( secondPtext.getText() ) );
      SingularityList.SglTypeUpdate( 1, secondSgl );
      gc.setFill( Color.AQUA );
      drawSgl( secondXtext, secondYtext, secondCB );

      SingularityList.SglXUpdate( 2, Double.parseDouble( thirdXtext.getText() ) );
      SingularityList.SglYUpdate( 2, Double.parseDouble( thirdYtext.getText() ) );
      SingularityList.SglPowUpdate( 2, Double.parseDouble( thirdPtext.getText() ) );
      SingularityList.SglTypeUpdate( 2, thirdSgl );
      gc.setFill( Color.BLUEVIOLET );
      drawSgl( thirdXtext, thirdYtext, thirdCB );

      SingularityList.SglXUpdate( 3, Double.parseDouble( fourthXtext.getText() ) );
      SingularityList.SglYUpdate( 3, Double.parseDouble( fourthYtext.getText() ) );
      SingularityList.SglPowUpdate( 3, Double.parseDouble( fourthPtext.getText() ) );
      SingularityList.SglTypeUpdate( 3, fourthSgl );
      gc.setFill( Color.DARKCYAN );
      drawSgl( fourthXtext, fourthYtext, fourthCB );

      for( double X = 5; X < canvas.getWidth(); X = X + Double.parseDouble( NetStepX.getText() ) ) {
        for( double Y = 5; Y < canvas.getHeight(); Y = Y + Double.parseDouble( NetStepY.getText() ) ) {
          Speedpaint( SingularityList.Speed( X, Y ) );
        }
      }
    }

    catch( Exception e ) {
      GraphicsContext gc = canvas.getGraphicsContext2D();
      gc.setTextAlign( TextAlignment.CENTER );
      gc.setTextBaseline( VPos.CENTER );
      gc.fillText( "Ошибка формата", Math.round( canvas.getWidth() / 2 ), Math.round( canvas.getHeight() / 2 ) ); //$NON-NLS-1$
    }
  }

}
