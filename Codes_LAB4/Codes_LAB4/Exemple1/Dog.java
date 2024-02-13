public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
      this.setNbMonths(3);
      System.out.println("I am a dog and just born after " + this.getNbMonths()+ " months of pregnacy. I don't have a name yet. ");
    }

    public String getType() {
        return super.getType() + " I am a dog ";
    }
}
