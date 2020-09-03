package model;

public class InHouse {

  /*  + InHouse(id : int, name : String,
              price : double, stock : int, min : int, max : int,
              machineId:int)
*/

//TODO: complete constructor after Part class is done
    //constructor
    public InHouse(int machineId) {
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
