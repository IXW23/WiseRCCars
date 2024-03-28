package com.rccars.model.base;

public abstract class OffRoadCar extends RCCar {
    public OffRoadCar(FrameColors color, String remoteController, String rechargeableBattery, String charger) {
        super(color, remoteController, rechargeableBattery, charger);
    }

    @Override
    public String getWheelsAndTiresType() {
        return "Wide";
    }

    @Override
    public String getBodyFrameType() {
        return "Metal";
    }

    @Override
    public String getShocksType() {
        return "Spring";
    }

    @Override
    public String getMotorType() {
        return "Electric";
    }
}
