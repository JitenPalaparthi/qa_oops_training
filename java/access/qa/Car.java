package qa;

public class Car {
  private Engine eng;

  public Car() {
    eng = new Engine(1600);
  }

  public Engine getEngine() {
    return eng;
  }
}
