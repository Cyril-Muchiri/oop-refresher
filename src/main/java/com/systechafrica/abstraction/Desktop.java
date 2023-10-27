package com.systechafrica.abstraction;

public class Desktop extends Computer {

    private String desktopProcessor;
    private String desktopName;

    public Desktop(String name, String processor) {
        this.desktopProcessor = processor;
        this.desktopName = name;
    }

    @Override
    String showModelCpu() {
        return "This " + desktopName + " uses " + desktopProcessor;
    }

}
