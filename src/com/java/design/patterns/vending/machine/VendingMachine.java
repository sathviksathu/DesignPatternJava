package com.java.design.patterns.vending.machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    static List<Product> productCatalogue = new ArrayList<>();
    static Product selectedProduct = null;

    public static void main(String[] args) {
        // Fill the vending machine with some products
        fillVendingMachine();
	    // display the product catalogue
        displayProductCatalogue();
        //Prompt user to enter an order.
        Order order = takeOrder();
        //Serve the order
        if(validateOrder(order)){
         //update catalogue
         updateCatalogue(order);
         order.setChange(order.getInserted_amt() - (order.getRequestedQuantity() * selectedProduct.getUnitPrice()));
         if(order.getChange()!=0){
             System.out.println("Amt: "+ order.getChange());
         }
        }
        displayProductCatalogue();

    }

    private static void updateCatalogue(Order order) {
        selectedProduct.setAvailableQuanity(selectedProduct.getAvailableQuanity() - order.getRequestedQuantity());
    }

    private static boolean validateOrder(Order order) {
        int selectedId = order.getProductId();
        for(Product product : productCatalogue){
            if(product.getProductId() == selectedId){
                 if(order.getRequestedQuantity() <= product.getAvailableQuanity() && order.getInserted_amt() >= product.getUnitPrice()){
                     selectedProduct = product;
                     return true;
                 }else{
                     return false;
                 }
            }
        }
        return false;
    }

    private static Order takeOrder() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product ID");
        int id = sc.nextInt();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        System.out.println("Insert money");
        float inserted_amt = sc.nextFloat();
        System.out.println("===========Placed Order Details========");
        System.out.println("ProductID: "+ id+" Quantity: "+quantity+" inserted_amt: "+inserted_amt);
        return new Order(id,quantity,inserted_amt);

    }

    private static void displayProductCatalogue() {
        System.out.println("=========PRODUCT CATALOGUE==========");
        for(int i =0 ; i < productCatalogue.size(); i++){
            if(productCatalogue.get(i).getAvailableQuanity() > 0)
            System.out.println(" "+productCatalogue.get(i).getProductId()+
                                " "+productCatalogue.get(i).getProductName()+
                                " "+productCatalogue.get(i).getAvailableQuanity());
        }
        System.out.println("=========END==========");
    }

    private static void fillVendingMachine() {
        //create around 10 products
        Product product1 = new Product(1,"Chocolate",10,10);
        productCatalogue.add(product1);

        Product product2 = new Product(2,"Chips",10,20);
        productCatalogue.add(product2);

        Product product3 = new Product(3,"Biscuits",10,5);
        productCatalogue.add(product3);

        Product product4 = new Product(4,"Cookies",10,40);
        productCatalogue.add(product4);

        Product product5 = new Product(5,"CoolDrinks",10,30);
        productCatalogue.add(product5);
    }
}
