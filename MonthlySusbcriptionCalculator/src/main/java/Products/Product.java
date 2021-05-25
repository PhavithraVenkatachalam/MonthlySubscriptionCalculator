package Products;

import StockManager.ProductDetails;
import subscription.Frequency;

public class Product implements IProduct {

    private String category;
    private ProductDetails productDetails;
    private Frequency subscribedfrequency;


    public Product(ProductDetails paperDetails, Frequency frequency, String category) {
        this.productDetails = paperDetails;
        this.subscribedfrequency = frequency;
        this.category = category;
    }

    @Override
    public Frequency getFrequency() {
        return subscribedfrequency;
    }

    @Override
    public ProductDetails getProductDetails() {
        return productDetails;
    }

    @Override
    public String getCategory() {
        return category;
    }
}
