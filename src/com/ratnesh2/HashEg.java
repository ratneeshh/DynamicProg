package com.ratnesh2;

import java.util.HashMap;

public class HashEg {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap();

        map.put("Ratnesh", 85);
        map.put("Anant", 98);
        map.put("Ravi", 91);

        System.out.println(map.get("Anant"));
    }
}
