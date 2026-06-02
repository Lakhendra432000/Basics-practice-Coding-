package Arrays;

public class Find_Minimum {
    public static void main(String[] args) {
        int []arr={19,38,39,30,78};
        int min=Integer.MAX_VALUE; // int  min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];

            }
        }
        System.out.println(min);

    }
}
