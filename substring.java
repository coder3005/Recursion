//all substrings
package Recursion;

public class solution {
    public static void printSubstrings(String str, int start) {
        if(start==str.length()) return;

        StringBuilder sb=new StringBuilder();
        for(int end=start; end<str.length();end++) {
            sb.append(str.charAt(end));
            System.out.print(sb+" ");
        }
        printSubstrings(str,start+1);
    }
    public static void main(String[] args) {
        String str="abcbd";
        printSubstrings(str,0);
    }
}
