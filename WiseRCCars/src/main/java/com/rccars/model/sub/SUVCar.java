package com.rccars.model.sub;
import com.rccars.model.base.FrameColors;
import com.rccars.model.base.StreetCar;
import java.math.BigDecimal;

public class SUVCar extends StreetCar {
    public SUVCar() {
        super(FrameColors.WHITE, "Has Remote Controller", "Has Rechargeable Battery", "Has Charger");
    }

    @Override
    public String getModelNumber() {
        return "SUV3019";
    }

    @Override
    public int getUCPPrefix() {
        return 642852;
    }

    @Override
    public int getStartingCount() {
        return 8647;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(125.99);
    }

    @Override
    public String toString() {
        return "SUV Car";
    }
}
