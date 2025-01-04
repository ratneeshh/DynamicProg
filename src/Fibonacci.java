import java.util.HashMap;

public class Fibonacci {
//    public static void main(String[] args) {
//        int a = fibo(8);
//        System.out.println(a);
//    }
//    static int fibo(int n) {
//        if(n==0 || n==1)
//            return n;
//
//            return fibo(n-1)+fibo(n-2);
//    }

    public static void main(String[] args) {

        int a = fibo(8 , new HashMap<>());
        System.out.println(a);
    }

    static int fibo(int n ,HashMap<Integer , Integer> memo ) {

        if(n==0 || n==1)
            return n;

        if(memo.containsKey(n))
            return memo.get(n);

        int result = fibo(n-1 , memo) + fibo(n-2 , memo);
        memo.put(n , result);
        return result;


    }
}
