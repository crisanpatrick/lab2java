package AnimalRescue;

public class Vet {
    String name = "John";
    String spec = "Dog Veterinarian";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void name() {
        System.out.println("Hello my name is " + name + ".");
    }

    public void spec() {
        System.out.println("And my Specialisation is " + spec + ".");
    }
}
