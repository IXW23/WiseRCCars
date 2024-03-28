package com.rccars.model.sub;
import com.rccars.model.base.CarOptions;
import com.rccars.model.base.RCCar;
import java.math.BigDecimal;

public class WheelsAndTiresExtraGripOption extends CarOptions {
    public WheelsAndTiresExtraGripOption(RCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionPrice() {
        return BigDecimal.valueOf(29.99);
    }

    @Override
    public String getOptionName() {
        return "Wheels and Tires Extra-Grip Option";
    }

    @Override
    public String getWheelsAndTiresType() {
        return "Extra-Grip";
    }

    @Override
    public String toString() {
        return customRCCar.toString();
    }
}
