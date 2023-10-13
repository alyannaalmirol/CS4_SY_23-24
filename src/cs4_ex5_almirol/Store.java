package cs4_ex5_almirol;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    earnings = 0;
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList();
    // add 'this' store to storeList    
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  
  public void sellItem(int index){
    boolean found = false;
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    System.out.println("\nSelling " + index + "...");
    if (index < itemList.size()){
        
        // get Item at index from itemList and add its cost to earnings     
        earnings += itemList.get(index).getCost();
        // print statement indicating the sale
        System.out.println("Name: " + itemList.get(index).getName() + ", Cost: " + itemList.get(index).getCost());
        found = true;
    }
    if (!found) {
        System.out.println("There are only " + itemList.size() + " items in the store.");  
    }  
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) 
    // (if not, print statement that the store doesn't sell it)  
    boolean found = false;
    System.out.println("\nSelling " + name + "...");
    for (int j = 0; j < itemList.size(); j++) {       
        if (itemList.get(j).getName().equals(name)) {            
            // get Item from itemList and add its cost to earnings
            earnings += itemList.get(j).getCost();
            // print statement indicating the sale
            System.out.println("Name: " + itemList.get(j).getName() + ", Cost: " + itemList.get(j).getCost());
            found = true;
        }
    }
    if(!found) {
        System.out.println("The store does not sell " + name + ".");
    } 
  }
  public void sellItem(Item i){     
    // check if Item i exists in the store (there is a method that can help with this) 
    // (if not, print statement that the store doesn't sell it)
    boolean found = false;
    System.out.println("\nSelling " + i.getName().toString() + "...");
    if (itemList.contains(i)) {        
        /* get Item i from itemList and add its cost to earnings */
        this.earnings += i.getCost();
        /* print statement indicating the sale */
        System.out.println("Name: " + i.getName() + ", Cost: " + i.getCost());
        found = true;       
    }
    if(!found) {      
        System.out.println("The store does not sell " + i.getName().toString() + ".");
    }
    
    
  }

  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.println("Finding items within a specific type:");
    for (int i = 0; i < itemList.size(); i++) {
        if(itemList.get(i).getType().equals(type)) {
            System.out.println("Name: " + itemList.get(i).getName() + ", Type: " + itemList.get(i).getType());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.println("\nCheap Items");
    for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getCost() <= maxCost) {
            System.out.println("Item: " + itemList.get(i).getName());    
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.println("\nExpensive Items");
    for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getCost() >= minCost) {             
             System.out.println("Item: " + itemList.get(i).getName());    
        }
    }
  }
  
  public static void printStats() {
    System.out.println("\nStore Stats:");
    // loop over storeList and print the name and the earnings'Store.java'
    for (int i = 0; i < storeList.size(); i++) {

        System.out.println("Name: " + storeList.get(i).getName() /*get i from storeList*/ + ", Earnings: " + storeList.get(i).getEarnings() /*get i from storeList*/);
    }
  }
}
/* Notes!
sellItem(String name) {
for (Item i : itemList) {
if (i.getName().equal(name) {
}
}
}
*/