package model;

/**
 *extends keyword used in class so constructor of the abstract class is called through the "super" keyword
 *
 * Then pass all the other variables to the abstract class
 * */

public class Outsourced extends Part{

    /**
     * Part is an abstract class
     * which is being inherited to the Outsource class
     * We use keyword "extends" in outsource file
     * so that all the fields and methods of abstract class can be used in Outsourced file
     * a.k.a inheritance
     * Part is a parent or super class
     * and the class which inherits the super or parent class is called child or sub class
     * Note: When creating constructor in parent class then must create constructor in child class too
     */

    /*
    + Outsourced(id : int, name : String,
                 price : double, stock : int, min : int, max : int,
                 companyName:String)*/

//creating constructor
    //TODO: complete the constructor of Outsourced class after Part class is done.
    public Outsourced(int id,String name,double price,int stock, int min, int max,String companyName) {
        super(id,name,price,stock,min,max);
        this.companyName = companyName;
    }

    private String companyName; // /*   - companyName : String



    public String getCompanyName() { //this is the getter method to het the value of companyname  + getCompanyName():String
        return companyName;
    }

    public void setCompanyName(String companyName) {//this is the setter method  + setCompanyName(companyName:String):void
        this.companyName = companyName;
    }
}
