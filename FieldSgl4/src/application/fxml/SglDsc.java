package application.fxml;

/**
 * Класс, хранящий информацию о сингулярности
 *
 * @author Паша
 */
public class SglDsc {

  /**
   * @param X Координата сингулярности по X
   * @param Y Координата сингулярности по Y
   * @param aPower Мощность сингулярности
   * @param aType Тип сингулярности
   */
  public SglDsc( double X, double Y, double aPower, SglType aType ) {
    x = X;
    y = Y;
    power = aPower / (2 * Math.PI);
    type = aType;
  }

  enum SglType {
    VORTEX,
    SOURCE,
    NO;
  }

  double x;

  double y;

  double power;

  SglType type;

  /**
   * @param X - новая X сингулярности
   */
  public void setX( double X ) {
    x = X;
  }

  /**
   * @param Y - новая Y сингулярности
   */
  public void setY( double Y ) {
    y = Y;
  }

  /**
   * @param aPower - новая мощность сингулярности
   */
  public void setpower( double aPower ) {
    power = aPower / (2 * Math.PI);
  }

  /**
   * @param aType - новый тип сингулярности
   */
  public void settype( SglType aType ) {
    type = aType;
  }

  /**
   * @param x0 координата по X точки
   * @return Расстояние до точки с координатой x0 по оси X
   */
  public double getdX( double x0 ) {
    return x0 - x;
  }

  /**
   * @param y0 координата по Y точки
   * @return Расстояние до точки с координатой y0 по оси Y
   */
  public double getdY( double y0 ) {
    return y0 - y;
  }

  /**
   * @return Мощность данной сингулярности
   */
  public double getPower() {
    return power;
  }

  /**
   * @return Тип данной сингулярности
   */
  public SglType getType() {
    return type;
  }

  /**
   * @param x0 X заданной точки
   * @param y0 Y заданной точки
   * @return Квадрат расстояние до точки с координатами x0 и y0
   */
  public double getR2( double x0, double y0 ) {
    return ((x - x0) * (x - x0) + (y - y0) * (y - y0));
  }
}
