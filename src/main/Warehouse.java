import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    
    List<Product> products = new ArrayList<>();
    public boolean addProduct(Product product) {
        products.add(product);
        return true;
    }
    
    public int getProductCount() {
        return products.size();
    }
    
    public Product getProductById(int id) {
        return getProduct(id);
    }
    
    private Product getProduct(int id) {
        for(Product product : products) {
            if(product.getId() == id)
                return product;
        }
        return null;
    }
    
}
