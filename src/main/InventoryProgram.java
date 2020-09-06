package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//    --module-path C:\Users\dpnco\Documents\openjfx-11.0.2_windows-x64_bin-sdk\javafx-sdk-11.0.2\lib$Classpath$ --add-modules javafx.controls,javafx.fxml

public class InventoryProgram extends Application { // this class extends application to work for javafx and get all the methods rom javafx
    @Override
    //it is used to get the function s and method from the extended class and whatever user does that is overridden
    //the start method is already defined in Application class so  we are overriding our code here that's override is written
    //override is specially used to modify already defined methods
    public void start(Stage primaryStage) throws Exception{ //method to start the gui
        //root is the reference f the parent class to fetch the fxml file and load when the program starts
        //getresoucre is the method to get the fxml file
        //getclass fetch the class which contains the fxml file in our case it is mainscreen file
        // load is to get all the code into gui from Fxmlloader class
        // all the data is stored in root which is to be shown from class Stage
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/mainscreen.fxml"));
        //primaryStage.setTitle("Hello World");
        //primarystage is the reference of Stage class which is used tp show GUI to the user//
        //setscene create a scene for the root which contains the design of the file
        primaryStage.setScene(new Scene(root));
        //show is the method to load the window
        primaryStage.show();
    }
    public static void main(String[] args) { //main method to run the application
        //it launch the application
        launch(args);

    }
}
