package Recursion;

public class numbers {
    public static int optimizedpower(int n, int pow) {
        if(pow==0) {
            return 1;
        }
        int halfPower=optimizedpower(n,pow/2);
        //int halfPowerSq=optimizedpower(n,pow/2)*optimizedpower(n,pow/2); //TC O(n)
        int halfPowerSq=halfPower*halfPower; //TC O(log n)
        //pow is odd
        if(pow%2!=0) {
            halfPowerSq=n*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(optimizedpower(n,3));
    }
}
//time complexity O(logn)

