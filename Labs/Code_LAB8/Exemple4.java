/**
 * Exemple4-LAB8:ITI1521
 * - To Upper letters
 *
 */
import java.io.*;

public class Exemple4{
    public static void main(String [] args)
    {
    try {
     // Cr�ation du flot de lecture par octet
     InputStream is = new FileInputStream("C:/YOUR PATH/write.txt"); 
     // Cr�ation du flot de lecture par caract�res
     Reader source =  new InputStreamReader(is);
     int c;
     System.out.println("Les caract�res de votre fichier write.txt en majuscule sont : ");
     while ((c = source.read()) >= 0)
       
     System.out.write(Character.toUpperCase((char) c));
     System.out.println();
     source.close();
     }	
     catch(IOException e) {
     System.err.println("Error : " + e.getMessage());
     }
     }
   
}