package com.company;
import java.util.Scanner;


public class UserInput {
public static void main(String[] args) {
    System.out.println("Enter the Integer Number");
    /*
     ?The s is object made is user-defined use in pre defined class Scanner.
     */
      Scanner s=new Scanner(System.in);
      int num1=s.nextInt();
      System.out.println("The Integer Number is:" +num1);
      System.out.println("Enter the Float Number");
      float num2=s.nextFloat();
      System.out.println("The float number is" +num2);
      System.out.println("Enter the Byte Number");
      byte num3=s.nextByte();
      System.out.println("The Byte Number is" +num3);
      System.out.println("Enter the long Number");
      long num4=s.nextLong();
      System.out.println("The Long type Number is" +num4);
      System.out.println("Enter the short Number");
      short num5=s.nextShort();
      System.out.println("The Short Number is" +num5);
      System.out.println("Enter the double Number");
      double num6=s.nextDouble();
      System.out.println("The Double number is" +num6);
      System.out.println("Enter the Boolean Number");
      boolean num7=s.nextBoolean();
      System.out.println("The Boolean Number is" +num7);

 }
    
}