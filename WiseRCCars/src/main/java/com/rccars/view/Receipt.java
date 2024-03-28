package com.rccars.view;
import com.rccars.model.base.RCCar;
import java.util.ArrayList;

public class Receipt {
    private ArrayList<RCCar> carCart;
    private ArrayList<RCCar> optionCart;
    private double total = 0.0;

    public Receipt(ArrayList<RCCar> carList, ArrayList<RCCar> optionList) {
        carCart = carList;
        optionCart = optionList;
        printTitle();
        printTotal();
    }

    private void printTitle() {
        String company = String.format("%27s", "Wise RC Cars");
        System.out.println(company.toUpperCase());
        String address = String.format("%38s", "Main St, Grandview, MO, 64030");
        System.out.println(address);
        printStars();
        String purchase = String.format("%25s", "PURCHASE RECEIPT");
        System.out.println(purchase);
        printStars();
        printColumnHeader();
    }

    private void printColumnHeader() {
        String price = String.format("%28s", "Price");
        System.out.print("Description");
        System.out.println(price);
        printStars();
        printCarCart();
    }

    private void printCarCart() {
        if(!carCart.isEmpty()) {
            for(RCCar car : carCart) {
                System.out.println(car);
                System.out.println(" Frame Color: " + car.getFrameColor());
                System.out.println(" Serial #: " + car.getSerialNumber());
                total += car.getPrice().doubleValue();
                String carPrice = String.format("%25s", "$" + car.getPrice());
                System.out.println(" Car Price: " + carPrice);
                if(!optionCart.isEmpty()) {
                    printOptionCart(car);
                }
                System.out.println();
            }
        }
    }

    private void printOptionCart(RCCar car) {
        for(RCCar option : optionCart) {
            if(option.toString().equals(car.toString())) {
                String optionPrice = String.format("%20s", "$" + option.getOptionPrice());
                System.out.println(" " + option.getOptionName() + ":");
                System.out.println(optionPrice);
                total += option.getOptionPrice().doubleValue();
            }
        }
    }

    private void printTotal() {
        double tax = 1.03;
        double totalPlusTax = total * tax;
        printStars();
        double taxAmount = totalPlusTax - total;
        System.out.print("Sub Total");
        System.out.printf("%22s %.2f%n", "$", total);
        System.out.print("Sales Tax");
        System.out.printf("%23s %.2f%n", "$", taxAmount);
        System.out.print("Total");
        System.out.printf("%26s %.2f%n", "$", totalPlusTax);
        printThanks();
    }

    private void printThanks() {
        System.out.println("Thank You for Shopping at Wise RC Cars! :)");
    }

    private void printStars(){
        for(int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
