package org.example;

import java.util.ArrayList;

public class BinaryVector {

    static int[] vectorArr = new int[]{0,1,1,1,0,1,1,1,1,0,0};

    static ArrayList<Integer> maxArr = new ArrayList<>();
    static ArrayList<Integer> currentArr = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < vectorArr.length; i++) {
            if (vectorArr[i] == 1) {
                currentArr.add(1);
                if (currentArr.size() >= maxArr.size()) {
                    maxArr = currentArr;
                }
            } else {
                currentArr = new ArrayList<>();
            }
        }

        System.out.println(maxArr.size());
    }

}
