package org.example;

public class BinaryCoupleSummSearch {

    static int[] arr = new int[]{-7, 0, 2, 3, 6, 8, 10, 15, 18, 20};
    static int sum = 10;

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            int res = binarySearch(sum, 0, arr.length - 1);
            System.out.println(arr[i]);
            System.out.println(res);
        }
    }

    static Integer binarySearch(int searchValue, int left, int right) {
        int middlePoint = (left + right) / 2;

        if (arr[middlePoint] == searchValue) {
            return arr[middlePoint];
        } else if (arr[middlePoint] > searchValue) {
            right = middlePoint - 1;
        } else if (arr[middlePoint] < searchValue) {
            left = middlePoint + 1;
        }
        return binarySearch(searchValue, left, right);
    }
}
