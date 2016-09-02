import java.io.*;
import java.util.*;
public class Cuboid
{
public static void main(String args[])
{
int l,b,h,tca,vol;
System.out.println("enter the length,breadth and height for cuboid:");
Scanner sc=new Scanner(System.in);
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();
tca=((2*l*b)+(2*b*h)+(2*l*h));
vol=l*b*h;
System.out.println("total surface area="+tca);
System.out.println("volume="+vol);
}
}
