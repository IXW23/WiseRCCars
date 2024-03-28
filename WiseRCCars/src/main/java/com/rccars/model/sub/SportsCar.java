package com.rccars.model.sub;
import com.rccars.model.base.FrameColors;
import com.rccars.model.base.StreetCar;
import java.math.BigDecimal;

public class SportsCar extends StreetCar {
    public SportsCar() {
        super(FrameColors.BLUE, "Has Remote Controller", "Has Rechargeable Battery", "Has Charger");
    }

    @Override
    public String getModelNumber() {
        return "SPT2019";
    }

    @Override
    public int getUCPPrefix() {
        return 357901;
    }

    @Override
    public int getStartingCount() {
        return 9753;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(140.99);
    }

    @Override
    public String toString() {
        return "Sports Car";
    }
}
