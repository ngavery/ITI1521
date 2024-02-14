/*************************Exemple2 Question c *********************/
public class Book {
  // Variables
  private String title, author;
  
 /*  Constructeur*/
  public Book(String a, String t) {
    author = a;
    title = t;
  }

  // Accesseurs
  public String getAuthor() {
    return author;
  }
  
public String getTitle() {
    return title;
  }

// Modificateurs
  public void setAuthor(String sA) {
    author = sA;
  }

  public void setTitle(String sT) {
    title = sT;
  }
  public String toString() {
    return "Book: " + title + " by " + author;
  }
    public void affiche() {
      System.out.println(toString());
    }
}
  

