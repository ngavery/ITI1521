/*************************Exemple2 Question e *********************/

public class TestBook {
   public static void main(String[] args) {
    Book book1 = new Book();
    book1.setAuthor("E.B.Koffman");
    book1.setTitle("Abstraction and Design Using Java");
    Book book2 = new Book("Duane A.Bailey", " Data Structures in Java for Principled Programmer ");
    System.out.println("Book of " + book1.getAuthor() + " is " + book1.getTitle());
     System.out.println("Book of " + book2.getAuthor() + " is " + book2.getTitle());
  }  
}