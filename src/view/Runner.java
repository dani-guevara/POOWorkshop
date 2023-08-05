package view;
import java.util.Scanner;

import model.ETypeProduct;
import presenter.Presenter;
public class Runner {
    public static void main(String[] args) {

        Presenter presenter = new Presenter();
        String name = "";
        double value = 0;
        int stock = 0;
        boolean iva = true;
        int ivaNum = 0;
        ETypeProduct eTypeProduct = null;
        int typeProduct = 0;
        int cant = 0;

        double totalSale = 0;
        double totalValue = 0;
        int averageCount = 0;

        String menu = "----- MAIN MENU -----\n"
            + "1. Add a sale\n"
            + "2. Sale information\n"
            + "3. Exit";

        int option = 0;
        

        do {
            
            try {
                
                System.out.println(menu);
                Scanner sc = new Scanner(System.in);

                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("-- Enter product name --");
                        name = sc.next();

                        System.out.println("-- Enter product value --");
                        value = sc.nextDouble();
                        while (value < 0) {
                            System.out.println("Enter a correct value");
                            value = sc.nextDouble();
                        }

                        System.out.println("-- Enter product stock --");
                        stock = sc.nextInt();
                        while (stock < 0) {
                            System.out.println("Enter a correct stock");
                            stock = sc.nextInt();
                        }

                        System.out.println("-- If product have iva, input 1, on the other hand, input 2 --");
                        ivaNum = sc.nextInt();
                        while (ivaNum != 1 & ivaNum != 2) {
                            System.out.println("Enter a correct option");
                            ivaNum = sc.nextInt();
                        }

                        System.out.println("-- Enter product type --" 
                            + "\n1. Licores"
                            + "\n2. Viveres"
                            + "\n3. Medicinas"
                            + "\n4. Aseo" 
                            + "\n5. Rancho");
                        typeProduct = sc.nextInt();
                        while (typeProduct != 1 & typeProduct != 2 & typeProduct != 3 & typeProduct != 4 & typeProduct != 5) {
                            System.out.println("Enter a correct product type");
                            typeProduct = sc.nextInt();
                        }

                        System.out.println("-- Enter product cant --");
                        cant = sc.nextInt();
                        while (cant < 0) {
                            System.out.println("Enter a correct cant");
                            cant = sc.nextInt();
                        }

                        if (ivaNum == 1) {
                            iva = true;
                        } else if (ivaNum == 2){
                            iva = false;
                        }

                        switch (typeProduct) {
                            case 1: eTypeProduct = eTypeProduct.LICORES; 
                                break;
                            case 2: eTypeProduct = eTypeProduct.VIVERES;                                
                                break;
                            case 3: eTypeProduct = eTypeProduct.MEDICINAS;                                 
                                break;
                            case 4: eTypeProduct = eTypeProduct.ASEO;                                 
                                break;
                            case 5: eTypeProduct = eTypeProduct.RANCHO;                                
                                break;
                        
                            default:
                                break;
                        }                    
                        
                        totalSale = presenter.addSale(name, value, stock, iva, eTypeProduct, cant);
                        totalValue = totalValue + totalSale;
                        averageCount++;
                                         
                        break;
                
                    case 2: System.out.println(presenter.showSale());   
                        break;
                }



            } catch (Exception e) {
                System.out.println("Enter a correct value");
            }

        } while (option != 3);


        System.out.println("\n\nThe total cost of the sale is: " + totalValue
            + "\nThe average is: " + totalValue/averageCount
            + "\n------ See you soon ------");

    }
}
