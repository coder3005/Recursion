/* Factorial using Recursion */
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {

        int n;
        System.out.print("Enter any Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        A obj=new A();
        int result=obj.fact(n);
        System.out.print("Factorial of Given Number: "+result);
    }
    int fact(int n)
    {
        if(n==1)
            return 1;
        else    
            return n*fact(n-1);
    }
}
