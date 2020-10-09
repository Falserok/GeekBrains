import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vaska", 123),
                new Cat("Nika", 132),
                new Cat("Loki", 54),
                new Cat("Eva", 32),
        };
        {

            Plate plate = new Plate(300);
            for (Cat itemCat : cats) {
                itemCat.eat(plate);
                itemCat.info();
            }
        }
    }
}