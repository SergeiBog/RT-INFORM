package org.example;

import java.util.*;

public class Java {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("count")) {
            list.add(sc.nextInt());
        }

        sc.close();
        Map<Integer, Integer> result = countElements(list);
        for (int key : result.keySet()) {
            System.out.println(key + " : " + result.get(key));
        }
    }

    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i : list) {
            if (!result.containsKey(i)) {
                result.put(i, 1);
            } else {
                result.put(i, result.get(i) + 1);
            }
        }
        return result;
    }
}