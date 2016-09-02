import java.io.*;
import java.util.*;
public class Conversion
{
public static void main(String args[])
{
int tinc;
float tinf;
System.out.println("enter the temperature in celcius:");
Scanner sc=new Scanner(System.in);
tinc=sc.nextInt();
tinf=(tinc*(9/5))+32;
System.out.println("temperature in farenheit:"+tinf);
}
}
