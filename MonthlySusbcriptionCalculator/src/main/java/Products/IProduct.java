package Products;

import StockManager.ProductDetails;
import subscription.Frequency;

public interface IProduct extends IProductCategory {

    Frequency getFrequency();

    ProductDetails getProductDetails();
}
