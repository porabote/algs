package org.example.recursiveAlgs;

public class CoinsTask {

    static int nominalFirst = 3;
    static int nominalSecond = 5;

    public static void main(String[] args) {
        Boolean can17 = coinsTask(17);
        System.out.println(can17);

        Boolean can9 = coinsTask(7);
        System.out.println(can9);
    }

    static Boolean coinsTask(Integer sum) {

        if (sum.equals(nominalFirst) || sum.equals(nominalSecond)) {
            return true;
        }

        if (sum >= nominalFirst && coinsTask(sum - nominalFirst)) {
            return true;
        }

        if (sum >= nominalSecond && coinsTask(sum - nominalSecond)) {
            return true;
        }

        return false;
    }

}
