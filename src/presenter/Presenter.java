package presenter;

import model.ETypeProduct;
import model.Product;
import model.ServiceSale;

public class Presenter {
    
    private ServiceSale serviceSale;

    public Presenter() {
    }
    
    public double addSale(String name, double value, int stock, boolean iva, ETypeProduct eTypeProduct, int cant){
        
        serviceSale = new ServiceSale(new Product(name, value, stock, iva, eTypeProduct), cant);

        return serviceSale.getSale().getTotalSale();        
    }

    public String showSale(){

        return String.format("\nTotal: %s\nDiscount: %s\nIva: %s\n",
        serviceSale.getSale().getTotalSale(), serviceSale.getSale().calcDiscount(),
        serviceSale.getSale().calcIva());
    }
}
