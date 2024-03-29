package Recursion;

public class numbers {
    public static int factorial(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
//time complexity O(n)
//space complexity O(n)

