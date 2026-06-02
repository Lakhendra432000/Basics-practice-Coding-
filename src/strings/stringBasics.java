package strings;

import java.util.Scanner;

public class stringBasics {
    public static void main(String[] args){
        // Declaration of string
        String str=" Welcome in string ";
        System.out.println(str);
        // taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :-");
        String s = sc.nextLine();
        System.out.println(s);
        // how find the length of string length
        System.out.println("the length of string is :"+  s.length());
        // finding index of string
        System.out.println("Character at index 3  is :" + s.charAt(3));


    }
}
