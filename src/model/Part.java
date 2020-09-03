package model;

public class abstract Part {

        - id : int
        - name : String
        - price : double
        - stock : int
        - min : int
        - max : int
        + Part(id : int, name : String,
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


//TODO: cannot generate getters/setters or constructions due to abstract class
        private int id;
        private String name;
        private double price;
        private int stock
        private int min;
        private int max;




}
