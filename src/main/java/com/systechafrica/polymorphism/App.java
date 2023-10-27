package com.systechafrica.polymorphism;

public class App {
    public static void main(String[] args) {
        MathUtils addUtils = new MathUtils();
        String resultString = addUtils.add("Yeah ", "Boooouy!!");
        double resultDouble = addUtils.add(30.1, 12.8);
        double resultDoubles = addUtils.add(20.3, 0, 78.9, 40, 8, 3.3);
        int resultInt = addUtils.add(10, 10);
        int resultInts = addUtils.add(10, 10, 10, 10, 12);

        System.out.println(resultString);
        System.out.println(resultDouble);
        System.out.println(resultDoubles);
        System.out.println(resultInt);
        System.out.println(resultInts);
    }
}
