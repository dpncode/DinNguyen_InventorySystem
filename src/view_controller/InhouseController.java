package view_controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.InHouse;

import java.io.IOException;
import java.util.ArrayList;

public class InhouseController {
    //creating textfield so that it can be called through any method
    //@FXML is used to fetch the fields through the given id
    @FXML
    private TextField nameFld,inventoryFld,priceFld,maxFld,machineFld,minFld;
    @FXML
    private RadioButton OSradio, modifyOSradio;//add and modify part radio toggles to Outsourced screen
    int id = 0;
    ArrayList<InHouse> inHouse = new ArrayList<InHouse>();

    public void saveInhousePart(MouseEvent mouseEvent) {
        InhouseController ic = new InhouseController();//Inhouse arraylist
        //testing value entries
        System.out.println(nameFld.getText());
        System.out.println(inventoryFld.getText());
        System.out.println(priceFld.getText());
        System.out.println(maxFld.getText());
        System.out.println(machineFld.getText());
        System.out.println(minFld.getText());
        System.out.println("Saved to InHouse list");
        //send the values to PartController
        //create a reference of PartController
        PartController pc = new PartController();
        pc.getValues(nameFld.getText(),inventoryFld.getText(),priceFld.getText(),maxFld.getText(),machineFld.getText(),minFld.getText());
        System.out.println(pc);
    }
    //example code to display the added part
    //Todo: to be used later to display in the table
    public void display(String title, String s){
        for (InHouse a : inHouse){
            System.out.println(a.getName());
        }
    }

    //Add Part radio button method to toggle from inhouse to outsourced
    public void showOutsourcedPart(MouseEvent mouseEvent) throws IOException {
        System.out.println("add part radio outsourced button selected");
        Stage stage = (Stage) OSradio.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/add_OutsourcedPart.fxml"));
        System.out.println(root);
        //primaryStage is the reference of stage class to prepage a location to show the fxml file
        Stage primaryStage = new Stage(); //
        //a setscene is the method to set the fxml design to  the primary stage
        primaryStage.setScene(new Scene(root));
        //show is the method to show the loaded file
        primaryStage.show();
        //System.out.println("test");
    }

    //Modify part radio button method to toggle from inhouse to outsourced
    public void showModifyOutsourcedPart(MouseEvent mouseEvent) throws IOException {
        System.out.println("modify part radio outsourced button selected");
        Stage stage = (Stage) modifyOSradio.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/modify_OutsourcedPart.fxml"));
        System.out.println(root);
        Stage primaryStage = new Stage();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}
