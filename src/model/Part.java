package model;

/*public class abstract Part {

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
        + getMax():int*/
//Inventory a.k.a Stock

/**
 * Supplied class Part.java
 */

/**
 *
 * @author Din Nguyen
 */
public abstract class Part {
        private int id;
        private String name;
        private double price;
        private int stock;
        private int min;
        private int max;
        //constructor  it si already defined here
        public Part(int id, String name, double price, int stock, int max, int min) {
                this.id = id;
                this.name = name;
                this.price = price;
                this.stock = stock;
                this.max = max;
                this.min = min; //note constructor for Max and Min, in constructor we must pass in Min first and then Max vs what is displayed on the
// GUI where Max is 1st and Min is second.

        }

        /**
         * @return the id
         */


        public int getId() {
                return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
                this.id = id;
        }

        /**
         * @return the name
         */
        public String getName() {
                return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
                this.name = name;
        }

        /**
         * @return the price
         */
        public double getPrice() {
                return price;
        }

        /**
         * @param price the price to set
         */
        public void setPrice(double price) {
                this.price = price;
        }

        /**
         * @return the stock
         */
        public int getStock() {
                return stock;
        }

        /**
         * @param stock the stock to set
         */
        public void setStock(int stock) {
                this.stock = stock;
        }

        /**
         * @return the min
         */
        public int getMin() {
                return min;
        }

        /**
         * @param min the min to set
         */
        public void setMin(int min) {
                this.min = min;
        }

        /**
         * @return the max
         */
        public int getMax() {
                return max;
        }

        /**
         * @param max the max to set
         */
        public void setMax(int max) {
                this.max = max;
        }

        public Part(int id) {
                this.id = id;
        }

        public Part(String name) {
                this.name = name;
        }

        public Part(double price) {
                this.price = price;
        }




}




