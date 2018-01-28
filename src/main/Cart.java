import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();
    private Warehouse warehouse;
    
    Cart(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    
    boolean addProduct(int id) {
        return products.add(warehouse.getProductById(id));
    }
    
    public int getProductCount() {
        return products.size();
    }
    
    public List<Product> getProductList() {
        return products;
    }
    
    public double getTotal() {
        double sum = 0.0;
        for(Product product : products) {
            sum+=product.getPrice();
        }
        return sum;
    }
}
