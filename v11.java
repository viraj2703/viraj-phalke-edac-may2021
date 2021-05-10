import java.util.Scanner;
 public class v11
 {
     public static void main(String args[])
     {
         Scanner s1 =new Scanner(System.in);

         System.out.println("Enter First Number");
         double ino1=s1.nextDouble();
         System.out.println("Enter Second");
         double ino2=s1.nextDouble();
         double Area=(ino1*ino2);
         double Perimeter=2*(ino1+ino2);

         System.out.println("Area is :"+Area);
         System.out.println("Perimeter is :"+Perimeter);
     }
 }