package com.rccars.model.base;
import java.math.BigDecimal;

public class CarOptions extends RCCar{
    protected RCCar customRCCar;

    public CarOptions(RCCar car) {
        super(car.getFrameColor(), car.getRemoteController(), car.getRechargeableBattery(), car.getCharger());
        customRCCar = car;
    }

    @Override
    public String getWheelType() {
        return customRCCar.getWheelType();
    }
    @Override
    public String getTireType() {
        return customRCCar.getTireType();
    }
    @Override
    public String getBodyFrameType() {
        return customRCCar.getBodyFrameType();
    }
    @Override
    public String getShocksType() {
        return customRCCar.getShocksType();
    }
    @Override
    public String getMotorType() {
        return customRCCar.getMotorType();
    }
    @Override
    public String getModelNumber() {
        return customRCCar.getModelNumber();
    }
    @Override
    public int getUCPPrefix() {
        return customRCCar.getUCPPrefix();
    }
    @Override
    public int getStartingCount() {
        return customRCCar.getStartingCount();
    }
    @Override
    public BigDecimal getPrice() {
        return customRCCar.getPrice();
    }
    @Override
    public String getSerialNumber() {
        return customRCCar.getSerialNumber();
    }
}
