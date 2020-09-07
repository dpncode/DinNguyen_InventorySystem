package view_controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class PartController {

    //this method is called whenever mouse is clicked onthe respective button in our case add button of mainsceeen
    public void showInhouse(MouseEvent mouseEvent) throws IOException {
        //the method to redirect to addInhourpart.fxml file
        //root is the reference f the parent class to fetch the fxml file and load when the program starts
        //getresoucre is the method to get the fxml file
        //getclass fetch the class which contains the fxml file in our case it is mainscreen file
        // load is to get all the code into gui from Fxmlloader class
        // all the data is stored in root which is to be shown from class Stage
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/add_InhousePart.fxml"));
        //primarystage is the reference of stage class to prepage a location to show the fxml file
        Stage primaryStage = new Stage(); //
        //a setscene is the method to set the fxml desing to  the primary stage
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
        //TODO: to show values to the mainscreen
    }
}
