package subscription;

import Calender.DaysCalculator;
import Products.Product;

public class MonthlySubscription {

    private DaysCalculator daysCalculator;

    public MonthlySubscription() {

        daysCalculator = new DaysCalculator();
    }

    public double calculateProductMonthlySubscriptionPrice(Product product) {

        double weekdayPrice = daysCalculator.getWeekdaysCount(2021, 06) * product.getProductDetails().getMondayPrice();
        double saturdayPrice = daysCalculator.getSaturdayCount(2021, 06) * product.getProductDetails().getSaturdayPrice();
        double sundayPrice = daysCalculator.getSundayCount(2021, 06) * product.getProductDetails().getSundayPrice();

        return weekdayPrice + saturdayPrice + sundayPrice;
    }
}
