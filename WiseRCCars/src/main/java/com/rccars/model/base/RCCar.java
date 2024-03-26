package com.rccars.model.base;
import java.math.BigDecimal;

public abstract class RCCar {
    private FrameColors color;
    private String serialNumber;
    private String remoteController;
    private String rechargeableBattery;
    private String charger;

    public RCCar(FrameColors color, String remoteController, String rechargeableBattery, String charger) {
        this.color = color;
        this.remoteController = remoteController;
        this.rechargeableBattery= rechargeableBattery;
        this.charger = charger;
    }

    public abstract String getWheelType();
    public abstract String getTireType();
    public abstract String getBodyFrameType();
    public abstract String getShocksType();
    public abstract String getMotorType();
    public abstract String getModelNumber();
    public abstract int getUCPPrefix();
    public abstract int getStartingCount();
    public abstract BigDecimal getPrice();

    public void chooseFrameColor(FrameColors color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public FrameColors getFrameColor() {
        return color;
    }

    public String getRemoteController() {
        return remoteController;
    }

    public String getRechargeableBattery() {
        return rechargeableBattery;
    }

    public String getCharger() {
        return charger;
    }

    public BigDecimal getOptionAmount() {
        return BigDecimal.valueOf(0.0);
    }

    public String getOptionName() {
        return "";
    }
}
