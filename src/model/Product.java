package model;

import javafx.collections.ObservableList;

public class Product {

    - associatedParts:ObservableList<Part>
- id : int
- name : String
- price : double
- stock : int
- min : int
- max : int
+ Product(id : int, name : String,
          price : double, stock : int, min : int, max : int)
+ setId(id:int):void
+ setName(name:String):void
+ setPrice(price:double):void
+ setStock(stock:int):void
+ setMin(min:int):void
+ setMax(max:int):void
+ getId():int
+ getName():String
+ getPrice():double
+ getStock():int
+ getMin():int
+ getMax():int
+ addAssociatedPart(part:Part):void
+ deleteAssociatedPart(selectedAssociatedPart:Part):boolean
+ getAllAssociatedParts():ObservableList<Part>


    public Product(int id) {
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Product(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Product(double price) {
        this.price = price;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //TODO: Cannot generate constructors for stock, min and max. Error message: Constructors already exist
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    private int min;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    private int max;

    public int getMax() {
        return max;
    }
}
