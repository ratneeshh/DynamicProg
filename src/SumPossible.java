

public class SumPossible {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(testSum(5 , arr));
    }
    static boolean testSum(int n, int[] arr) {

        if(n == 0)
            return true;

        if (n < 0) {
            return false;
        }

        for (int i = 0; i < arr.length ; i++) {

            if(testSum(n-arr[i] , arr)) {
                return true;
            }
        }
        return false;


    }
}
