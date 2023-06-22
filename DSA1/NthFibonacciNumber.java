import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the nth number of the Fibonacci series ");
        int n=sc.nextInt();
        System.out.println(n+" th Fibonacci number is "+fib(n));
    }
    static int fib(int n){
        int[] fib=new int[21];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<21;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i:fib){
            System.out.print(i+" ");
        }
        
        return fib[n];
    }
}
