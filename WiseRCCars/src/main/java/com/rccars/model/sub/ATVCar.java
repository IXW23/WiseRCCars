package com.rccars.model.sub;
import com.rccars.model.base.FrameColors;
import com.rccars.model.base.OffRoadCar;
import java.math.BigDecimal;

public class ATVCar extends OffRoadCar {
    public ATVCar() {
        super(FrameColors.GREEN, "Has Remote Controller", "Has Rechargeable Battery", "Has Charger");
    }

    @Override
    public String getModelNumber() {
        return "ORAT2400";
    }

    @Override
    public int getUCPPrefix() {
        return 113342;
    }

    @Override
    public int getStartingCount() {
        return 8488;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(199.99);
    }

    @Override
    public String toString() {
        return "ATV Car";
    }
}
