
  
public class Test {
   public static void main(String[] args) {
     
        // Create two libraries
        Library firstLibrary = new Library("UOttawa");
        Library secondLibrary = new Library("Ottawa");

        // Add four books to the first library
         Book book1= new Book("Abstraction and Design Using Java");
         book1.addKeyWord("Java");
         
         Book book2= new Book("Data Structures in Java for Principled Programmer");
         book2.addKeyWord("Java");
       
         Book book3= new Book("Le petit Robert");
         book3.addKeyWord("Dico");
         
         Book book4= new Book("Sciences et vie");
         book4.addKeyWord("Revue");
         
        firstLibrary.add(book1);
        firstLibrary.add(book2);
        firstLibrary.add(book3);
        firstLibrary.add(book4);
        
        // lterate with "Java" keyWord
	Iterator<Book> i = firstLibrary.iterator("Java");
    
    
        while ( i.hasNext ( ) ) {
          System.out.println( i.next().getTitle())  ;
        }
    
   }
  
}

