package test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import model.ETypeProduct;
import model.Product;
import model.Sale;
import model.ServiceSale;

public class ServiceSaleTest {

    private ServiceSale serviceSale;
    private Sale sale;

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
    void testGetSale() {
        setup();
        serviceSale = new ServiceSale(whisky, 8);
        sale = serviceSale.getSale();
        assertEquals(8, sale.getCant(), 0.1);
        serviceSale = new ServiceSale(vitamin,9);
        sale = serviceSale.getSale();
        assertEquals(9, sale.getCant(), 0.1);
        serviceSale = new ServiceSale(pancake, 6);
        sale = serviceSale.getSale();
        assertEquals(6, sale.getCant(), 0.1);

    }
    
}
