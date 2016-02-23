package application.fxml;

/**
 * Кординаты точки + 2 компоненты скорости
 *
 * @author Паша
 */
public class VelPoint {

  /**
   * Конструктор класса
   *
   * @param pointX Координата X
   * @param pointY Координата Y
   * @param velocityX Компонента скорости по X
   * @param velocityY Компонента скорости по Y
   */
  public VelPoint( double pointX, double pointY, double velocityX, double velocityY ) {
    X = pointX;
    Y = pointY;
    velX = velocityX;
    velY = velocityY;
  }

  /**
   * @return Возвращает координату X
   */
  public double getX() {
    return X;
  }

  /**
   * @return Возвращает координату Y
   */
  public double getY() {
    return Y;
  }

  /**
   * Возвращает компоненту скорости по X. Смотри также {@link #velY}
   *
   * @return Компонента скорости по X
   */
  public double getvelX() {
    return velX;
  }

  /**
   * Возвращает компоненту скорости по Y. Смотри также {@link #velX}
   *
   * @return Компонента скорости по Y
   */
  public double getvelY() {
    return velY;
  }

  private double X;

  private double Y;

  private double velX;

  private double velY;

}
