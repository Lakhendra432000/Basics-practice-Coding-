package Arrays;

public class passingArrayToMethod {
    public static void main(String[] args) {
        int []arr={18,73,7,8,99};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[3]);



    }
    static void change(int []x){         // int []x , is reference variable

        x[2]=76;
        x[3]=88;
        System.out.println(x[2]);

    }
}
// note:- whenever we pass arr[] to methods the array is passed by reference
// memory address will be  same for both methods for example:- arr/x={18,73,7,8,99}; because here we pass reference not value