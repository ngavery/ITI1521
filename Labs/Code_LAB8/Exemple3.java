/*Exemple3-LAB8:ITI1521*/

import java.io.*;
public class Exemple3
{  
public static void main(String [] args) throws IOException, FileNotFoundException  {
InputStreamReader input = null;
try {
input = new InputStreamReader( new FileInputStream("data.txt"));
int c;
while ( ( c = input.read() ) != -1 ) {
System.out.write( c );
}
}

catch(FileNotFoundException n)
{
System.out.println("exception generated : FileNotFoundException");
}
finally {
if ( input != null )
input.close();
System.out.println();
System.out.println("Inside finally");
}
}
}