package org.zygiert;

public class Main {
    static void main(String[] args) {
        var nrOfIterations = Integer.parseInt(args[0]);
        var sum = 0;
        for (int i = 1; i <= nrOfIterations; i++) {
            sum += resolveNumber(i);
        }
        IO.println("My fantastic sum is: " + sum);
    }

    private static int resolveNumber(int i) {
        if (i < 20000) {
            return i;
        } else {
            return i * 2;
        }
    }
}
