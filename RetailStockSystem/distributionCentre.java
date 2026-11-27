package RetailStockSystem;

import java.util.Map;
import java.util.HashMap;


public class distributionCentre {
    private String centreID;
    private String location;
    private Map<String, Integer> centreInventory;

    public distributionCentre(String centreID, String location){
        this.centreID = centreID;
        this.location = location;
        this.centreInventory = new HashMap<>();
    }

    public String getCentreID(){
        return centreID;
    }
    public String getCentreLocation(){
        return location;
    }
    public int getCentreStock(String productID){
        return centreInventory.getOrDefault(productID, 0);
    }

    public void addCentreStock(String productID, int quantity){
        centreInventory.put(productID, centreInventory.getOrDefault(productID, 0) + quantity);
    }

    public boolean lowerStockAmount(String productID, int quantity){
        int current = centreInventory.getOrDefault(productID, 0);
        if(current >= quantity){
            centreInventory.put(productID, current- quantity);
            return true;
        }
        return false;
    }
}
