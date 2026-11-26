
import java.util.*;



public class engine {
    private Map<String, product> productMap;
    private Map<String, store> storeMap;
    private Map<String, distributionCentre> centreMap;
    private PriorityQueue<request> requestQueue;
    
    public engine(){
        this.productMap = new HashMap<>();
        this.storeMap = new HashMap<>();
        this.centreMap = new HashMap<>();
        this.requestQueue = new PriorityQueue<>();
    }



}
