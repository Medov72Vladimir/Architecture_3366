package Abstractions;
/**
 *  Использование паттерна "Фабричный метод"
 *  Абстракция класса фабрики
 *  Генератор элементов ItemGenerator
 */
public abstract class ItemGenerator {
    /**
     * Метод взаимодействия с абстрактной продукцией (содержимым сундука)
     * createItem() - создание продукта
     * gameItem.open() - увидим, что лежит в сундуке
     */
    public String openReward() {
        IGameItem gameItem = createItem();
        return gameItem.open();
    }
     // Метод создания экземпляра продукта
    public abstract IGameItem createItem();
}
