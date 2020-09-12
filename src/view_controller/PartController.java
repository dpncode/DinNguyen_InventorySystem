package view_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.InHouse;
import model.Inventory;
import model.Part;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;

public class PartController implements Initializable {
    @FXML
    private TableView<Part> table;
    @FXML
    private TableColumn<Part, Integer> part_id;
    @FXML
    private TableColumn<Part, String> part_name;
    @FXML
    private TableColumn<Part, Double> cost;
    @FXML
    private TableColumn<Part, Integer> inv_level;
    @FXML
    private Button exitBtn; //Exit Button ID defined to fetch the button click
    private InhouseController ConfirmBox;
    ObservableList<Part> list = FXCollections.observableArrayList(
            new InHouse(1, "test", 11, 34, 223, 44, 22)
    );

    //Add Part button
    //this method is called whenever mouse is clicked on the respective button in our case add button of mainsceeen
    public void showInhouse(MouseEvent mouseEvent) throws IOException {
        //the method to redirect to add_Inhousepart.fxml file
        //root is the reference for the parent class to fetch the fxml file and load when the program starts
        //getresource is the method to get the fxml file
        //getclass fetch the class which contains the fxml file in our case it is mainscreen file
        // load is to get all the code into gui from FXMLloader class
        // all the data is stored in root which is to be shown from class Stage
        Stage stage = (Stage) exitBtn.getScene().getWindow();//close previous background window
        stage.close();//close previous background window

        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/add_InhousePart.fxml"));
        //primaryStage is the reference of stage class to prepage a location to show the fxml file
        Stage primaryStage = new Stage(); //
        //a setscene is the method to set the fxml design to  the primary stage
        primaryStage.setScene(new Scene(root));
        //show is the method to show the loaded file
        primaryStage.show();
    }

    //this method gets the value of inhouse part from Inhouse controller
    public void getValues(String text, String text1, String text2, String text3, String text4, String text5) {
        System.out.println("these are the values from partcontroller ");
        System.out.println(text);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);
        //pc.getValues,maxFld.getText(),machineFld.getText(),minFld.getText());
        String name = text;
        int inv = Integer.parseInt(text1);
        double price = Double.parseDouble(text2);
        int max = Integer.parseInt(text3);
        int macine = Integer.parseInt(text4);
        int min = Integer.parseInt(text5);
        Random rand = new Random();
        int id = rand.nextInt(10000);
        InHouse inc = new InHouse(id, name, price, inv, min, max, macine);
        list.addAll(inc);
        Inventory.addPart(inc);
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/view_controller/mainscreen.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("test");
        }
        Stage primaryStage = new Stage();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
      // Inventory
        //TODO: to show values to the mainscreen
    }


    //method to redirect to modify_InhousePart.fxml
    public void modifyInhouse(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) exitBtn.getScene().getWindow();//closing background window
        stage.close();//closing background window
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/modify_InhousePart.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void deleteInhouse(MouseEvent mouseEvent) {
        System.out.println("delete Inhouse");
    }

    //method to redirect to add_Product.fxml
    public void showProduct(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) exitBtn.getScene().getWindow();//closing background window
        stage.close();//closing background window
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/add_Product.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    //method to redirect to modify_Product.fxml
    public void modifyProduct(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) exitBtn.getScene().getWindow();//closing background window
        stage.close();//closing background window
        //stage.setOnCloseRequest(e -> ConfirmBox());//will trigger confirmaBox before closing.
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/modify_Product.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void deleteProduct(MouseEvent mouseEvent) {
        System.out.println("delete product");
    }

    //Exit button method
    public void exitMain(MouseEvent mouseEvent) {
        System.out.println("exit");
        //exitBtn is the id of the Exit Button in the mainscreen.fxml file which is defined at the top too
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        stage.close();
    }

    public void closeWindow() {
        System.out.println("close previous window");
        //exitBtn is the id of the Exit Button in the mainscreen.fxml file which is defined at the top too
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        //stage.close();
        //Boolean answer = ConfirmBox.display("Title","Are you sure?");
        //if(answer)
        stage.close();
    }

    /**
     * Called when user clicks 'X' button
     * warns user before closing window
     * uses the AlertType.CONFIRMATION dialog box
     *
     * @return
     */

    private boolean ConfirmBox() {
        Boolean close = false;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        //alert.setContentText("This is a confirmation alert window");
        alert.setTitle("Confirmation box");
        alert.setHeaderText("Are you sure you want to close?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            close = true;
        }
        return close;
    }

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */


    @Override
//Main method - first method to be called
    public void initialize(URL location, ResourceBundle resources) {


        part_id.setCellValueFactory(new PropertyValueFactory<Part, Integer>("id"));//calling getID method from Part.java class
        part_name.setCellValueFactory(new PropertyValueFactory<Part, String>("name"));
        cost.setCellValueFactory(new PropertyValueFactory<Part, Double>("price"));
        inv_level.setCellValueFactory(new PropertyValueFactory<Part, Integer>("stock"));
        list.addAll(Inventory.getAllParts());
        System.out.println(Inventory.getAllParts());
        table.setItems(Inventory.getAllParts()); //();


    }
}
