package Recursion;

public class numbers {
    public static void length(String str, int i) {
        if(i==str.length()-1) {
            System.out.println(i+1);
            return;
        }
        
        length(str,i+1);
        
    }
    public static void main(String[] args) {
        String sc="abhi gupta";
        length(sc,0);
    }
}
