import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CartTest {
    
    @Test
    public void shouldAddProductsIntoCart() {
        Warehouse warehouse = mock(Warehouse.class);
        Cart cart = new Cart(warehouse);
        Product keyboard = new Product(1, "Keyboard", 200.0);
        Product mouse = new Product(2, "Mouse", 100.0);
        
        when(warehouse.getProductById(1)).thenReturn(keyboard);
        when(warehouse.getProductById(2)).thenReturn(mouse);
        
        cart.addProduct(1);
        cart.addProduct(2);
        
        Assert.assertEquals(2, cart.getProductCount());
        
        List<Product> products = cart.getProductList();
        
        List<Product> expectedProducts = new ArrayList<>();
        expectedProducts.add(keyboard);
        expectedProducts.add(mouse);
        
        Assert.assertArrayEquals(Arrays.asList(products).toArray(), Arrays.asList(expectedProducts).toArray());
    }
    
    @Test
    public void shouldTestTotalOfCart(){
        Warehouse warehouse = mock(Warehouse.class);
        Cart cart = new Cart(warehouse);
        Product keyboard = new Product(1, "Keyboard", 200.0);
        Product mouse = new Product(2, "Mouse", 100.0);
    
        when(warehouse.getProductById(1)).thenReturn(keyboard);
        when(warehouse.getProductById(2)).thenReturn(mouse);
    
        cart.addProduct(1);
        cart.addProduct(2);
        
        double expectedTotal = 300.0;
        Assert.assertEquals(expectedTotal, cart.getTotal(), 0.0);
    
    }
}
