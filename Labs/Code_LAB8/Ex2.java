/*Exercice2-LAB8:ITI1521*/

public class Ex2{
public static void main(String [] args){
try
{
int[] array = new int[-5];
}
catch (NegativeArraySizeException e)
{
System.out.println("Exception generated :" + e);
}

System.out.println(" After the try block");
}
}
