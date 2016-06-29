package application.fxml;

import java.util.ArrayList;
import java.util.List;

import application.fxml.SglDsc.SglType;

/**
 * Синглтон-класс, хранящий список всех сингулярностей и способный рассчитывать скорость в данной точке от этих
 * синглулярностей
 *
 * @author Паша
 */
public class SingularityList {

  /**
   * Квадрат радиуса окружности вокруг сингулярности внутри которой скорость от сингулярности равна нулю.
   */
  // private static final double MIN_SING_RADIUS = 1.e-3;
  public static final double MIN_SING_RADIUS = 81;

  /**
   * Список параметров всех сингулярностей, что участвуют в расчёте поля скоростей
   */
  public static List<SglDsc> list = new ArrayList<>();

  @SuppressWarnings( "javadoc" )
  public SingularityList() {
    // Это Синглтон-класс
  }

  /**
   * @param SglNum - номер изменяемой сингулярности
   * @param X - новая координата по X сингулярности
   */
  public static void SglXUpdate( int SglNum, double X ) {
    try {
      list.get( SglNum ).setX( X );
    }
    catch( Exception e ) {
    }
  }

  /**
   * @param SglNum - номер изменяемой сингулярности
   * @param Y - новая координата по Y сингулярности
   */
  public static void SglYUpdate( int SglNum, double Y ) {
    try {
      list.get( SglNum ).setY( Y );
    }
    catch( Exception e ) {
    }
  }

  /**
   * @param SglNum - номер изменяемой сингулярности
   * @param Pow - новая мощность сингулярности
   */
  public static void SglPowUpdate( int SglNum, double Pow ) {
    try {
      list.get( SglNum ).setpower( Pow );
    }
    catch( Exception e ) {
    }
  }

  /**
   * @param SglNum - номер изменяемой сингулярности
   * @param Type - новый тип сингулярности
   */
  public static void SglTypeUpdate( int SglNum, SglType Type ) {
    try {
      list.get( SglNum ).settype( Type );
    }
    catch( Exception e ) {
    }
  }

  /**
   * @param x0 Координата точки
   * @param y0 Координата точки
   * @return Класс-VelPoint
   * @throws Exception Без комментариев
   */
  public static VelPoint Speed( double x0, double y0 )
      throws Exception {
    double vx = 0, vy = 0;
    for( SglDsc p : list ) {
      double r = p.getR2( x0, y0 );
      if( r >= MIN_SING_RADIUS ) {
        double tmp = p.getPower() / r;
        switch( p.getType() ) {
          case VORTEX:
            vx += tmp * p.getdY( y0 );
            vy -= tmp * p.getdX( x0 );
            break;
          case SOURCE:
            vx += tmp * p.getdX( x0 );
            vy += tmp * p.getdY( y0 );
            break;
          case NO:
            break;

          default:
            throw new Exception( "Проблема с классом сингулярности" ); //$NON-NLS-1$
        }
      }
    }
    return new VelPoint( x0, y0, vx, vy );
  }

}
