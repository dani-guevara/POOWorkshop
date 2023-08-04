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

    public double getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double calcDiscount(){

        if (cant >= 5 & cant < 11) {
            return product.getValue()*cant - ((product.getValue()*cant) * 0.05);
        } else if (cant >= 11 & cant < 21){
            return product.getValue()*cant - ((product.getValue()*cant) * 0.1);
        } else if (cant >= 21 & cant < 51){
            return product.getValue()*cant - ((product.getValue()*cant) * 0.2);
        } else if (cant >= 51){
            return product.getValue()*cant - ((product.getValue()*cant) * 0.3);
        }            
        return product.getValue()*cant;
    }

    public double getTotalSale(){
        
        return calcDiscount() + calcIva();
    }

    public double calcIva(){

        double valIva = 0.0;

        if (product.isIva() == true) {

            valIva = switch (product.getTypeProduct()) {
            case LICORES -> (product.getValue() * cant) * 0.19;
            case VIVERES -> (product.getValue() * cant) * 0.08;
            case ASEO -> (product.getValue() * cant) * 0.14;
            case RANCHO -> (product.getValue() * cant) * 0.19;
            default -> 0.0;
            
        };

        return valIva;
        } else if (product.isIva()){
            switch (product.getTypeProduct()) {
                case MEDICINAS:
                    valIva = product.getValue() * 1;                    
                    break;            
                default:
                    break;
            }
            return valIva;
        }                       
        return valIva;
    }
    



    

}
