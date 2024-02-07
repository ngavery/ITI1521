
public class SequenceMax{
public static int sequenceMax(int x[]) {
    /*
     cette focntion prend un tableau de nombres et retourne
     la longueur de la plus longue séquence des éléments consécutive égaux 
     */
  
  int maxL = 1;//longueur maximal initial
  int tempL = 1;//variable initialiser pour lune longueur temporaire pour compter les element consecutifs
  int i = 0;//index i pour aller a travers le tableau

  while(i < x.length - 1) {
    //réinitialise tempL après chaque instanciation
    tempL = 1;

    //compte les éléments consécutifs et met cette valeur dans maxL
    while(i < x.length - 1 && x[i] == x[i+1]) {
      tempL += 1;
      i += 1;
      if(tempL > maxL) {
        maxL = tempL;
      }
    }
    //avance dans le tableau
    i += 1;
  }
  return maxL;
}

 

  public static void main(String[] args) {
   
    int[] Tab1 = {1,2,1,3,3,3,6,1,1};
    int[] Tab2 = {1,5,2,2,2,7,3,3,3,3};
    int[] Tab3 = {3,1,7,1};
    
     System.out.println("La plus longue séquence d'éléments consécutifs égaux dans Tab1 est : " + sequenceMax(Tab1));
     System.out.println("La plus longue séquence d'éléments consécutifs égaux dans Tab2 est : " + sequenceMax(Tab2));
     System.out.println("La plus longue séquence d'éléments consécutifs égaux dans Tab3 est : " + sequenceMax(Tab3));
     System.out.println();
    }

  } 

