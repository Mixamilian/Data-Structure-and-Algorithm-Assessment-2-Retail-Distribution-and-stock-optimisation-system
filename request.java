

public class request {

    private String requestID;
    private String storeID;
    private String productID;
    private Integer requestAmount;
    private Integer priority;

    public request(String requestID, String storeID, String productID, Integer requestAmount, Integer priority){
        this.requestID = requestID;
        this.storeID = storeID;
        this.productID = productID;
        this.requestAmount = requestAmount;
        this.priority = priority;
    }

    public String getRequest(){
        return requestID + storeID + productID + requestAmount + priority;
    }
    

}
