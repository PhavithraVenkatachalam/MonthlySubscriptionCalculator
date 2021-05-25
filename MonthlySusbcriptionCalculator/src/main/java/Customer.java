import Products.Product;
import subscription.Subscribtions;

public class Customer {

    private String name;
    Subscribtions subscribtions;

    public Customer(String name) {

        subscribtions = new Subscribtions();
        this.name = name;
    }

    public void subscribeTo(Product... newsPapers) {

        subscribtions.subscribe(newsPapers);
    }

    public double getCurrentMonthSubscriptionTotal() {

        return subscribtions.getSubscriptionTotal();
    }
}
