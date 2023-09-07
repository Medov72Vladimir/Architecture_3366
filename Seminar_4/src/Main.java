// Главный класс

public class Main {
    public static void main(String[] args) {
       GeometryFigure figureBox = new GeometryFigure();
       Circle circle1 = new Circle("Круг.1",10);
       Circle circle2 = new Circle("Круг.2",6);
       figureBox.add(circle1);
       figureBox.add(circle2);
       figureBox.getInfo(0);

       Rectangle rectangle1 = new Rectangle("Прямоугольник.1", 7, 5);
       Rectangle rectangle2 = new Rectangle("Прямоугольник.2", 4, 8);
       figureBox.add(rectangle1);
       figureBox.add(rectangle2);
       figureBox.getInfo(2);

       Ellipse ellipse1 = new Ellipse("Эллипс.1", 5, 8);
       Ellipse ellipse2 = new Ellipse("Эллипс.2", 3, 7);
       figureBox.add(ellipse1);
       figureBox.add(ellipse2);
       figureBox.getInfo(4);

       figureBox.search(ellipse2);

       figureBox.remove(0);
    }
}