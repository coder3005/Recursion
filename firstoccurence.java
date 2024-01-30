package Recursion;

public class numbers {
    public static int firstocc(int n[], int key, int i) {
        if(i==n.length) {
            return -1;
        }
        if(n[i]==key) {
            return i;
        }
        return firstocc(n,key,i+1);
    }
    public static void main(String[] args) {
        int n[]={1,5,4,2,6,5};
        System.out.println(firstocc(n,5,0));
    }
}

