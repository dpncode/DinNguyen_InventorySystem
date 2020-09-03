package model;

import javafx.collections.ObservableList;

public class Inventory {

    - allParts:ObservableList<Part>
- allProducts:ObservableList<Product>
+ addPart(newPart:Part):void
+ addProduct(newProduct:Product):void
+ lookupPart(partId:int):Part
+ lookupProduct(productId:int):Product
+ lookupPart(partName:String):ObservableList<Part>
+ lookupProduct(productName:String):ObservableList<Product>
+ updatePart(index:int, selectedPart:Part):void
+ updateProduct(index:int, newProduct:Product):void
+ deletePart(selectedPart:Part):boolean
+ deleteProduct(selectedProduct:Product):boolean
+ getAllParts():ObservableList<Part>
+ getAllProducts():ObservableList<Product>

    



}
