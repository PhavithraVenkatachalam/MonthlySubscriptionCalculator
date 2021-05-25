package subscription;

import Calender.DaysCalculator;
import Products.Product;

public class WeeklySubscription {

    private DaysCalculator daysCalculator;

    public WeeklySubscription() {

        daysCalculator = new DaysCalculator();
    }

    public double calculateProductWeeklySubscriptionPrice(Product product) {

        return daysCalculator.getSundayCount(2021, 06) * product.getProductDetails().getSundayPrice();
    }
}
