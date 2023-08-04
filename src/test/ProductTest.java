package test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import model.ETypeProduct;
import model.Product;

public class ProductTest {

    Product whisky;
    Product rice;
    Product vitamin;
    Product soap;
    Product pancake;

    void setup(){

        whisky = new Product("Old Par x lt", 180000, 18, true, ETypeProduct.LICORES);
        rice = new Product("Arroz x lb", 4600, 80, true, ETypeProduct.VIVERES);
        vitamin = new Product("Vitamin C", 10000, 100, false, ETypeProduct.MEDICINAS); 
        soap = new Product("Jabon Rey", 2300, 30, true, ETypeProduct.ASEO);
        pancake = new Product("Pancake", 1500, 342, true, ETypeProduct.RANCHO);

    }

    @Test
    void testGetName() {
        setup();
        assertEquals("Old Par x lt", whisky.getName());        
        assertEquals("Arroz x lb", rice.getName());
        assertEquals("Vitamin C", vitamin.getName());
        assertEquals("Jabon Rey", soap.getName());
        assertEquals("Pancake", pancake.getName());
    }

    @Test
    void testGetStock() {
        setup();
        assertEquals(18, whisky.getStock());        
        assertEquals(80, rice.getStock());
        assertEquals(100, vitamin.getStock());    
        assertEquals(30, soap.getStock());
        assertEquals(342, pancake.getStock());

    }

    @Test
    void testGetTypeProduct() {
        setup();
        assertEquals(ETypeProduct.LICORES, whisky.getTypeProduct());  
        assertEquals(ETypeProduct.VIVERES, rice.getTypeProduct());  
        assertEquals(ETypeProduct.MEDICINAS, vitamin.getTypeProduct());  
        assertEquals(ETypeProduct.ASEO, soap.getTypeProduct());  
        assertEquals(ETypeProduct.RANCHO, pancake.getTypeProduct());  

    }

    @Test
    void testGetValue() {
        setup();
        assertEquals(180000, whisky.getValue(), 0.1);
        assertEquals(4600, rice.getValue(), 0.1);
        assertEquals(10000, vitamin.getValue(), 0.1);
        assertEquals(2300, soap.getValue(), 0.1);
        assertEquals(1500, pancake.getValue(), 0.1);

    }

    @Test
    void testIsIva() {
        setup();
        assertEquals(true, whisky.isIva());
        assertEquals(true, rice.isIva());
        assertEquals(false, vitamin.isIva());
        assertEquals(true, soap.isIva());
        assertEquals(true, pancake.isIva());

    }

    
}
