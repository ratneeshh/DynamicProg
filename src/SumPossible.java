import java.util.HashMap;

public class SumPossible {

//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3};
//        System.out.println(testSum(5 , arr));
//    }
//    static boolean testSum(int n, int[] arr) {
//
//        if(n == 0)
//            return true;
//
//        if (n < 0) {
//            return false;
//        }
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            if(testSum(n-arr[i] , arr)) {
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3};
//        System.out.println(testSum(5 , arr));
//    }
//    static boolean testSum(int n, int[] arr) {
//
//        if(n == 0)
//            return true;
//
//        if (n < 0) {
//            return false;
//        }
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            if(testSum(n-arr[i] , arr)) {
//                return true;
//            }
//        }
//        return false;
//
public static void main(String[] args) {

    int[] arr = {1,2,3};
    System.out.println(testSum(5 , arr  , new HashMap<>()));
}
    static boolean testSum(int n, int[] arr, HashMap<Integer , Boolean> memo) {

        if(n == 0)
            return true;

        if (n < 0) {
            return false;
        }

        if(memo.containsKey(n))
            return memo.get(n);

        for (int i = 0; i < arr.length ; i++) {

            if(testSum(n-arr[i] , arr , memo)) {
                memo.put(n, true);
                return true;
            }
        }

        memo.put(n , false);
        return false;

    }

}
