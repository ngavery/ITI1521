
     public class D� {
     
        private int value;   // Num�ro figurant sur le d�. 

        /**
         * Le constructeur cr�e un d� et le lance de sorte qu'il
          * montre initialement une valeur al�atoire entre 1 et 6. 
         */
        public D�() {
            //VOTRE CODE
        }
        
        /**
         * Lancez le d� pour qu'il indique un nombre al�atoire entre 1 et 6. 
         */
        public void lancer() {
           // VOTRE CODE
        }
                
        /**
         * Renvoie le nombre indiqu� sur le d�. 
         */ 
        public int getValue() {
           return value;
        }
        
        /**
         * D�finit la valeur du d�. Imprime Valeur iIll�gale du d�
          * si la valeur n'est pas comprise entre 1 et 6. 
         */
        public void setValue( int val ) {
           //VOTRE CODE
        }
        
   
     
//Programme principal main
      
     /** 
      * lancer deux d�s jusqu'� ce qu'ils indiquent la meme valeur 
      * et afficher le nombre de fois que ces d�s ont �t� lanc�s. 
      */
    
        public static void main(String[] args) {
           
           D� d�1;  // 1er d�
           D� d�2;  // second d�
           
           //VOTRE CODE
           
           /*Affiche le nombre de lanc�s. */
           
          //VOTRE lIGNE D'AFFICHAGE
          
          System.out.println(d�1.getValue());
          System.out.println(d�2.getValue());
          System.out.println();
           
          /* g�n�rer une exception. */
           System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
           System.out.println("lorsqu'il essaie de fixer la valeur d'un d� � 100. ");
           D� d�;  // variable referant au d�.
           d� = new D�();  // creer l'objet
           d�.setValue(100);
          }
        
     }  // end class D�
