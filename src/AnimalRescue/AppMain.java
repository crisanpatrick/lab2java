package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        //Dog
        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setAge(2);
        rex.setHealth(1);
        rex.setHunger(1);
        rex.setSpirit(1);
        rex.setFavfood("1");
        rex.setFavactiv("1");
        //Girl
        Girl anna = new Girl();
        anna.setName("Anna");
        anna.setMoney(610);
        anna.setCurrency("$");
        //Food
        Food food = new Food();
        food.setName("cubeti");
        food.setPrice(50);
        food.setQuantity(21);
        //Recreational Activity
        Activity activity = new Activity();
        activity.setName("Fetch");
        //Vet
        Vet vet = new Vet();
        vet.setName("Jonathan");
        vet.setSpec("Butcher");
    }
}
