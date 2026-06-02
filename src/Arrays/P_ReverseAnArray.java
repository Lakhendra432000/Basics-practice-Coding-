package Arrays;

public class P_ReverseAnArray {
    static void main(String[] args) {
//        System.out.println("the Reverse array is :");
//        int [] arr = {1,2,3,4,5};
//        for(int i = arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+" ");
//        }

        //Reverse array without printing, actually change array
        int [] arr ={1,2,3,4,5};
        // we use two pointers
        int start = 0, end=arr.length-1;
        while (start < end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
//explaination:-I used a two-pointer approach where one pointer starts from the beginning and the other from the end.I swap elements until they meet in the middle. This approach has O(n) time complexity and O(1) space complexity.


    }
}
