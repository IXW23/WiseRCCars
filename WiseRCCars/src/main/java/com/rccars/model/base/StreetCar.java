package com.rccars.model.base;

public abstract class StreetCar extends RCCar {
    public StreetCar(FrameColors color, String remoteController, String rechargeableBattery, String charger) {
        super(color, remoteController, rechargeableBattery, charger);
    }

    @Override
    public String getWheelsAndTiresType() {
        return "Regular";
    }

    @Override
    public String getBodyFrameType() {
        return "Plastic";
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
