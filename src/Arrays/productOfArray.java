package Arrays;

public class productOfArray {
    public static void main(String[] args) {

          int []arr={3,7,3,8};
          int product=1;
//        System.out.print(" product of array elements:");
//        for(int i=0; i<arr.length; i++){
//            product *=arr[i];
//        }
//        System.out.print(product+" ");

        // solution 2nd using method
        lucky(arr);
        for(int i=0; i<arr.length; i++){
            product *=arr[i];

        }
        System.out.print(" product of arrays=" + product);


    }
    static void lucky(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
