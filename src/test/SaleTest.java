package test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import model.ETypeProduct;
import model.Product;
import model.Sale;

public class SaleTest {

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
    void testCalcDiscount() {
        setup();
        sale = new Sale(whisky,5);
        assertEquals(855000, sale.calcDiscount(), 0.1);
        sale.setCant(11);
        assertEquals(1782000, sale.calcDiscount(), 0.1);
        sale.setCant(50);
        assertEquals(7200000, sale.calcDiscount(), 0.1);
        sale.setCant(55);
        assertEquals(6930000, sale.calcDiscount(), 0.1);
        

    }

    @Test
    void testCalcIva() {
        setup();
        sale = new Sale(whisky,2);
        assertEquals(68400, sale.calcIva(), 0.1);
        sale = new Sale(rice,3);
        assertEquals(1104, sale.calcIva(), 0.1);
        sale = new Sale(vitamin,4);
        assertEquals(0, sale.calcIva(), 0.1);
        sale = new Sale(soap,2);
        assertEquals(644, sale.calcIva(), 0.1);
        sale = new Sale(pancake,8);
        assertEquals(2280, sale.calcIva(), 0.1);

    }

    @Test
    void testGetCant() {
        
        sale = new Sale(whisky, 10);
        assertEquals(10, sale.getCant(), 0.1);
        sale = new Sale(rice, 10);
        assertEquals(10, sale.getCant(), 0.1);
        sale = new Sale(vitamin, 10);
        assertEquals(10, sale.getCant(), 0.1);
        sale = new Sale(soap, 10);
        assertEquals(10, sale.getCant(), 0.1);
        sale = new Sale(pancake, 10); 
        assertEquals(10, sale.getCant(), 0.1);     

    }

    @Test
    void testGetTotalSale() {
        setup();
        sale = new Sale(whisky,2);
        assertEquals(428400, sale.getTotalSale(), 0.1);
        sale = new Sale(rice,10);
        assertEquals(47380, sale.getTotalSale(), 0.1);
        sale = new Sale(vitamin,4);
        assertEquals(40000, sale.getTotalSale(), 0.1);
        sale = new Sale(soap,24);
        assertEquals(51888, sale.getTotalSale(), 0.1);
        sale = new Sale(pancake,53);
        assertEquals(70755, sale.getTotalSale(), 0.1);

    }

}
