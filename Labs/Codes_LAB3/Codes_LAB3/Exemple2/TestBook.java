
/*Exemple2 LAB3*/

public class TestBook {
   public static void main(String[] args) {
    Book book1 = new Book("E.B.Koffman ", "Abstraction and Design Using Java");
    Book book2 = new Book("Duane A.Bailey", " Data Structures in Java for Principled Programmer ");
    book1.setPrice(100.0); 
    System.out.println(book1);
    book2.setPrice(120.0);
    book2.affiche();
    System.out.println();
  }  
}
 