import java.io.*;
import java.util.*;
class Leap
{
public static void main(String args[])
{
System.out.println("Enter a year:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%4==0)
{
System.out.println("The given year is a leap year");
}
else
{
System.out.println("The given year is not a leap year");
}
}
}
