package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex.breed);
        rex.eat();
        System.out.print("He got fatter and his wiehgt is : " );
        rex.weight = (rex.weight + 1);
        System.out.print(rex.weight);
        System.out.println(" KG");
        System.out.println("After eating he got pig disease and went to sleep!");
        rex.sleep();
    }
}
