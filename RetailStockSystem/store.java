package RetailStockSystem;



import java.util.Map;
import java.util.HashMap;



public class store {
    
    private String storeID;
    private String location;
    private Map<String,Integer> storeInventory;

    public store(String storeID, String location){
        this.storeID = storeID;
        this.location = location;
        this.storeInventory = new HashMap<>();

    }

    public String getStoreID(){
        return storeID;
    }
    public String getStoreLocation(){
        return location;
    }
    public int getStoreStock(String productID){
        return storeInventory.getOrDefault(productID, 0);
    }

    public void updateStoreStock(String productID, int quantity){
        storeInventory.put(productID, storeInventory.getOrDefault(productID, 0) + quantity);
    }
}
