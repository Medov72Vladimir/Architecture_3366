// Создадим класс конкретного автомобиля путём наследования класса «Car»

public class Auto extends Car{
    private String model;
    private String number;

    // Создаем конструктор класса "Auto"
    public Auto(String brand, String model, String color, String bodyType, String number, int numberOfWheels, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, number, numberOfWheels, fuelType, transmissionType, engineVolume);
        this.model = model;
        this.number = number;
    }
    // Определяем абстрактные методы, объявленные в суперклассе "Car" (обязательно!)

    @Override
    public void movement() {
        System.out.println(model + " " + number + " движется");
    }

    @Override
    public void service() {
        System.out.println(model + " " + number + " находится на обслуживании");
    }

    @Override
    public void gearShifting() {
        System.out.println(model + " " + number + " переключает передачу");
    }

    @Override
    public void turnigOnTheHeadlights() {
        System.out.println("Фары " + model + " " + number + " включены");
    }

    @Override
    public void turnigOnTheWipers() {
        System.out.println("Дворники " + model + " " + number + " включены");
    }

    @Override
    public void turnigOnTheFogLights() {
        System.out.println("Противотуманные фары " + model + " " + number + " включены");
    }

    @Override
    public void shipping() {
        System.out.println(model + " " + number + " перевозит груз");
    }
}
