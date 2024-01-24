

public class NombreDiviseurs {
 /**
 fonction  qui prend un entier n comme param�tre d'entr�e et 
 renvoie le nombre d'�l�ments qui sont divisibles par n. 
 Si n est n�gatif (n<0), elle renvoie 0 
 */
   public static int nombreDiviseurs (int n){
    // VOTRE CODE
    if(n<0) {
        System.out.println("Votre entier n'est pas positif.");
        return 0;
    }
    int cpt = 0;
    for(int i = 1 ; i < n ; i++) {
        if(n%i == 0) {
                cpt += 1;
        }
    }
    return cpt;
    }

    public static void main(String[] args) {

       int N1=100, N2=17, N3=-3;

        /* Affichage*/
        System.out.println();
        System.out.println("Le nombre de diviseurs de " + N1
                + " est " + nombreDiviseurs(N1));
        System.out.println("Le nombre de diviseurs de " + N2
                + " est " + nombreDiviseurs(N2));
        System.out.println("Le nombre de diviseurs de " + N3
                + " est " + nombreDiviseurs(N3));

    } // end main()

} // end class NombreDiviseurss