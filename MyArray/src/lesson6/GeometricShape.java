package lesson6;


import java.util.Objects;

/*
сделать программу, в которой будет использоваться наследование
и абстрактные классы с интерфейсами.  Сделать геттеры-сеттеры,
переопределить hashCode equals и toString. Минимум по 2 метода
в классе. Минимум по 2 поля в классе. Сделать конструктор без
параметров и со всеми полями класса.
1. Геом. фигура -> Квадрат, Треугольник
 */
abstract public class GeometricShape {
  private String color;
  private int numberOfSide;



  //конструктор по умолчанию
  public GeometricShape() {

  }
  // конструктор со всеми полями

  public GeometricShape(String color, int numberOfSide) {
    this.color = color;
    this.numberOfSide = numberOfSide;
  }

  // гетеры на все поля

  public String getColor() {
    return color;
  }

  public int getNumberOfSide() {
    return numberOfSide;
  }

  // сетеры на все поля

  public void setColor(String color) {
    this.color = color;
  }

  public void setNumberOfSide(int numberOfSide) {
    this.numberOfSide = numberOfSide;
  }

  // абстрактный метод, который будет переопределяться
  abstract public void getPerimeter();

  // метод для вывода инфомации
  public void DisplayInfo(){
    System.out.printf("Count of side is %d, color is %s.",getNumberOfSide(),getColor());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GeometricShape that = (GeometricShape) o;
    return numberOfSide == that.numberOfSide && Objects.equals(color, that.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, numberOfSide);
  }

  @Override
  public String toString() {
    return "GeometricShape{" +
            "color='" + color + '\'' +
            ", numberOfSide=" + numberOfSide +
            '}';
  }
}
