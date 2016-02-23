package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Стартовый класс
 *
 * @author Паша
 */
public class Main
    extends Application {

  private Stage primaryStage;
  private BorderPane rootLayout;

  @Override
  public void start( Stage aprimaryStage ) {
    this.primaryStage = aprimaryStage;
    this.primaryStage.setTitle( "AddressApp" ); //$NON-NLS-1$

    initLayout();

  }

  /**
   * Initializes the root layout.
   */
  public void initLayout() {
    try {
      // Load root layout from fxml file.
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation( Main.class.getResource( "fxml/Accordeon.fxml" ) ); //$NON-NLS-1$
      rootLayout = (BorderPane)loader.load();

      // Show the scene containing the root layout.
      Scene scene = new Scene( rootLayout );
      primaryStage.setScene( scene );
      primaryStage.show();
    }
    catch( Exception e ) {
      e.printStackTrace();
    }
  }

  /**
   * Стартовая функция
   *
   * @param args аргс
   */
  public static void main( String[] args ) {
    launch( args );
  }
}
