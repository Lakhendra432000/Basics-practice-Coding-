package Arrays;

public class SumOfTwoElement {
    public static void main(String[] args){
        // target 10+18=28
        int []arr={10,17,18,91,15,16};
        int target=29;
        boolean found=false;
        for(int i=0; i<arr.length;  i++){
            for(int j=i+1; j< arr.length;  j++){
                if(arr[i]+arr[j]==target) {
                    found=true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(found)
            System.out.println("target is found :");
        else
            System.out.println(" target is not found:");

    }
}
