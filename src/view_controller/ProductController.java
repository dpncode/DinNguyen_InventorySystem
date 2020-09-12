package view_controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Product;

import java.util.ArrayList;



public class ProductController {
    @FXML
    private TextField nameAddProductFld,inventoryAddProductFld,priceAddProductFld,maxAddProductFld,machineAddProductFld,minAddProductFld;
    int id = 0;
    ArrayList<Product> products = new ArrayList<Product>();

        //Add product method
    //TODO: finish add product save button
    public void saveAddProductPart(MouseEvent mouseEvent) {
        ProductController prc = new ProductController();//Product arraylist
        //testing value entries
        System.out.println(nameAddProductFld.getText());
        System.out.println(inventoryAddProductFld.getText());
        System.out.println(priceAddProductFld.getText());
        System.out.println(maxAddProductFld.getText());
        System.out.println(machineAddProductFld.getText());
        System.out.println(minAddProductFld.getText());
        System.out.println("Saved to Product list");
        //send the values to ProductController
        //create a reference of ProductController
        //ProductController prc = new ProductController();
        //prc.getValues(nameAddProductFld.getText(),inventoryAddProductFld.getText(),priceAddProductFld.getText(),maxAddProductFld.getText(),machineAddProductFld.getText(),minAddProductFld.getText());
        System.out.println(prc);
    }

}