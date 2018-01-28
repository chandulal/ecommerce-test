import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    public Warehouse warehouse = new Warehouse();
    
    @Test
    public void shouldAddProductIntoWarehouse(){
        Product keyboard = new Product(1, "Keyboard",200.0);
        boolean status = warehouse.addProduct(keyboard);
        Assert.assertTrue(status);
        Assert.assertEquals(1,warehouse.getProductCount());
        Product product = warehouse.getProductById(1);
        Assert.assertEquals(keyboard, product);
    }
    
    @Test
    public void shouldAddMultipleProductsIntoWarehouse(){
        Product keyboard = new Product(1, "Keyboard",200.0);
        Product mouse = new Product(2, "Mouse",100.0);
        boolean status = warehouse.addProduct(keyboard);
        Assert.assertTrue(status);
        status = warehouse.addProduct(mouse);
        Assert.assertTrue(status);
        Assert.assertEquals(2,warehouse.getProductCount());
        Product product = warehouse.getProductById(2);
        Assert.assertEquals(mouse, product);
        product = warehouse.getProductById(1);
        Assert.assertEquals(keyboard, product);
    }
}
