public class Tribonacci {

    public static void main(String[] args) {

        int a = tribo(7);
        System.out.println(a);
    }
    static int tribo(int n){
        if (n==0 || n==1)
            return 0;
        if(n==2)
            return 1;

        return tribo(n-1)+tribo(n-2)+tribo(n-3);
    }
}
