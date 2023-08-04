package model;
public class Sale {
    
    private Product product;
    private int cant;    

    public Sale(Product product, int cant) {
        this.product = product;
        this.cant = cant;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int calcDiscount(){
        return 0;
    }

    public double getTotalSale(){
        return 0;
    }

    public double calcIva(){
        return 0;
    }
    



    

}
