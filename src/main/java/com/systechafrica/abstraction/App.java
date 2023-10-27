package com.systechafrica.abstraction;

public class App {
    public static void main(String[] args) {
        Laptop lennovo = new Laptop("Lennovo", "Intel core i7");
        Desktop dellOptiplex = new Desktop("Dell-optiplex", "Core i9");

        System.out.println(dellOptiplex.showModelCpu());
        System.out.println(lennovo.showModelCpu());
    }

}
