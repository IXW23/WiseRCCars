package com.rccars.controller;

public class SerialNumberGenerator {
    private static SerialNumberGenerator generate;
    private String modelNumberValue;
    private int UCPPrefixValue;
    private int startingCountValue;

    public static synchronized SerialNumberGenerator getInstance() {
        if(generate == null) {
            generate = new SerialNumberGenerator();
        }
        return generate;
    }

    private SerialNumberGenerator() {}

    public synchronized void startGeneration(String modelNum, int UCPPrefix, int startingCount) {
        modelNumberValue = modelNum;
        UCPPrefixValue = UCPPrefix;
        startingCountValue = startingCount;
    }

    public synchronized String getNextSerialNumber() {
        return modelNumberValue + (UCPPrefixValue) + (++startingCountValue);
    }

    public synchronized int getRecentNumber() {
        return  startingCountValue;
    }
}
