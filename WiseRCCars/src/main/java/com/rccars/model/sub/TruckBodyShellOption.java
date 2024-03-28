package com.rccars.model.sub;
import com.rccars.model.base.CarOptions;
import com.rccars.model.base.RCCar;
import java.math.BigDecimal;

public class TruckBodyShellOption extends CarOptions {
    public TruckBodyShellOption(RCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionPrice() {
        return BigDecimal.valueOf(30.99);
    }

    @Override
    public String getOptionName() {
        return "Truck Body Shell";
    }

    @Override
    public String toString() {
        return customRCCar.toString();
    }
}
