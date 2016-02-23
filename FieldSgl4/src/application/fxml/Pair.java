package application.fxml;

import java.io.Serializable;

/**
 * Пара объектов.
 * <p>
 * Неизменяемый класс, содержащий пару объектов.
 * 
 * @author vs
 * @param <L> - тип левого объекта в паре
 * @param <R> - тип правого объекта в паре
 */
public final class Pair<L, R>
    implements Serializable {

  private static final long serialVersionUID = 157157L;

  private final L left;
  private final R right;

  /**
   * Конструктор со всеми инвариантами.
   * 
   * @param aLeft L - левый объект, может быть null
   * @param aRight R - правый объект, может быть null
   */
  public Pair( L aLeft, R aRight ) {
    left = aLeft;
    right = aRight;
  }

  /**
   * Левый объект пары.
   * 
   * @return L - левый объект
   */
  public L left() {
    return left;
  }

  /**
   * Правый объект пары
   * 
   * @return R - правый объект
   */
  public R right() {
    return right;
  }

}
