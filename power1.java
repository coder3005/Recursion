package Recursion;

public class numbers {
    public static int power(int n, int pow) {
        if(pow==0) {
            return 1;
        }
        return n*power(n,pow-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(power(n,3));
    }
}
//time complexity O(n)
