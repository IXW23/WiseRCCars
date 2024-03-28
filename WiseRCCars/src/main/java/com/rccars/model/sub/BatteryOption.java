package com.rccars.model.sub;

import com.rccars.model.base.CarOptions;
import com.rccars.model.base.RCCar;

import java.math.BigDecimal;

public class BatteryOption extends CarOptions {
    public BatteryOption(RCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionPrice() {
        return BigDecimal.valueOf(14.99);
    }

    @Override
    public String getOptionName() {
        return "Battery Option";
    }

    @Override
    public String toString() {
        return customRCCar.toString();
    }
}
