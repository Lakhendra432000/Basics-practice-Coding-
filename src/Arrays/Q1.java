package Arrays;
//multiply odd index element by 2 and add 10 in odd indexed element
public class Q1 {
    public static void main(String[] args) {
        int []arr={12,2,23,5,6,7};
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                arr[i]+=10;
            }
            else {
                arr[i]*=2;
            }
            System.out.print(arr[i]+" ");
        }

    }
}
