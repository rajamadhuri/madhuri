import java.io.*;
import java.util.*;
public class Swap
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("values of a"+a+"and b"+b+"before swapping:");
a=a^b;
b=a^b;
a=a^b;
System.out.println("values of a"+a+"and b"+b+"after swapping:");
}
}
