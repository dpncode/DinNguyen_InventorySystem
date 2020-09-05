package model;


/**
 *extends keyword used in class so constructor of the abstract class is called through the "super" keyword
 *
 * Then pass all the other variables to the abstract class
 * */
public class InHouse extends Part {

  /*  + InHouse(id : int, name : String,
              price : double, stock : int, min : int, max : int,
              machineId:int)
*/

    //constructor
    public InHouse(int id,String name,double price,int stock, int min, int max,int machineId) {
        super(id,name,price,stock,min,max);
        this.machineId = machineId;
    }

    private int machineId; // - machineId : int

    public int getMachineId() { //getter method + getMachineId():int
        return machineId;
    }

    public void setMachineId(int machineId) { //setter method + setMachineId(machineId:int):void
        this.machineId = machineId;
    }
}
