package lesson6;

// класс квадрат
public class Square extends GeometricShape{
    // длина стороны квадрата
    double a;
    // конструктор
    public Square(double a, String color, int numberOfSide) {
        super(color, numberOfSide);
        this.a = a;
    }
    // реализация статического метода исх класса
    @Override
    public void getPerimeter() {
        double P = 4*a;
        System.out.printf("Perimeter square is %f",P);
    }
    // переопределение метода исх класса
    @Override
    public void DisplayInfo() {
        System.out.printf("Side of square is %f",a);

    }

    // вычисление площади
    public void getSquare(){
        double S = a * a;
        System.out.printf("Square triangle is %f",S);
    }
}
