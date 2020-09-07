package view_controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class OutsourcedController {
    //creating textfield so that it can be called through any method
    //@FXML is used to fetch the fields through the given id
    @FXML
    private TextField nameFld,inventoryFld,priceFld,maxFld,companyFld,minFld;
    public void addOutsourced(){

    }

    public void saveOutsourcedPart(MouseEvent mouseEvent) {
        OutsourcedController oc = new OutsourcedController(); //Outsourced arraylist
        //testing Outsourced values entries
        System.out.println(nameFld.getText());
        System.out.println(inventoryFld.getText());
        System.out.println(priceFld.getText());
        System.out.println(maxFld.getText());
        System.out.println(companyFld.getText());
        System.out.println(minFld.getText());
        //Todo: save outsourced part
        String name = nameFld.getText();
        String inventory = inventoryFld.getText();
        //Outsourced out = new Outsourced (11,)
        //send the values to PartController
        //create a reference of PartController her
        PartController pc = new PartController();
        pc.getValues(nameFld.getText(),inventoryFld.getText(),priceFld.getText(),maxFld.getText(),companyFld.getText(),minFld.getText());

        }
    }

