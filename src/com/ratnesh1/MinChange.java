package com.ratnesh1;

import java.util.HashMap;

public class MinChange {

//    public static void main(String[] args) {
//
//        int coins[] = {1,2,3};
//        int a = minC(5, coins);
//        System.out.println(a);
//
//    }
//
//    static int minC (int amount , int[] coins) {
//
//        if(amount == 0)
//            return 0;
//
//        if(amount < 0)
//            return -1;
//
//        int minCoins = -1;
//
//        for(int num : coins) {
//
//            int subAmt = amount - num;
//
//            int subCoins = minC(subAmt , coins);
//
//            if(subCoins != -1) {
//                int numCoins = subCoins+1;
//
//                if((numCoins < minCoins) || (minCoins == -1)) {
//                    minCoins = numCoins;
//                }
//            }
//        }
//        return minCoins;
//
//    }

    public static void main(String[] args) {

        int coins[] = {1,2,3};
        int a = minC(5, coins , new HashMap<>());
        System.out.println(a);

    }

    static int minC (int amount , int[] coins , HashMap<Integer,Integer> memo) {

        if(amount == 0)
            return 0;

        if(amount < 0)
            return -1;

        if(memo.containsKey(amount))
            return memo.get(amount);

        int minCoins = -1;

        for(int num : coins) {

            int subAmt = amount - num;

            int subCoins = minC(subAmt , coins , memo);

            if(subCoins != -1) {
                int numCoins = subCoins+1;

                if((numCoins < minCoins) || (minCoins == -1)) {
                    minCoins = numCoins;
                }
            }
        }
        memo.put(amount,minCoins);
        return minCoins;

    }

}
