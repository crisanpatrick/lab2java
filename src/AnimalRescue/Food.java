package AnimalRescue;

public class Food {
    String name = "Doggo Goodies!";
    double price = 6.99d;
    int quantity = 12;

    public void brand() {
        System.out.println(name);
    }

    public void price() {
        System.out.println("The Price for this brand of food is " + price + "$");
    }

    public void availibility() {
        if (quantity>=1) System.out.println("We have dog food!");
        else System.out.println("We dont have any more dog food!");
    }
}

