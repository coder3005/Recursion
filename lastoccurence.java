package Recursion;

public class numbers {
    public static int lastocc(int n[], int key, int i) {
        if(i==n.length) {
            return -1;
        }
        int isFound=lastocc(n,key,i+1);
        if(isFound==-1 && n[i]==key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int n[]={1,5,4,2,6,5};
        System.out.println(lastocc(n,5,0));
    }
}

