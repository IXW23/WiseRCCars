package com.rccars.model.sub;
import com.rccars.model.base.CarOptions;
import com.rccars.model.base.RCCar;
import java.math.BigDecimal;

public class MilitaryBodyShellOption extends CarOptions {
    public MilitaryBodyShellOption(RCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionPrice() {
        return BigDecimal.valueOf(35.99);
    }

    @Override
    public String getOptionName() {
        return "Military Body Shell";
    }

    @Override
    public String toString() {
        return customRCCar.toString();
    }
}
