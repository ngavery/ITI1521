public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getType() {
        if (name != null) {
            return "I am an animal and my name is " + name + ".";
        }
        else {
            return "I am an animal.";
        }
    }
}
