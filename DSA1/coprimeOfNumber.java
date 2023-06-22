public class coprimeOfNumber {
    public static void main(String[] args){
        System.out.println("GCD of the two is "+GCD(2,3));
        int n=9;
        System.out.println("Number of Coprimes of "+n+" are "+coprimeNumbers(n));
    }
    static int coprimeNumbers(int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(GCD(n, i)==1){
                count++;
            }
        }
        return count;
    }
    static int GCD(int a, int b){
        if(a==0) return b;
        else if(b==0) return a;
        else if(a==b) return a;
        else if(a>b) return GCD(a-b,b);
        else return GCD(a,b-a);
    }
}
