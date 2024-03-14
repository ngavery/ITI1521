/*Exemple1-LAB8:ITI1521*/
  
import java.io.InputStreamReader;
import java.io.IOException;

public class Exemple1{
    public static void main( String[] args ) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
     
        char[] buffer = new char[ 256 ];
        System.out.println(" Enter some characters : ") ;
        
        in.read( buffer);
        String str = new String (buffer) ;
  
       
        System.out.println( " Characters read are " + str);
 
    }
}
