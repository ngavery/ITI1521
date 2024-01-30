
/**************************Exemple3 LAB3 ********************************/
public class Book {
  // Variables
  private String title, author;
  private double price = -1.0;
  private boolean fixedPrice = false;
 
  // Constructeurs
 
  public Book(String a, String t) {
    this(a,t,0.0);
  }

  public Book(String a, String t, double p) {
    author = a;
    title = t;
    setPrice(p);     // l'appel au modificateur est plus sûr
  }

  // Accesseurs
  public String getAuthor() {
    return author;
  }
  
public String getTitle() {
    return title;
  }

public double getPrice() {
    return price;
  }

// Pas de methode setfixedPrice 
  public boolean isfixedPrice() {
    return fixedPrice ;
  }  


// Modificateurs
  public void setAuthor(String sA) {
    author = sA;
  }

  public void setTitle(String sT) {
    title = sT;
  }

public void setPrice(double p) {
    if (fixedPrice ) {
      System.err.println("Price is fixed !");
    }
    else if (p >= 0.0) {
      price = p;
      fixedPrice = true;
    }
    else {
      System.err.println("Error : negative price !");
    }
  }


 public void affiche() {
    System.out.print(toString());
  }

  public String toString() {
    return "Book[title=" + title + ", author=" + author + ", fixedPrice = " + fixedPrice + ", price = $" + price + "]";
  }
 
}



