package model;

public class Product {
    
    private String name;
    private double value;
    private int stock;
    private boolean iva;
    public static final int STOCK_MIN = 10;  
    private ETypeProduct typeProduct;

    public Product(String name, double value, int stock, boolean iva, ETypeProduct typeProduct) {
        this.name = name;
        this.value = value;
        this.stock = stock;
        this.iva = iva;
        this.typeProduct = typeProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setStock(int stock) throws Exception {

        int finalStock = 0;
        finalStock = this.stock - stock;

        if (finalStock < STOCK_MIN) {
            throw new Exception("No units available");
        }
        this.stock = finalStock;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    public void setTypeProduct(ETypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getStock() {
        return stock;
    }

    public boolean isIva() {
        return iva;
    }

    public ETypeProduct getTypeProduct() {
        return typeProduct;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", value=" + value + ", stock=" + stock + ", iva=" + iva + ", typeProduct="
                + typeProduct + "]";
    }
    
}
