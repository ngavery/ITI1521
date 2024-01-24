
public class SequenceDeDeux{
public static boolean sequenceDeDeux(int x[]) {
    /*
     fonction qui prend un tableau de nombres entiere et qui retourne true s�il y a au moins
     une s�quence de deux �l�ments cons�cutifs �gaux,
     et false dans le cas contraire.
     */
    boolean res = false;
    int i = 0;
    for(i = 0 ; i < x.length - 1 ; i++) {
      if(x[i] == x[i+1]) {
        res = true;
        break; 
      }
    }
    return res;
  }

 
public static void main(String[] args) {
   
    int[] Tab1 = {3,1,1,7,5};
    int[] Tab2 = {1,6,4,3,3,3};
    int[] Tab3 = {2,1,5,3,1,2,1};
    
     System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab1 : " + sequenceDeDeux(Tab1));
     System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab2 : " + sequenceDeDeux(Tab2));
     System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab3 : " + sequenceDeDeux(Tab3));
     System.out.println();
    }

  } 

