package Recursion;

public class numbers {
    public static void alloccurences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            
            System.out.print(i+" ");
        }
        alloccurences(arr,key,i+1); //if you write i++ then it will go infinite
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        alloccurences(arr, 2, 0);
        
    }
}
