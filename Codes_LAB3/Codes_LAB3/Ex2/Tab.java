/*Exercice2 LAB3*/

class Tab {
public static void trier( int [ ] tab ){
//COMPLÉTER PAR SOLUTION LAB2 
 }

public static int moyenne(int[] tab){
//COMPLÉTER PAR SOLUTION LAB2 
}

public static int count(int[] tab, int val){

        //VOTRE CODE 
}

public static void split(int[] tab,int[] petit, int val){ 
        //VOTRE CODE 
        
}

public static void main (String args [ ] )
{

int tab1 [ ] = { 3,55,7, 1, 88, 9 , 4, -10 };
int i,moyenne, size;
int[] petitTab,tab2;
tab2 = new int[]{10,34,62,56,82,7,95};
trier(tab1 ) ;
trier(tab2 ) ;
moyenne=moyenne(tab2);
size = count(tab2, moyenne); 
petitTab = new int[size];

System.out.println ("Les éléments de tab1 et tab2 triés sont : " ) ;
for ( i =0; i<tab1.length ; i++) {
/*Impression du contenu de tab1 trié*/
  if ( i >0) {
  System.out.print ( " , " ) ;
 }
 System.out.print (tab1 [ i ] ) ;
 }
System.out.println ( ) ;
for ( i =0; i<tab2.length ; i++) {
/*Impression du contenu de tab2 trié*/
  if ( i >0) {
  System.out.print ( " , " ) ;
 }
 System.out.print (tab2 [ i ] ) ;
 }
System.out.println ( ) ;
System.out.print ("La valeur moyenne de tab2 est " + moyenne(tab2)) ;
System.out.println ( ) ;
moyenne=moyenne(tab2);
split(tab2,petitTab,moyenne);
 System.out.print("Les éléments de petitTab sont : ");           
        for(i=0; i<petitTab.length; i++) {
            if (i>0) {
                System.out.print(", ");
            }
            System.out.print(petitTab[i]);           
        }
System.out.println ( ) ;
 }

}
