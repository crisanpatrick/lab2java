package AnimalRescue;

public class Dog extends Animal{
    private boolean fur;

    public boolean hasFur(){
        return fur;
    }
    public void setFur(boolean fur){
        this.fur = fur;
    }
    public void bark(){
        System.out.println("Ham Ham!");
    }
}




