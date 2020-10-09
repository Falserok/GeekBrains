import java.util.Scanner;

class Cat {
    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        fed = plate.decreaseFood(appetite);
    }

    public void info() {
        System.out.println(name + " " + (fed ? " сыт " : " голоден "));
    }
}

class Plate {
     private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int appetite) {
        if (food - appetite < 0) {
            return false;
        }

        else {
            food = food - appetite;
            return true;
        }
    }

    public void info() {
        System.out.println("plate " + food);
    }

    public void addFood(int food) {
        this.food = food + food;
    }

}