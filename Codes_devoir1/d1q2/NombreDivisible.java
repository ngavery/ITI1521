
public class NombreDivisible{
public static int nombreDivisible(int x[], int n) {
    /*
     prend un tableau d'entiers x et un entier n comme param�tres d'entr�e 
     et renvoie le nombre d'�l�ments du tableau qui sont divisibles par n. 
     */
     // VOTRE CODE
    int cpt = 0;
    int i;
    for(i = 0 ; i < x.length ; i++) {
      if(n!=0) {
        if(i%n == 0) {
          cpt += 1;
        }
      }
    }
    return cpt;
  }
  //slight difference in output***

 

  public static void main(String[] args) {
   int n1=3, n2=2;
    int[] Tab1 = {6, 10, 2, 3, 4, 5, 6,0};
    int[] Tab2 = {1, 2, 3, 0, 5, -6, 995};
    
     System.out.println("Le nombre d'éléments divisibles par 3 dans Tab1 est : " +nombreDivisible(Tab1, n1));
     System.out.println("Le nombre d'éléments divisibles par 2 dans Tab2 est : " +nombreDivisible(Tab2, n2));
     System.out.println();
    }

  } 

