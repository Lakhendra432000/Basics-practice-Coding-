package Arrays;

public class Reverse {
    public static void main(String[] args) {
        int []arr={19,81,18,18,12,21};
        int n=arr.length;
        int i=0, j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0; k< n; k++){
            System.out.print(arr[k]+" ");
        }
        // using for each to print array
//        for(int ele : arr)
//            System.out.print( ele  +" ");

    }
}
