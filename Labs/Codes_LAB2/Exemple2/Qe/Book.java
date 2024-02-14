/*************************Exemple2 Question e *********************/
public class Book {
  // Variables
  private String title, author;
 
  // Constructeurs
  public Book() {
  }

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

}
