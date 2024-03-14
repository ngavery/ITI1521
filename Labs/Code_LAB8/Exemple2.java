/*Exemple2-LAB8:ITI1521*/

import java.io.*;
public class Exemple2 {
public static byte getInput()[] throws Exception{
byte in[ ] = new byte[50];
System.out.println("enter some text.");
System.out.println("only 50 bytes i.e. about 2 lines …");
System.out.println("press enter after each line to get input into the program");
for(int i=0; i<50; i++)
{
in[i] = (byte)System.in.read();
}
return in;
}
public static void main(String args[])throws Exception
{
byte input[] = getInput();
OutputStream myOutFile = new FileOutputStream("C:/YOUR PATH/write.txt");
for(int i=0; i<50; i++)
{
myOutFile.write(input [i]);
}
myOutFile.close();
int size;
InputStream myInFile = new FileInputStream ("C:/YOUR PATH/write.txt");
size = myInFile.available();
System.out.println("reading contents of file write.txt…");
for(int i=0; i<size; i++)
{
System.out.print((char)myInFile.read());
}
myInFile.close();
}
}