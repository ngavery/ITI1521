
import java.util.ArrayList; // import the ArrayList class

public class Book{
  private String title;
  private ArrayList<String> keyWords;

  public Book(String title){
    this.title = title;
    this.keyWords = new ArrayList<String>();
  }

  public void addKeyWord(String str){
    this.keyWords.add(str);
  }

  public boolean hasKeyWord(String str){
    for(String s:this.keyWords){
      if(s.equals(str)) 
        return true;
    }
    return false;
  }
  
  public String getTitle(){
  return title;
  }
}
