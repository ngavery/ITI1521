
     public class Dé {
     
        private int value;   // Numéro figurant sur le dé. 

        /**
         * Le constructeur crée un dé et le lance de sorte qu'il
          * montre initialement une valeur aléatoire entre 1 et 6. 
         */
        public Dé() {
            //VOTRE CODE
        }
        
        /**
         * Lancez le dé pour qu'il indique un nombre aléatoire entre 1 et 6. 
         */
        public void lancer() {
           // VOTRE CODE
        }
                
        /**
         * Renvoie le nombre indiqué sur le dé. 
         */ 
        public int getValue() {
           return value;
        }
        
        /**
         * Définit la valeur du dé. Imprime Valeur iIllégale du dé
          * si la valeur n'est pas comprise entre 1 et 6. 
         */
        public void setValue( int val ) {
           //VOTRE CODE
        }
        
   
     
//Programme principal main
      
     /** 
      * lancer deux dés jusqu'à ce qu'ils indiquent la meme valeur 
      * et afficher le nombre de fois que ces dés ont été lancés. 
      */
    
        public static void main(String[] args) {
           
           Dé dé1;  // 1er dé
           Dé dé2;  // second dé
           
           //VOTRE CODE
           
           /*Affiche le nombre de lancés. */
           
          //VOTRE lIGNE D'AFFICHAGE
          
          System.out.println(dé1.getValue());
          System.out.println(dé2.getValue());
          System.out.println();
           
          /* générer une exception. */
           System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
           System.out.println("lorsqu'il essaie de fixer la valeur d'un dé à 100. ");
           Dé dé;  // variable referant au dé.
           dé = new Dé();  // creer l'objet
           dé.setValue(100);
          }
        
     }  // end class Dé
