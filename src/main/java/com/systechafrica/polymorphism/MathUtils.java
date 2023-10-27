package com.systechafrica.polymorphism;

public class MathUtils {

    // * This method (add) morphs into different implementations

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int... numbers) {
        int sum = a + b;
        for (int i : numbers) {
            sum += i;
        }
        return sum;

    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double... numbers) {
        double sum = a + b;
        for (double d : numbers) {
            sum += d;
        }
        return sum;
    }

    public String add(String a, String b) {
        return a + b;
    }

}
