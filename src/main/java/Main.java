import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Avtomat drinkMachine = new Avtomat(Arrays.asList(
                new Product("water","Coca-Cola",5, 99),
                new Product("cofe", "late", 2, 45)));

        AvtomatHotDrink hotDrinksMachine = new AvtomatHotDrink(Arrays.asList(
                new HotDrink("cofe", "raf-milk", 1, 18, 80),
                new HotDrink("cofe", "raf-milk", 1, 24, 80),
                new HotDrink("cofe", "late", 1, 8,80)));


        int number = drinkMachine.numberPD();
        Product products = drinkMachine.GetNumberPD(number);
        drinkMachine.buyProduct(products);

        String name = hotDrinksMachine.twoName();
        int volume = hotDrinksMachine.twoVolume();
        int temperature = hotDrinksMachine.twoTemperatura();
        Product product = hotDrinksMachine.GetProduct(name, volume, temperature);
        hotDrinksMachine.buyProduct(product);
    }
}