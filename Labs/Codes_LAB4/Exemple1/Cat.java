public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
      this.setNbMonths(2);
    System.out.println("I am a cat and just born after " + this.getNbMonths()+ " months of pregnacy. I don't have a name yet. ");
    }

    public String getType() {
        return super.getType() + " I am a cat.";
    }
}
