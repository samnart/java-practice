package org.example;


public class Main {
    public static double main(String operation, double a, double b) {
        if (operation.equalsIgnoreCase("add")) {
            return add(a, b);
        } else if (operation.equalsIgnoreCase("multiply")) {
            return multipy(a, b);
        }
        return -1;
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double multipy(double a, double b) {
        return Math.pow(a, b);
    }
}