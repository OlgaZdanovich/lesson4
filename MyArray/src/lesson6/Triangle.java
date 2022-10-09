package lesson6;
//класс треугольник
public class Triangle extends GeometricShape{
    double a;
    double b;
    double c;

    // коструктор
    public Triangle(String color, int numberOfSide, double a, double b, double c) {
        super(color, numberOfSide);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // реализация абстрактного метода
    @Override
    public void getPerimeter() {
        double P = a + b + c;
        System.out.printf("Perimeter triangle is %f",P);
    }

    // вычисление площади
    public void getSquareTriangle(){
        double P = a + b + c;
        double P2 = P/2;
        double num = P2*(P2 - a)*(P2 - b)*(P2 - c);
        double S = Math.sqrt(num);
        System.out.printf("Square triangle is %f",S);
    }
}
