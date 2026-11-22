


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
    public String getLocation(){
        return location;
    }
    public int getStock(String productID){
        return storeInventory.getOrDefault(productID, 0);
    }

}
