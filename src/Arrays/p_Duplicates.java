package Arrays;

public class p_Duplicates {
   public static void main(String[] args) {
       // find duplicates an array
       int []arr ={2,4,4, 3,2, 5};
       for(int i = 0; i < arr.length; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] == arr[j]) {
                   System.out.print("the duplicates: " + arr[i]);

               }
           }
       }


    }
}
