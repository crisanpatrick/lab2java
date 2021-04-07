package AnimalRescue;

public class Food {
    private String name = "Doggo Goodies!";
    private double price = 6.99d;
    private int quantity = 12;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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

