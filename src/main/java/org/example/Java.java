package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("count")){
            list.add(sc.nextInt());
        }

        sc.close();
        HashMap<Integer,Integer> result= countElements(list);
        for(int key: result.keySet()){
            System.out.println(key + " : "+result.get(key));
        }
    }

    public static HashMap<Integer,Integer> countElements(ArrayList<Integer> list){
        HashMap<Integer,Integer> result= new HashMap<>();
        for(int i : list){
            if(!result.containsKey(i)){
                result.put(i,1);
            }else{
                result.put(i, result.get(i)+1);
            }
        }
        return result;
    }
}