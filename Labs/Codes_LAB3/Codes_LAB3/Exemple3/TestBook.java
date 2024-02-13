
/****************************Exemple3 LAB3************************/

public class TestBook {
   public static void main(String[] args) {
    Book book1 = new Book("E.B.Koffman ", "Abstraction and Design Using Java");
    Book book2 = new Book("Duane A.Bailey", " Data Structures in Java for Principled Programmer ", 120);
    Book book3 = new Book("Pattern in Java", "Mark Grand", 250.0);
    book1.setPrice(100.0); 
    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    
    // Creer 2 objets Accountant 
    Accountant account1 = new Accountant();
    Accountant account2 = new Accountant();

    // Comptabilise certains livres 
    account1.count(book1 );
    account1.count(book2 );
    account2.count(book3 );

    // Affiche le prix total 
    System.out.print("total book prices recorded by the 1st accountant is : $ ");
    System.out.println(account1.getTotalPrice());
    System.out.print("total book prices recorded by the second accountant is : $ ");
    System.out.println(account2.getTotalPrice());
  }
}

