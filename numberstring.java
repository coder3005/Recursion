package Recursion;

public class numbers {
    public static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int n) {
        if(n==0) {
            return;
        }
        int lastDigit=n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void main(String[] args) {
        int n=1238;
        if(n%10!=0)  {
        printDigits(n);
        }
        else {
            System.out.println("last digit of a number can't be zero");
        }
    }
}
