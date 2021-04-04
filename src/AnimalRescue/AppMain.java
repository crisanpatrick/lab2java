package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        //Dog
        Dog rex = new Dog();
        rex.age();
        rex.health();
        rex.hunger();
        rex.spirit();
        rex.favfood();
        rex.favactiv();
        //Girl
        Girl anna = new Girl();
        anna.name();
        anna.wallet();
        //Food
        Food food = new Food();
        food.brand();
        food.price();
        food.availibility();
        //Recreational Activity
        Activity activity = new Activity();
        activity.name();
        //Vet
        Vet vet = new Vet();
        vet.name();
        vet.spec();
    }
}
