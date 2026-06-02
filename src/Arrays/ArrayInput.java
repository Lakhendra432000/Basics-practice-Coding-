package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {

        // Creating Scanner class object sc to take user input through keyboard: java.util.Scannner used
        Scanner sc = new Scanner(System.in);

        // Take the size of integer array
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        // Declare array with the size
        int array[] = new int[size];

        System.out.println("Enter array elements: ");

        // Take input in array using index
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // Print Array using Arrays.toString() method; java.util.Arrays; used
        System.out.println(Arrays.toString(array));

        // Print Array using for loop
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}