package StockManager;

import java.awt.print.Paper;

public class ProductDetails {

    private Paper name;
    private double mondayPrice, tuesdayPrice, wednesdayPrice, thursdayPrice, fridayPrice, saturdayPrice, sundayPrice;

    public ProductDetails(StockManager.Paper hindu, double... price) {
        this.name = name;
        mondayPrice = price[0];
        tuesdayPrice = price[1];
        wednesdayPrice = price[2];
        thursdayPrice = price[3];
        fridayPrice = price[4];
        saturdayPrice = price[5];
        sundayPrice = price[6];
    }

    public double getMondayPrice() {
        return mondayPrice;
    }

    public double getTuesdayPrice() {
        return tuesdayPrice;
    }

    public double getWednesdayPrice() {
        return wednesdayPrice;
    }

    public double getThursdayPrice() {
        return thursdayPrice;
    }

    public double getFridayPrice() {
        return fridayPrice;
    }

    public double getSaturdayPrice() {
        return saturdayPrice;
    }

    public double getSundayPrice() {
        return sundayPrice;
    }
}
