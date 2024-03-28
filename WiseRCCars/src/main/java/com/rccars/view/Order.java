package com.rccars.view;
import com.rccars.controller.InventoryGenerator;
import com.rccars.model.base.FrameColors;
import com.rccars.model.base.RCCar;
import com.rccars.model.sub.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Order {
    private final ArrayList<RCCar> carOrder;
    private final ArrayList<RCCar> optionList;
    private Scanner userInput;
    private final InventoryGenerator inventory;
    private RCCar carChoice;
    private RCCar optionChoice;

    public Order() {
        carOrder = new ArrayList<>();
        optionList = new ArrayList<>();
        inventory = new InventoryGenerator();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to Wise RC Cars!");
        buyCar();
    }

    private void buyCar() {
        System.out.println("What kind of Car would you like to buy?");
        System.out.println("Your options are:\n1 - Sports Car\n2 - SUV Car\n3 - Classic Car\n4 - ATV Car" +
                "\n5 - Dune Buggy Car\n6 - Crawler Car");
        String pattern = "[1-6]+";
        String choice = verifyResult(pattern);
        switch(choice) {
            case"1":
                carChoice = inventory.getSportsCarList().get(0);
                inventory.getSportsCarList().remove(0);
                break;
            case"2":
                carChoice = inventory.getSUVCarList().get(0);
                inventory.getSUVCarList().remove(0);
                break;
            case"3":
                carChoice = inventory.getClassicCarList().get(0);
                inventory.getClassicCarList().remove(0);
                break;
            case"4":
                carChoice = inventory.getATVCarList().get(0);
                inventory.getATVCarList().remove(0);
                break;
            case"5":
                carChoice = inventory.getDuneBuggyCarList().get(0);
                inventory.getDuneBuggyCarList().remove(0);
                break;
            case"6":
                carChoice = inventory.getCrawlerCarList().get(0);
                inventory.getCrawlerCarList().remove(0);
                break;
            default:
                buyCar();
        }
        frameColorChoice(carChoice);
        optionOffer();
        carOrder.add(carChoice);
        buyAnotherCar();
//        orderComplete();
    }

    private void frameColorChoice(RCCar car) {
        System.out.println("Our Cars have a default Frame Color");
        System.out.println("The current Frame Color is " + car.getFrameColor().toString().toLowerCase());
        System.out.println("Would you like to change the Frame Color of the Car? yes or no");
        String choice = userInput.next();
        switch(choice) {
            case"yes":
                changeFrameColor(car);
                break;
            case"no":
                break;
            default:
                System.out.println("Incorrect Answer Entered! Try Again!");
                frameColorChoice(car);
        }
    }

    private void changeFrameColor(RCCar car) {
        System.out.println("What Frame Color would you like?");
        System.out.println("Your options are:\n1 - Blue\n2 - White\n3 - Orange\n4 - Green\n5 - Brown\n6 - Black");
        String pattern = "[1-6]+";
        String choice = verifyResult(pattern);
        switch(choice) {
            case"1":
                carChoice.chooseFrameColor(FrameColors.BLUE);
                System.out.println("The Frame Color is now blue");
                break;
            case"2":
                carChoice.chooseFrameColor(FrameColors.WHITE);
                System.out.println("The Frame Color is now white");
                break;
            case"3":
                carChoice.chooseFrameColor(FrameColors.ORANGE);
                System.out.println("The Frame Color is now orange");
                break;
            case"4":
                carChoice.chooseFrameColor(FrameColors.GREEN);
                System.out.println("The Frame Color is now green");
                break;
            case"5":
                carChoice.chooseFrameColor(FrameColors.BROWN);
                System.out.println("The Frame Color is now brown");
                break;
            case"6":
                carChoice.chooseFrameColor(FrameColors.BLACK);
                System.out.println("The Frame Color is now black");
                break;
            default:
                changeFrameColor(carChoice);
        }
    }

    private void optionOffer() {
        System.out.println("We offer additional options along with your Car Order");
        System.out.println("We offer the following options:\n1 - Military Body Shell\n2 - Truck Body Shell" +
                "\n3 - Ultra-Wide Wheels and Tires\n4 - Extra-Grip Wheels and Tires\n5 - Additional Battery" +
                "\n0 - No Additional Options");
        String pattern = "[0-5]+";
        String choice = verifyResult(pattern);
        switch(choice) {
            case"0":
                optionChoice = null;
                break;
            case"1":
                optionChoice = new MilitaryBodyShellOption(carChoice);
                break;
            case"2":
                optionChoice = new TruckBodyShellOption(carChoice);
                break;
            case"3":
                optionChoice = new WheelsAndTiresUltraWideOption(carChoice);
                break;
            case"4":
                optionChoice = new WheelsAndTiresExtraGripOption(carChoice);
                break;
            case"5":
                optionChoice = new BatteryOption(carChoice);
                break;
            default:
                optionOffer();
        }
        if(optionChoice != null) {
            optionList.add(optionChoice);
            moreOptionChoice();
        }
    }

    private void moreOptionChoice() {
        System.out.println("Would you like to add more Options? yes or no");
        String choice = userInput.next();
        switch(choice) {
            case"yes":
                optionOffer();
                break;
            case"no":
                break;
            default:
                System.out.println("Incorrect Answer Entered! Try Again!");
                moreOptionChoice();
        }
    }

    private void buyAnotherCar() {
        System.out.println("Would you like to add another Car to your Order? yes or no");
        String choice = userInput.next();
        switch(choice) {
            case"yes":
               carChoice = null;
               buyCar();
                break;
            case"no":
                orderComplete();
                break;
            default:
                System.out.println("Incorrect Answer Entered! Try Again!");
                buyAnotherCar();
        }
    }

    private void orderComplete() {
        new Receipt(carOrder, optionList);
    }

    private String verifyResult(String pattern) {
        String choice = "";
        try {
            userInput = new Scanner(System.in);
            choice = userInput.next(pattern);
        } catch(InputMismatchException ex) {
            System.out.println("Incorrect Answer Entered! Try Again!");
        }
        return choice;
    }
}
