import java.io.*;
import java.util.*;
public class Alphabets{
public static void main(String args[])
{
String text=" ";
Scanner sc=new Scanner(System.in);
text=sc.nextLine();
String digit=text.replaceAll("[^0-9.]", "");
System.out.println(digit);
}
}
