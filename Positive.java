import java.io.*;
import java.util.*;
class Positive
{
public static void main(String args[])
{
System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0)
{
System.out.println("The given number is positive");
}
else
{
System.out.println("The given number is negative");
}
}
}
