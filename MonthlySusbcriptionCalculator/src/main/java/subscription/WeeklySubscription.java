package subscription;

import Calender.DaysCalculator;
import Products.Product;

public class WeeklySubscription {

    DaysCalculator daysCalculator;

    public WeeklySubscription() {
        daysCalculator = new DaysCalculator();
    }

    public double calculateProductWeeklySubscriptionPrice(Product newsPaper) {

        return daysCalculator.getSundayCount(2021, 06) * newsPaper.getProductDetails().getSundayPrice();
    }
}
