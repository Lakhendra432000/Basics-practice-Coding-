package Arrays;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();

        int []arr=new int[n];

        System.out.print("enter the  element in array:");
        for (int i=0;  i<n;  i++){
            arr[i]= sc.nextInt();
        }
        // printing elements
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
        //double all array Elements
        for(int i=0; i<n; i++){
            System.out.println(2*arr[i]);
        }



    }
}
