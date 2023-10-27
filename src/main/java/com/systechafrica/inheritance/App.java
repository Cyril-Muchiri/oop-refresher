package com.systechafrica.inheritance;

public class App {
    public static void main(String[] args) {
        Lorry actros = new Lorry("Mercedes", 8, "Actros", "White", "Lorry");
        actros.move();
        System.out.println(actros.showVehicleDetails());

        Hybrid insight = new Hybrid("Honda", "Insight", "Black", "Hybrid", 1, 4);
        insight.stop();
        System.out.println(insight.showVehicleDetails());
    }

}
