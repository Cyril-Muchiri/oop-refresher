package com.systechafrica.inheritance;

//*  Extends both EV & ICE classes
public class Hybrid extends Vehicle implements EV, ICE {
    private int noOfMotors;
    private int noOfCylinders;

    public Hybrid(String name, String model, String color, String type, int noOfMotors, int noOfCylinders) {
        super(name, model, color, type);
        this.noOfCylinders = noOfCylinders;
        this.noOfMotors = noOfMotors;
    }

    @Override
    public int numberOfEngineCylinders() {
        return noOfCylinders;
    }

    @Override
    public int noOfMotors() {
        return noOfMotors;
    }

    //overrides this method to add some params
    @Override
    String showVehicleDetails() {
        return "Name : " + name + "\nType : " + type +
                "\nModel : " + model + "\nColor : " + color
                + "\nMotors : " + noOfMotors
                + "\nCylinder : " + noOfCylinders;
    }

}
