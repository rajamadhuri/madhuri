import java.io.*;
import java.util.*;
public class Permutation
{
public static void main(String args[])
{
int i,j,n,r,fact=1,d,fact1=1,npr;
System.out.println("enter the values for n and r:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
r=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
d=n-r;
for(j=1;j<=d;j++)
{
fact1=fact1*d;
}
npr=fact/fact1;
System.out.println("permutation:"+npr);
}
}



