public class solution {
    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
    //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, source, destination, helper);
    //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + source + " to " + helper);
    //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}
