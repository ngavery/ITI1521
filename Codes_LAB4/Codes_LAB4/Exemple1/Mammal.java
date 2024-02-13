public class Mammal extends Animal {

    private int nbMonthPregnacy;

    public Mammal(String name) {
        super(name);
    }

    public Mammal() {
    }

    public void setNbMonths(int nbMonths) {
        nbMonthPregnacy = nbMonths;
    }

    public int getNbMonths() {
        return nbMonthPregnacy;
    }
        

    public String getType() {
        return super.getType() + " I am a Mammal.";
    }
}
