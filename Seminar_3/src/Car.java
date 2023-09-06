// Проектируем абстрактный класс «Car» у которого должны быть свойства:
// марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
// методы: движение, обслуживание, переключение передач, включение фар, включение дворников

public abstract class Car {
    private String brand; //марка автомобиля
    private String model; //модель автомобиля
    private String color; //цвет кузова
    private String bodyType; //тип кузова
    private String number; //номерной знак
    private int numberOfWheels; //число колес
    private String fuelType; //тип топлива
    private String transmissionType; //тип коробки передач
    private double engineVolume; // объем двигателя

    // Создаем конструктор класса "Car"
    public Car(String brand, String model, String color, String bodyType, String number, int numberOfWheels, String fuelType, String transmissionType, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.number = number;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }

        // Объявляем методы класса "Car"
    public abstract void movement(); //движение
    public abstract void service(); //обслуживание
    public abstract void gearShifting(); //переключение передач
    public abstract void turnigOnTheHeadlights(); //включение фар
    public abstract void turnigOnTheWipers(); //включение дворников

    // Расширим класс "Car", добавив метод "подметать улицу",и определим метод.
    // Добавление метода не нарушает принцип SRP(принцип единственной ответственности).
    public void replaceTheStreet() {
        System.out.println("Автомобиль " + model + " " + number + " " + "подметает улицу.");
    }

    // Расширим класс "Car", добавив еще два метода.
    // Добавление методов не нарушило принцип OCP(принцип открытости и закрытости).
    public abstract void turnigOnTheFogLights(); //включение противотуманных фар
    public abstract void shipping(); //перевозка груза
}
