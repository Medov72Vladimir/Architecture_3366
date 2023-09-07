import java.util.ArrayList;
import java.util.List;

// Класс, отвечающий за логику работы с любой геометрической фигурой
public class GeometryFigure {
    static private ArrayList <IShape> tollbox;

    // Конструктор
    public GeometryFigure() {
        tollbox = new ArrayList<IShape>();
    }

    // Метод для добавления новой фигуры
    public void add(IShape figure) {
        tollbox.add(figure);
    }

    // Метод для удаления фигуры
    public void remove(int num) {
        if (num >= 0 && num < tollbox.size()) {
            IShape figure = tollbox.get(num);
            tollbox.remove(num);
            System.out.println("Фигура " + figure.getName() + " с номером " + num + " удалена");
        } else {
            System.out.println("Фигура с номером " + num + " не может быть удалена - ее не существует!");
        }
    }

    // Метод для поиска необходимой фигуры
    public void search(IShape figure) {
        int index = tollbox.indexOf(figure);
        if (index >= 0) {
            System.out.println("Фигура " + figure.getName() + " найдена на позиции " + index);
        } else {
            System.out.println("Фигура " + figure.getName() + " не найдена");
        }
    }

    //// Метод отображения подробной информации о фигуре
    public void getInfo(int num) {
        if(num < 0 || num >= tollbox.size()) {
            System.out.println("Фигуры под номером " + num + " не существует!");
        }
        IShape figure = tollbox.get(num);
        System.out.println("Параметры фигуры " + figure.getName() + " под номером " + num + " :");
        System.out.println("периметр = "+ (int)figure.getPerimeter() + ", площадь = " + (int)figure.getArea());
    }
}
