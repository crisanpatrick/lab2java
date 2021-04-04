package AnimalRescue;

public class Dog {
    String name = "Rex";
    int age = 2;
    String breed = "Ciobanesc German";
    String color = "Yellow/Black";
    float weight = 24.4f;
    int heightInCM = 50;
    int health = 6;
    int hunger = 4;
    int spirit = 8;
    String favfood = "Dogo Goodies!";
    String favactiv = "Fetch";

    public void bark() {
        System.out.println("Ham!");
    }

    public void eat() {

        System.out.println("Eating food!");
    }

    public void sleep() {
        System.out.println("zZzZzZ *snores*");
    }

    public void age() {
        System.out.println(age);
    }

    public void health() {
        System.out.println("His health is at " + health + "/10");
    }

    public void hunger() {
        System.out.println("His hunger is at " + hunger + "/10");
    }

    public void spirit() {
        System.out.println("His spirit is at " + spirit + "/10");
    }

    public void favfood() {
        System.out.println("His favorite food is " + favfood);
    }

    public void favactiv() {
        System.out.println("His favorite activity is " + favactiv);
    }
}

