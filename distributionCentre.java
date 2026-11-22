
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
}
