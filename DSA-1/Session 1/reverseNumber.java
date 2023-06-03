import java.util.Scanner;

public class reverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        System.out.println("The Reverse number is :"+revNum(num));
    }
    static int revNum(int n){
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            n=n/10;
        }
        return rev;
    }
}