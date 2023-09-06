// Главный метод

public class Main {
    public static void main(String[] args) {
        Auto Auto1 = new Auto("Lada", "Vesta_Cross", "White", "Sedan", "A125ЕР147",4, "Gasoline", "Variator", 1.6);
        Auto Auto2 = new Auto("Lada", "Vesta_Cross", "Orange", "Hatchback", "O573ВВ147",4, "Gasoline", "Manual transmission", 1.6);
        Auto Auto3 = new Auto("KAMAZ", "КамАЗ 6522", "Orange", "Truck", "В666УК198", 6, "Diesel", "Manual transmission", 11.8);
        ThreeWheeledCar ThreeWheeledCar = new ThreeWheeledCar("Mercedes-Benz", "F-300", "Blue", "Hatchback", "К555ЕЕ198", "Gasoline", "automatic transmission", 1.6);

        Auto1.movement();
        Auto2.service();
        Auto3.shipping();
        Auto3.turnigOnTheHeadlights();
        ThreeWheeledCar.turnigOnTheWipers();

    }
}