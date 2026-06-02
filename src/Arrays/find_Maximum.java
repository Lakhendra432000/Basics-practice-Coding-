package Arrays;

import java.util.Scanner;

public class find_Maximum {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the the size of array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("Enter the Element in  array:");
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];      // int max=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
           if (arr[i]>max){
               max=arr[i];
           }
        }
        System.out.println("the maximum element in array="+max);




    }
}
