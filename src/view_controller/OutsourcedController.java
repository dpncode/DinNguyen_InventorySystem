package view_controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Outsourced;

import java.io.IOException;
import java.util.ArrayList;


public class OutsourcedController {
    //creating textfield so that it can be called through any method
    //@FXML is used to fetch the fields through the given id
    @FXML
    private TextField nameFld, inventoryFld, priceFld, maxFld, companyFld, minFld;
    @FXML
    private RadioButton IHradio;//Radio toggle to Inhouse screen
    int id = 0;
    ArrayList<Outsourced> outSourced = new ArrayList<Outsourced>();

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
        System.out.println("Save to OutsourcedPart");
        //Todo: save outsourced part

        String name = nameFld.getText();
        int inventory = Integer.parseInt(inventoryFld.getText());
        double price = Double.parseDouble(priceFld.getText()); //the value that came from the gui is string so we are converting it to double using parse
        int min  = Integer.parseInt(minFld.getText());
        int max = Integer.parseInt(maxFld.getText());
        String companyName = companyFld.getText();
        id=+1;//ID auto generated, auto increment
        outSourced.add(new Outsourced(id,name,price,inventory,min,max,companyName));

        //Outsourced out = new Outsourced(11,)
        //send the values to PartController
        //create a reference of PartController
        PartController pc = new PartController();
        pc.getValues(nameFld.getText(),inventoryFld.getText(),priceFld.getText(),maxFld.getText(),companyFld.getText(),minFld.getText());

    }



    //radio button method to toggle from outsourced to inhouse
    public void showInhousePart(MouseEvent mouseEvent) throws IOException {
        System.out.println("radio inhouse button selected ");
        Stage stage = (Stage) IHradio.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/add_InhousePart.fxml"));
        System.out.println(root);
        //primaryStage is the reference of stage class to prepage a location to show the fxml file
        Stage primaryStage = new Stage(); //
        //a setscene is the method to set the fxml design to  the primary stage
        primaryStage.setScene(new Scene(root));
        //show is the method to show the loaded file
        primaryStage.show();
    }
}


