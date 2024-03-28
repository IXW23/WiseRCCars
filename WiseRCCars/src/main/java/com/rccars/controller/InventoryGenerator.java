package com.rccars.controller;
import com.rccars.model.base.RCCar;
import com.rccars.model.sub.*;
import java.util.ArrayList;
import java.util.function.Supplier;

public class InventoryGenerator {
    private final ArrayList<RCCar> sportsCarList = new ArrayList<>();
    private final ArrayList<RCCar> SUVCarList = new ArrayList<>();
    private final ArrayList<RCCar> classicCarList = new ArrayList<>();
    private final ArrayList<RCCar> ATVCarList = new ArrayList<>();
    private final ArrayList<RCCar> duneBuggyCarList = new ArrayList<>();
    private final ArrayList<RCCar> crawlerCarList = new ArrayList<>();
    private final SerialNumberGenerator generator;

    public InventoryGenerator() {
        generator = SerialNumberGenerator.getInstance();
        createCarInventory(sportsCarList, () -> new SportsCar());
        createCarInventory(SUVCarList, () -> new SUVCar());
        createCarInventory(classicCarList, () -> new ClassicCar());
        createCarInventory(ATVCarList, () -> new ATVCar());
        createCarInventory(duneBuggyCarList, () -> new DuneBuggyCar());
        createCarInventory(crawlerCarList, () -> new CrawlerCar());
    }

    public ArrayList<RCCar> getSportsCarList() {
        return sportsCarList;
    }

    public ArrayList<RCCar> getSUVCarList() {
        return SUVCarList;
    }

    public ArrayList<RCCar> getClassicCarList() {
        return classicCarList;
    }

    public ArrayList<RCCar> getATVCarList() {
        return ATVCarList;
    }

    public ArrayList<RCCar> getDuneBuggyCarList() {
        return duneBuggyCarList;
    }

    public ArrayList<RCCar> getCrawlerCarList() {
        return crawlerCarList;
    }

    private void createCarInventory(ArrayList<RCCar> carList, Supplier<RCCar> carSupply) {
        generator.startGeneration(carSupply.get().getModelNumber(), carSupply.get().getUCPPrefix(),
                carSupply.get().getStartingCount());
        for(int i = 0; i < 100; i++) {
            RCCar car = carSupply.get();
            car.setSerialNumber(generator.getNextSerialNumber());
            carList.add(i, car);
        }
    }
}
