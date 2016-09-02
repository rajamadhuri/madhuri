import java.io.*;
import java.util.*;
public class Lcmultiple
{
public static void main(String args[])
{
int a,b,min,max,x,lcm,i;
System.out.println("enter the values of a and b:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
if(a>b)
{
max=a;
min=b;
}
else
{
max=b;
min=a;
}
for(i=1;i<=min;i++)
{
x=max*i;
if(x%min==0)
{
lcm=x;
break;
}
}
System.out.println("lcm="+lcm);
}
}


