import java.util.HashMap;

public class Tribonacci {

//    public static void main(String[] args) {
//
//        int a = tribo(7);
//        System.out.println(a);
//    }
//    static int tribo(int n){
//        if (n==0 || n==1)
//            return 0;
//        if(n==2)
//            return 1;
//
//        return tribo(n-1)+tribo(n-2)+tribo(n-3);
//    }

    public static void main(String[] args) {

        int a  = tribo(7, new HashMap<>());
        System.out.println(a);
    }

    static int tribo(int n , HashMap<Integer, Integer> memo) {

        if(n==0 || n==1)
            return 0;

        if(n==2)
            return 1;

        if(memo.containsKey(n))
            return memo.get(n);

        int result = tribo(n-1 , memo) + tribo(n-2 , memo) + tribo(n-3 , memo);
        memo.put(n , result);
        return result;
    }
}
