package Arrays;

public class p_SecondMaximum {
    public static void main(String[] args) {
        //Find Second Largest Element in Array
        int[] arr = {10,5,20,8};
        int max= Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] >max){
                max=arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > smax && arr[i]!= max){
                smax = arr[i];
            }
        }
        System.out.println("the second largest number an array is "+ smax +" ");



    }
}
