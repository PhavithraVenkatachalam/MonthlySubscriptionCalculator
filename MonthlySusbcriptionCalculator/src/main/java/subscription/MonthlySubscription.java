package subscription;

import Calender.DaysCalculator;
import Products.Product;

public class MonthlySubscription {

    DaysCalculator daysCalculator;

    public MonthlySubscription() {
        daysCalculator = new DaysCalculator();
    }

    public double calculateProductMonthlySubscriptionPrice(Product newsPaper) {

        double weekdayPrice = daysCalculator.getWeekdaysCount(2021, 06) * newsPaper.getProductDetails().getMondayPrice();
        double saturdayPrice = daysCalculator.getSaturdayCount(2021, 06) * newsPaper.getProductDetails().getSaturdayPrice();
        double sundayPrice = daysCalculator.getSundayCount(2021, 06) * newsPaper.getProductDetails().getSundayPrice();

        return weekdayPrice + saturdayPrice + sundayPrice;
    }
}
