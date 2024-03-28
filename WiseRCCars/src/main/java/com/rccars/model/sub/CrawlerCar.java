package com.rccars.model.sub;
import com.rccars.model.base.FrameColors;
import com.rccars.model.base.OffRoadCar;
import java.math.BigDecimal;

public class CrawlerCar extends OffRoadCar {
    public CrawlerCar() {
        super(FrameColors.BLACK, "Has Remote Controller", "Has Rechargeable Battery", "Has Charger");
    }

    @Override
    public String getModelNumber() {
        return "ORCR4600";
    }

    @Override
    public int getUCPPrefix() {
        return 756643;
    }

    @Override
    public int getStartingCount() {
        return 3398;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(245.99);
    }

    @Override
    public String toString() {
        return "Crawler Car";
    }
}
