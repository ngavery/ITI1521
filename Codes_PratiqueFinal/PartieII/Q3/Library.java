import java.util.NoSuchElementException;

import java.util.ArrayList; // import the ArrayList class

public class Library extends ArrayList<Book>{
  private String name;

  public Library(String name){
    super();
    this.name = name;
  }

  public Iterator<Book> iterator(String str){
    return this.new LibraryIterator(str);
  }

  // LibraryIterator inner class 
  class LibraryIterator implements Iterator<Book>{
    int index;
    String keyWord;

    private LibraryIterator(String keyWord){
      this.index=0; 
      this.keyWord = keyWord;
    }

    public boolean hasNext(){
      // VOTRE CODE ICI
    }

    public Book next(){
       if(this.index>=Library.this.size()) throw new NoSuchElementException();//"Plus d’elements"
      else{
      // VOTRE CODE ICI
      }
    }

    public void remove(){}
  } //end of LibraryIterator
  
}// end of Library