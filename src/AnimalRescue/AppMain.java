package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex.breed);
        rex.eat();
        rex.weight = 25.9f;
        System.out.println(rex.weight);
    }
}
