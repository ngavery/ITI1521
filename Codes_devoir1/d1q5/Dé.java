import java.lang.Math;
public class Dé 
{
   private int valeur;//initialise une variable pour stocker la valeur du de

   public Dé() 
   {
     this.valeur=(int)((Math.random()*6)+1);
   }
   
   public void lancer()///cree une methode pour lancer le de 
   {
      valeur=(int)((Math.random()*6)+1);//ont place a date la valeur du de
   }             

   public int getvaleur() 
   {
      return valeur;
   }    

   public void setvaleur( int val ) 
   {
      if (val>6)
      {
         System.out.println("Valeur iIllegale du De "+val);
      }
      valeur=val;
   }
        
   public static void main(String[] args) 
   {
      Dé de1;//cree un premier de
      de1 = new Dé();  
      Dé de2;  //cree un deuxieme de
      de2 = new Dé();
      Integer lances=0;

      while (de1.getvaleur()==de2.getvaleur())
      {
         de1.lancer();
         de2.lancer();
      }
      
      while (de1.getvaleur()!=de2.getvaleur())
      {
         de1.lancer();
         de2.lancer();
         lances+=1;
      }
           
      System.out.println(" a pris "+lances+" lancés pour que les deux Des indiquent la meme valeur :");
          
      System.out.println(de1.getvaleur());
      System.out.println(de2.getvaleur());
      System.out.println();

      System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
      System.out.println("lorsqu'il essaie de fixer la valeur d'un De a 100. ");
      Dé de;  
      de = new Dé();  
      de.setvaleur(100);
      
   }
}

     