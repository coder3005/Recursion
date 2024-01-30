package Recursion;

public class numbers {
    public static int power(int n, int pow,int count) {
        // int count=0;
        if(count>=0) {
            count++;
            if(count==pow) {
                return n;
            }
            return n*power(n,pow,count);
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(power(n,3,0));
    }
}

