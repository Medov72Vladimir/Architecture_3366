public class ThreeWheeledCar extends Car{
    private String model;
    private String number;

    // Создаем конструктор класса "Auto"
    public ThreeWheeledCar(String brand, String model, String color, String bodyType, String number, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, number, 3, fuelType, transmissionType, engineVolume);
        this.model = model;
        this.number = number;
    }
    // Определяем абстрактные методы, объявленные в суперклассе "Car" (обязательно!)

    @Override
    public void movement() {
        System.out.println("Трехколесный " + model + " " + number + " движется");
    }

    @Override
    public void service() {
        System.out.println("Трехколесный " + model + " " + number + " находится на обслуживании");
    }

    @Override
    public void gearShifting() {
        System.out.println("Трехколесный " + model + " " + number + " переключает передачу");
    }

    @Override
    public void turnigOnTheHeadlights() {
        System.out.println("У трехколесного " + model + " " + number + " включены фары");
    }

    @Override
    public void turnigOnTheWipers() {
        System.out.println("У трехколесного " + model + " " + number + " включены дворники");
    }

    @Override
    public void turnigOnTheFogLights() {
        System.out.println("У трехколесного " + model + " " + number + " включены противотуманные фары");
    }

    @Override
    public void shipping() {
        System.out.println("Трехколесный " + model + " " + number + " перевозит груз");
    }
}
