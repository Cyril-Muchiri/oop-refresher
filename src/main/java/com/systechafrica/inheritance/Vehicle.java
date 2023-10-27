package com.systechafrica.inheritance;

public class Vehicle {

     String model;
     String color;
     String type;
     String name;

    
    public Vehicle(String name,String model, String color, String type) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.name=name;
    }

    String showVehicleDetails(){
        return "Name : "+name+"\nType : "+type+"\nModel : "+model+"\nColor : "+color;
    }

    void move() {
        System.out.println("This " + type + " is moving");
    }

    void stop() {
        System.out.println("This " + type + " has stopped!!");
    }

}
