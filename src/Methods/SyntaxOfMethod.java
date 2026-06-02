package Methods;
public class SyntaxOfMethod {
    static void demo(){

        System.out.println("Welcome in methods: ");
    }
    static void sum(){
        int a=8;
        int b=7;
        int sum=a+b;
        System.out.println(sum);
        hello();
    }
    public static void main(String[] args) {
        System.out.println("Go note below the to understand:");

        demo();    // calling in method/function
        sum();
        hello();

    }
    static void hello(){
        System.out.println("you can do it : ");

    }
}
// note:-
