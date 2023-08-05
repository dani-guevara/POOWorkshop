package presenter;

import model.ETypeProduct;
import model.Product;
import model.ServiceSale;

public class Presenter {
    
    private ServiceSale serviceSale;

    public Presenter() {
    }
    
    public double addSale(String name, double value, int stock, boolean iva, ETypeProduct eTypeProduct, int cant){
        
        try {
            serviceSale = new ServiceSale(new Product(name, value, stock, iva, eTypeProduct), cant);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return serviceSale.getSale().getTotalSale();        
    }

    public String showSale(){

        String showSale = "Total: " + serviceSale.getSale().getTotalSale()
            + "\nStored value: " + serviceSale.getSale().calcIva()
            + "\nDiscount value " + serviceSale.getSale().calcDiscount();

        return showSale;
    }
}
