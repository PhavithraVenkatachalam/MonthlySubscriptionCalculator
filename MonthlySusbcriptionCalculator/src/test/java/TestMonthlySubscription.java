import StockManager.Paper;
import StockManager.ProductDetails;
import Products.Product;
import org.testng.Assert;
import org.testng.annotations.Test;
import subscription.Frequency;

public class TestMonthlySubscription {
    @Test
    public void shouldTestMultipleSubscriptions()
    {
        ProductDetails hinduDetails=new ProductDetails(Paper.Hindu,2.5,2.5,2.5,2.5,2.5,4,4);
        ProductDetails TOIDetails=new ProductDetails(Paper.TOI,3,3,3,3,3,5,6);
        Product hindu=new Product(hinduDetails, Frequency.monthly,"Books & Periodicals");
        Product TOI=new Product(TOIDetails,Frequency.monthly,"Books & Periodicals");

        Customer customer=new Customer("Prem");
        customer.subscribeTo(hindu,TOI);
        double actualPrice=customer.getCurrentMonthSubscriptionTotal();

        Assert.assertEquals(actualPrice,197.0);
    }

    @Test
    public void shouldTestProductsUnderDifferentSubscriptionFrequency()
    {

        ProductDetails hinduDetails=new ProductDetails(Paper.Hindu,2.5,2.5,2.5,2.5,2.5,4,4);
        ProductDetails TOIDetails=new ProductDetails(Paper.TOI,3,3,3,3,3,5,6);
        Product hindu=new Product(hinduDetails, Frequency.monthly,"Books & Periodicals");
        Product TOI=new Product(TOIDetails,Frequency.weekly,"Books & Periodicals");

        Customer customer=new Customer("Prem");
        customer.subscribeTo(hindu,TOI);
        double actualPrice=customer.getCurrentMonthSubscriptionTotal();

        Assert.assertEquals(actualPrice,111.0);

    }
}
