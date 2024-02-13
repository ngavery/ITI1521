

public class NombreDiviseurs {
 
   public static int nombreDiviseurs (int n){//methode pour calculer le nombre de diviseur pour un entier positif
    // VOTRE CODE
    if(n<0) {
        System.out.println("Votre entier n'est pas positif.");
        return 0;
    }
    int cpt = 0;
    for(int i = 1 ; i < n ; i++) {//parcours tous les entier de 1 a n-1
        if(n%i == 0) {
                cpt += 1;
        }
    }
    return cpt;// retourne le nombre de diviseurs
    }

    public static void main(String[] args) {

       int N1=100, N2=17, N3=-3;

        /* Affichage*/
        System.out.println();
        System.out.println("Le nombre de diviseurs de " + N1//imprimer sur une nouvelle ligne
                + " est " + nombreDiviseurs(N1));
        System.out.println("Le nombre de diviseurs de " + N2//imprimer sur une nouvelle ligne
                + " est " + nombreDiviseurs(N2));
        System.out.println("Le nombre de diviseurs de " + N3//imprimer sur une nouvelle ligne
                + " est " + nombreDiviseurs(N3));

    } // end main()

} // end class NombreDiviseurss