package model;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Product {
   ObservableList<Part> associatedParts = new ObservableList<Part>() {
       @Override
       public void addListener(ListChangeListener<? super Part> listener) {

       }

       @Override
       public void removeListener(ListChangeListener<? super Part> listener) {

       }

       @Override
       public boolean addAll(Part... elements) {
           return false;
       }

       @Override
       public boolean setAll(Part... elements) {
           return false;
       }

       @Override
       public boolean setAll(Collection<? extends Part> col) {
           return false;
       }

       @Override
       public boolean removeAll(Part... elements) {
           return false;
       }

       @Override
       public boolean retainAll(Part... elements) {
           return false;
       }

       @Override
       public void remove(int from, int to) {

       }

       @Override
       public int size() {
           return 0;
       }

       @Override
       public boolean isEmpty() {
           return false;
       }

       @Override
       public boolean contains(Object o) {
           return false;
       }

       @Override
       public Iterator<Part> iterator() {
           return null;
       }

       @Override
       public Object[] toArray() {
           return new Object[0];
       }

       @Override
       public <T> T[] toArray(T[] a) {
           return null;
       }

       @Override
       public boolean add(Part part) {
           return false;
       }

       @Override
       public boolean remove(Object o) {
           return false;
       }

       @Override
       public boolean containsAll(Collection<?> c) {
           return false;
       }

       @Override
       public boolean addAll(Collection<? extends Part> c) {
           return false;
       }

       @Override
       public boolean addAll(int index, Collection<? extends Part> c) {
           return false;
       }

       @Override
       public boolean removeAll(Collection<?> c) {
           return false;
       }

       @Override
       public boolean retainAll(Collection<?> c) {
           return false;
       }

       @Override
       public void clear() {

       }

       @Override
       public Part get(int index) {
           return null;
       }

       @Override
       public Part set(int index, Part element) {
           return null;
       }

       @Override
       public void add(int index, Part element) {

       }

       @Override
       public Part remove(int index) {
           return null;
       }

       @Override
       public int indexOf(Object o) {
           return 0;
       }

       @Override
       public int lastIndexOf(Object o) {
           return 0;
       }

       @Override
       public ListIterator<Part> listIterator() {
           return null;
       }

       @Override
       public ListIterator<Part> listIterator(int index) {
           return null;
       }

       @Override
       public List<Part> subList(int fromIndex, int toIndex) {
           return null;
       }

       @Override
       public void addListener(InvalidationListener listener) {

       }

       @Override
       public void removeListener(InvalidationListener listener) {

       }
   };
/*    - associatedParts:ObservableList<Part>
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
+ getAllAssociatedParts():ObservableList<Part>*/


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
