public class sumOfDigit {
   public static void main(String[] args) {

       int digit=1980, sum=0;

       for(int i=1; i<digit; i++) {
           int rem = digit % 10;
           digit = digit / 10;
           sum = sum + rem;


       }
       System.out.println(sum);

    }
}
