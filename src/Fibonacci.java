public class Fibonacci {
    public static void main(String[] args) {
        int a = fibo(8);
        System.out.println(a);
    }
    static int fibo(int n) {
        if(n==0)
            return 0;

        if(n==1)
            return 1;

        else
            return fibo(n-1)+fibo(n-2);
    }
}
