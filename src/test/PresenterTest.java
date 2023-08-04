package test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import model.ETypeProduct;
import model.Product;
import presenter.Presenter;

public class PresenterTest {

    Presenter presenter = new Presenter();
    Product whisky;

    void setup(){

        whisky = new Product("Old Par x lt", 180000, 18, true, ETypeProduct.LICORES);
    }
    
    @Test
    void testAddSale() {
        setup();
        assertEquals(428400, presenter.addSale("Old Par x lt", 180000, 18, true, ETypeProduct.LICORES, 2), 0.1);
    }

    @Test
    void testShowSale() {
        setup();
        presenter.addSale("Old Par x lt", 180000, 18, true, ETypeProduct.LICORES, 2);
        assertEquals("Total: 428400.0"
        + "\nStored value: 68400.0"
        + "\nDiscount value: 360000.0", presenter.showSale());
    }
}
