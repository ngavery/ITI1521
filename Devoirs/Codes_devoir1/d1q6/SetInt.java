
public class SetInt {
    
    private int[] tab ;//tableau pour stocker des element
    private int size ;//taille max du tableau
    private int nbElements ;//Nombre d'element 
    private int i=0;//index pour ajouter des element
    
    public SetInt ( ) {//definit la taille maximal
      size = 20;
      tab = new int[size];//cree un tableau
      nbElements = 0;//initialise le compte des element
    }
    public int getNbElements() {
        return nbElements;
    }
    //verifie si une valeur donne existe dans le tableau
    public boolean has(int p,int[] tab) {
        for (int i =0 ; i<tab.length-1 ; i++) 
        {
            if (tab[i]==p) //if pour verifier lindex dans le tableau si ces equivalent a p
            {
                return true;//valeur trouve ca retourne vrai       
            }    
        }
        return false;//valeur non trouve, retourne faux
    }
    
    public void add(int p) {
         if (has(p,tab)==false)
         {
            tab[i]=p;
            nbElements++;
            i++;
         }
    }//ajoute un element au tableau seulement si il nexsite pas deja

    public void trier()
    {
        int n = tab.length-1; 
        while (tab[n]==0)
        {
            n--;
        }//trouve le dernier element dans le tableau qui est une valeur non nulle
        n++;
        //ajustons la longueur
        for (int i = 1; i < n; ++i) {
            int key = tab[i];
            int j = i - 1;
            while (j >= 0 && tab[j]>key) 
            {
                tab[j + 1] = tab[j];
                j = j - 1;
                //decale les elements vers la droite
            }
            tab[j + 1] = key;
        }
        //insere la cle a la position necessaire
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

    static public void main(String[] args) {
        SetInt set = new SetInt();
        System.out.println("SVP, entrez les éléments de votre ensemble (entiers positifs) :" );
        System.out.println("Pour quitter, entrez un entier négatif:" );
        int n = ReadInt.getInt("Votre premier entier : ");
        while (n >= 0 ) {
            set.add(n);
            n = ReadInt.getInt("entier suivant : ");
        }
        
        System.out.println("Mon ensemble contient " + set.getNbElements() + " éléments : ");
        System.out.println("set = " + set);
        set.trier();
        System.out.println("Mon ensemble tri� est :" );
        System.out.println("set = " + set);
     }
}