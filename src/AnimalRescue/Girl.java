package AnimalRescue;

public class Girl {
    private String name = "Anna";
    private int money = 150;
    private String currency = "$";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void name() {
        System.out.println("Hello, my name is " + name + ".");
    }

    public void wallet() {
        System.out.println("I have " + money + currency + " in my wallet!");
    }
}
