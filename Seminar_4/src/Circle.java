// Класс фигуры "Круг"

public class Circle implements IShape{
    private String name;
    private double radius;
    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
    @Override
    public String getName() {
        return name;
    }

    // Определение метода вычисления площади
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Определение метода вычисления периметра
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
