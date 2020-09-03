package model;

public class Outsourced {

    /*
    + Outsourced(id : int, name : String,
                 price : double, stock : int, min : int, max : int,
                 companyName:String)*/

//creating constructor
    //TODO: complete the constructor of Outsourced class after Part class is done.
    public Outsourced(String companyName) {
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
