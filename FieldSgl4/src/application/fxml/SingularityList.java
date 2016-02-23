package application.fxml;

import java.util.ArrayList;
import java.util.List;

/**
 * Без комментариев
 *
 * @author Паша
 */
public class SingularityList {

  /**
   * Квадрат радиуса окружности вокруг сингулярности внутри которой скорость от сингулярности равна нулю.
   */
  private static final double MIN_SING_RADIUS = 1.e-3;

  /**
   * Список параметров всех сингулярностей, что участвуют в расчёте поля скоростей
   */
  public static List<SglDsc> list = new ArrayList<>();

  private SingularityList() {
    // Это Синглтон-класс
  }

  /**
   * @param x0 Без комментариев
   * @param y0 Без комментариев
   * @return Без комментариев
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
            vx += tmp * p.getdX( y0 );
            vy += tmp * p.getdY( x0 );
            break;

          default:
            throw new Exception( "Проблема с классом сингулярности" ); //$NON-NLS-1$
        }
      }
    }
    return new VelPoint( x0, y0, vx, vy );
  }

}
