
public class SetInt {
    
    private int[] tab ;
    private int size ;
    private int nbElements ;

    public SetInt ( ) {
      size = 20;
      tab = new int[size];
      nbElements = 0;
    }
    public int getNbElements() {
        return nbElements;
    }

    public boolean has(int p) {
        // VOTRE CODE
    }

    public void add(int p) {
         // VOTRE CODE
    }

    public  void trier( ){
      // VOTRE CODE
    }
    
    public String toString() {
        if (nbElements == 0)
            return "{}";
        else {
            String str =  "{" + tab[0];
            for (int i = 1; i < nbElements; i++)
                str += "," + tab[i];
            return str + "}";
        }
    }

/*
* MAIN
* 
*/
    static public void main(String[] args) {
        SetInt set = new SetInt();
        System.out.println("SVP, entrez les �l�ments de votre ensemble (entiers positifs) :" );
        System.out.println("Pour quitter, entrez un entier n�gatif:" );
        int n = ReadInt.getInt("Votre premier entier : ");
        while (n >= 0 ) {
            set.add(n);
            n = ReadInt.getInt("entier suivant : ");
        }
        
        System.out.println("Mon ensemble contient " + set.getNbElements() + " �l�ments : ");
        System.out.println("set = " + set);
        set.trier();
        System.out.println("Mon ensemble tri� est :" );
        System.out.println("set = " + set);
     }
}
