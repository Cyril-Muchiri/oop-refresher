package com.systechafrica.inheritance;

public class App {
    public static void main(String[] args) {
        Lorry actros = new Lorry("Mercedes", "Actros", "White", "Lorry", 8);
        actros.move();
        System.out.println(actros.showVehicleDetails());

        System.out.println();//skip a line

        Hybrid insight = new Hybrid("Honda", "Insight", "Black", "Hybrid", 1, 4);
        insight.stop();
        System.out.println(insight.showVehicleDetails());
    }

}
