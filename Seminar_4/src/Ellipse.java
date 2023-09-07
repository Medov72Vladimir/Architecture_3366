// Класс фигуры "Эллипс"

public class Ellipse implements IShape{
    private String name;
    private int minAxis;
    private int maxAxis;
    public Ellipse(String name, int minAxis, int maxAxis) {
        this.name = name;
        this.minAxis = minAxis;
        this.maxAxis = maxAxis;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI * minAxis * maxAxis;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((minAxis * minAxis + maxAxis * maxAxis) / 2);
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMinAxis() {
        return minAxis;
    }
    public void setMinAxis(int length) {
        this.minAxis = minAxis;
    }
    public int getMaxAxis() {
        return maxAxis;
    }
    public void setMaxAxis(int width) {
        this.maxAxis = maxAxis;
    }
}
