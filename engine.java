
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
        this.requestQueue = new PriorityQueue<>((r1, r2)->Integer.compare(r2.getPriority(), r1.getPriority()));
    }

    public void addProduct(product product){
        productMap.put(product.getProductID(),product);
    }
    public void addStore(store store){
        storeMap.put(store.getStoreID(),store);
    }
    public void addDistributionCentre(distributionCentre centre){
        centreMap.put(centre.getCentreID(), centre);
    }
    public void requestRegistery(request request){
        requestQueue.offer(request);
        System.out.println("Registered request number: " +request.getRequest());
    }

}
 