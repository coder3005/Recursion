package Recursion;
// 0 1 1 2 3 5 ....
// 0th 1st 2nd .... -> position

public class numbers {
    public static int fibonacci(int n) {
        if(n==0 || n==1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fibonacci(n));
    }
}

