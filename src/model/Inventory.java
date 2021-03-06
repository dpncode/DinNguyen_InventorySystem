package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {
    /**
     * observableArrayList() is an object (similar to an ArrayList) that can be referenced
     * by an Obervablelist reference
     */
    private static ObservableList<Part> allParts = FXCollections.observableArrayList(); //new ObservableList<Part>() { //   - allParts:ObservableList<Part> this is used for javafx listener

    public static void addPart(Part newPart) {   //+ addPart(newPart:Part):void  method from Part class
        allParts.add(newPart);
    }

    public static ObservableList<Part> getAllParts() { //+ getAllParts():ObservableList<Part>
        return allParts;
    }







/*
    ObservableList<Product> allProducts = new ObservableList<Product>() { // - allProducts:ObservableList<Product>
        @Override
        public void addListener(ListChangeListener<? super Product> listener) {

        }

        @Override
        public void removeListener(ListChangeListener<? super Product> listener) {

        }

        @Override
        public boolean addAll(Product... elements) {
            return false;
        }

        @Override
        public boolean setAll(Product... elements) {
            return false;
        }

        @Override
        public boolean setAll(Collection<? extends Product> col) {
            return false;
        }

        @Override
        public boolean removeAll(Product... elements) {
            return false;
        }

        @Override
        public boolean retainAll(Product... elements) {
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
        public Iterator<Product> iterator() {
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
        public boolean add(Product product) {
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
        public boolean addAll(Collection<? extends Product> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Product> c) {
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
        public Product get(int index) {
            return null;
        }

        @Override
        public Product set(int index, Product element) {
            return null;
        }

        @Override
        public void add(int index, Product element) {

        }

        @Override
        public Product remove(int index) {
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
        public ListIterator<Product> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Product> listIterator(int index) {
            return null;
        }

        @Override
        public List<Product> subList(int fromIndex, int toIndex) {
            return null;
        }

        @Override
        public void addListener(InvalidationListener listener) {

        }

        @Override
        public void removeListener(InvalidationListener listener) {

        }
    };

 */

    /*
    public void addProduct(Product newProduct) { //  + addProduct(newProduct:Product):void

    }

    public Part lookupPart(int partID) { //+ lookupPart(partId:int):Part

        return null;
    }

    public Product lookupProduct(int productId) { // + lookupProduct(productId:int):Product
        return null;
    }

    public ObservableList<Part> lookupPart(String partName) {// //+ lookupPart(partName:String):ObservableList<Part>
        return null;
    }

    public ObservableList<Product> lookupProduct(String productName) { //+ lookupProduct(productName:String):ObservableList<Product>
        return null;
    }

    public void updatePart(int index, Part selectedPart) {//+ updatePart(index:int, selectedPart:Part):void

    }

    public void updateProduct(int index, Product newProduct) {//+ updateProduct(index:int, newProduct:Product):void

    }

    public boolean deletePart(Part selectedPart) {//+ deletePart(selectedPart:Part):boolean


        return true;

    }

    public boolean deleteProduct(Product selectedProduct) {//+ deleteProduct(selectedProduct:Product):boolean
        return true;
    }

    public ObservableList<Product> getAllProducts() {//+ getAllProducts():ObservableList<Product>
        return null;
    }

     */


}
