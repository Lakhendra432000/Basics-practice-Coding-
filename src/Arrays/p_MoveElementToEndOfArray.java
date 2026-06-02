package Arrays;

public class p_MoveElementToEndOfArray {
     public static void main(String[] args) {
         //Move all zeros to end of array
         int[] arr = {0,2,4,0,6};
         int j = 0;
         for(int i = 0; i < arr.length; i++){
             if(arr[i]!=0){
                 int temp= arr[i];
                 arr[i] = arr[j];
                 arr[j]=temp;
                 j++;

             }
         }
         for(int num : arr){
             System.out.print(num + " ");
         }

    }
}
//I used a two-pointer approach where I move all non-zero elements to the front while maintaining their order. This solution runs in O(n) time and O(1) space.
