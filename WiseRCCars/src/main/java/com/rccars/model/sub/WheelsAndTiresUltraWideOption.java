package com.rccars.model.sub;
import com.rccars.model.base.CarOptions;
import com.rccars.model.base.RCCar;
import java.math.BigDecimal;

public class WheelsAndTiresUltraWideOption extends CarOptions {
    public WheelsAndTiresUltraWideOption(RCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionPrice() {
        return BigDecimal.valueOf(15.99);
    }

    @Override
    public String getOptionName() {
        return "Wheels and Tires Ultra-Wide Option";
    }

    @Override
    public String getWheelsAndTiresType() {
        return "Ultra-Wide";
    }

    @Override
    public String toString() {
        return customRCCar.toString();
    }
}
