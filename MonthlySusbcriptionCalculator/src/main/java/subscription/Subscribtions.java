package subscription;

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

    public void subscribe(Product... product) {

        Arrays.stream(product).forEach(p -> subscribtionList.add(p));
    }


    public double getSubscriptionTotal() {

        return subscribtionList.stream().mapToDouble(p -> (double) totalPriceforSpecificProduct(p)).sum();
    }

    public double totalPriceforSpecificProduct(Product product) {

        if (product.getFrequency().toString().equalsIgnoreCase("monthly")) {
            return monthlySubscription.calculateProductMonthlySubscriptionPrice(product);
        }

        if (product.getFrequency().toString().equalsIgnoreCase("weekly")) {
            return weeklySubscription.calculateProductWeeklySubscriptionPrice(product);
        }

        return 0;
    }


}
