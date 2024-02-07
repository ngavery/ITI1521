
public class SequenceDeDeux{
public static boolean sequenceDeDeux(int x[]) {
    /*
     fonction qui prend un tableau de nombres entiere et qui retourne true s�il y a au moins
     une s�quence de deux �l�ments cons�cutifs �gaux,
     et false dans le cas contraire.
     */
    boolean res = false;
    int i = 0;//index pour parcourir le tableau
    for(i = 0 ; i < x.length - 1 ; i++) {//parcours du tableau jusqua lavant dernier element
      if(x[i] == x[i+1]) {
        res = true;//met a jour le resultat
        break; 
      }
    }
    return res;
  }

 
public static void main(String[] args) {
   
    int[] Tab1 = {3,1,1,7,5};//tableau
    int[] Tab2 = {1,6,4,3,3,3};
    int[] Tab3 = {2,1,5,3,1,2,1};
    System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab1 : " + sequenceDeDeux(Tab1));//affiche si une sequence de deux  elements consecutifs egaux existe dans chaque tableau
    System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab2 : " + sequenceDeDeux(Tab2));//affiche si une sequence de deux  elements consecutifs egaux existe dans chaque tableau
    System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab3 : " + sequenceDeDeux(Tab3));//affiche si une sequence de deux  elements consecutifs egaux existe dans chaque tableau
    System.out.println();
    //affiche si une sequence de deux element consecutif egaux dans chaque tableau
    }

  } 

