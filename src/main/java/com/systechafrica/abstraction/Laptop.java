package com.systechafrica.abstraction;

public class Laptop extends Computer {

    private String laptopProcessor;
    private String laptopName;

    public Laptop(String laptopName,String laptopProcessor) {
        this.laptopName = laptopName;
        this.laptopProcessor=laptopProcessor;
    }

    @Override
    String showModelCpu() {
        return "This " + laptopName + " uses " + laptopProcessor;
    }

}
