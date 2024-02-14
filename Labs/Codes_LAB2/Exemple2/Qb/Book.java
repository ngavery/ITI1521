/*************************Exemple2 Question b *********************/
public class Book {
  // Variables
  private String title, author;
  
  // Constructeur
  public Book(String a, String t) {
    author = a;
    title = t;
  }

  // Accesseurs
  public String getAuthor() {
    return author;
  }
  
public static void main(String[] args) {
    Book book1 = new Book("E.B.Koffman ", "Abstraction and Design Using Java");
    Book book2 = new Book("Duane A.Bailey", " Data Structures in Java for Principled Programmer ");
    System.out.println("Book of " + book1.getAuthor());
    System.out.println("Book of " + book2.getAuthor());
  }
}

