package view_controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InhouseController {
    //creating textfield so that it can be called through any method
    //@FXML is used to fetch the fields through the given id
    @FXML
    private TextField nameFld,inventoryFld,priceFld,maxFld,machineFld,minFld;
    public void addInhouse(){

    }

    public void saveInhousePart(MouseEvent mouseEvent) {
        InhouseController ic = new InhouseController();//Inhouse arraylist
        //testing value entries
        System.out.println(nameFld.getText());
        System.out.println(inventoryFld.getText());
        System.out.println(priceFld.getText());
        System.out.println(maxFld.getText());
        System.out.println(machineFld.getText());
        System.out.println(minFld.getText());
        //Todo: save inhouse part
        String name = nameFld.getText();
        String inventory = inventoryFld.getText();
        //InHouse inh = new InHouse(11,)
        //send the values to PartController
        //create a reference of PartController her
        PartController pc = new PartController();
        pc.getValues(nameFld.getText(),inventoryFld.getText(),priceFld.getText(),maxFld.getText(),machineFld.getText(),minFld.getText());

    }
}
