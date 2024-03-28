package com.rccars.model.sub;
import com.rccars.model.base.FrameColors;
import com.rccars.model.base.StreetCar;
import java.math.BigDecimal;

public class ClassicCar extends StreetCar {
    public ClassicCar() {
        super(FrameColors.ORANGE, "Has Remote Controller", "Has Rechargeable Battery", "Has Charger");
    }

    @Override
    public String getModelNumber() {
        return "CLS4019";
    }

    @Override
    public int getUCPPrefix() {
        return 315790;
    }

    @Override
    public int getStartingCount() {
        return 7326;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(99.99);
    }

    @Override
    public String toString() {
        return "Classic Car";
    }
}
