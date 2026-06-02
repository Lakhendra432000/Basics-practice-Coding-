package Methods;

import java.util.Scanner;

public class MaxOfThreeBuilt {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the numbes:");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c= sc.nextInt();
       //  System.out.println("maximum ="+ Math.max(Math.max(a,b),c));// max of three  number
         // Maximum in four number in built method
         int d= sc.nextInt();
         int max=Math.max(Math.max(a, b), Math.max(c, d));
         System.out.println("Maximum ="+ max);

    }
}
