package Arrays;

import java.sql.SQLOutput;

public class PrintgivenArray {
     public static void main(String arg[]) {

       int[] arr = {12, 34, 34, 54, 34, -90};
       int n = arr.length;
//        for (int i = 0; i < n; i++) {
//              System.out.print(arr[i]+" ");
//        }
         //usig while loop
         int i=0;
         while(i<n){
             System.out.print(arr[i]+" ");
             i++;
         }


     }
}
