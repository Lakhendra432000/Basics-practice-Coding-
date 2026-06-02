package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sumOfArray {
     public static void main(String[] args) {
//         // sum of array
//         int arr[]={14,13,16,16};
//         int sum=0;
//         for(int i=0; i<arr.length; i++){
//             sum=sum+arr[i];
//         }
//         System.out.println(sum);

         // sum of array by taking user input
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of  arrays:");
         int n=sc.nextInt(),sum=0;
         int []arr=new int[n];

         System.out.println("Enten the Elements in arrays:");
         for (int i=0; i<n; i++){
             arr[i]=sc.nextInt();
         }
         for(int i=0; i<n; i++){
             sum=sum+arr[i];
         }
         System.out.println( "the sum of the arrays=" + sum);

    }
}
