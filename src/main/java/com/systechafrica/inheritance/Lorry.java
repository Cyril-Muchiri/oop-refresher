package com.systechafrica.inheritance;

public class Lorry extends Vehicle implements ICE {

    private int cylinders;

    // ! Must create a lorry constructor to reference super constructor Vehicle
    public Lorry(String name, String model, String color, String type,int cylinders) {
        super(name, model, color, type);
        this.cylinders = cylinders;

    }

    @Override
    public int numberOfEngineCylinders() {
        return cylinders;
    }

    @Override
    String showVehicleDetails() {
        return "Name : " + name + "\nType : " + type +
                "\nModel : " + model + "\nColor : " + color
                + "\nCylinders : " + cylinders;
    }

}
