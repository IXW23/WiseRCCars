package com.rccars.model.sub;
import com.rccars.model.base.FrameColors;
import com.rccars.model.base.OffRoadCar;
import java.math.BigDecimal;

public class DuneBuggyCar extends OffRoadCar {
    public DuneBuggyCar() {
        super(FrameColors.BROWN, "Has Remote Controller", "Has Rechargeable Battery", "Has Charger");
    }

    @Override
    public String getModelNumber() {
        return "ORDB3400";
    }

    @Override
    public int getUCPPrefix() {
        return 885532;
    }

    @Override
    public int getStartingCount() {
        return 7446;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(225.99);
    }

    @Override
    public String toString() {
        return "Dune Buggy Car";
    }
}
