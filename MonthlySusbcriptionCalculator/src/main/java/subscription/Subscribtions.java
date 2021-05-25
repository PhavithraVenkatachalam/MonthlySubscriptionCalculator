package subscription;

import Calender.DaysCalculator;
import Products.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Subscribtions {

    private List<Product> subscribtionList;
    private MonthlySubscription monthlySubscription;
    private WeeklySubscription weeklySubscription;

    public Subscribtions() {
        subscribtionList = new ArrayList<>();
        monthlySubscription = new MonthlySubscription();
        weeklySubscription = new WeeklySubscription();
    }

    public void subscribe(Product... paper) {

        Arrays.stream(paper).forEach(p -> subscribtionList.add(p));
    }


    public double getSubscriptionTotal() {

        return subscribtionList.stream().mapToDouble(p -> (double) totalPriceforSpecificProduct(p)).sum();
    }

    public double totalPriceforSpecificProduct(Product newsPaper) {

        if (newsPaper.getFrequency().toString().equalsIgnoreCase("monthly")) {
            return monthlySubscription.calculateProductMonthlySubscriptionPrice(newsPaper);
        }

        if (newsPaper.getFrequency().toString().equalsIgnoreCase("weekly")) {
            return weeklySubscription.calculateProductWeeklySubscriptionPrice(newsPaper);
        }

        return 0;
    }


}
