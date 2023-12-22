import java.util.Scanner;
class Scan
{
public static void main(String args[])
{
char x;
System.out.println("Enter a character");
Scanner sc= new Scanner(System.in);
char chr=sc.next().charAt(0);
int asciivalue=chr;
System.out.println("Ascii value of char" +asciivalue);
}
}