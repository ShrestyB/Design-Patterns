package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void accept(Visitor visitor) {
        for (Product product : products) {
            product.accept(visitor);
        }
    }
} 