package org.example.recursiveAlgs;

public class CountPaths {

    static int exitX = 15;
    static int exitY = 4;
    static int[][] resultsHash = new int[exitX + 1][exitY + 1];

    public static void main(String[] args) {

        int countPaths = getPath(exitX - 1, exitY) + getPath(exitX, exitY - 1);
        System.out.println(countPaths);
    }

    static Integer getPath(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }

        if (x == 1 && y == 1) {
            return 1;
        }
        if (resultsHash[x][y] != 0) {
            return resultsHash[x][y];
        }

        resultsHash[x][y] = getPath(x - 1, y) + getPath(x, y - 1);
        return resultsHash[x][y];

    }
}