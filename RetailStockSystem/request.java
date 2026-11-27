package RetailStockSystem;

public class request {

    private String requestID;
    private store store;
    private product product;
    private Integer requestAmount;
    private Integer priority;

    public request(String requestID, String storeID, String productID, Integer requestAmount, Integer priority){
        this.requestID = requestID;
        this.store = store;
        this.product = product;
        this.requestAmount = requestAmount;
        this.priority = priority;
    }

    public String getRequest(){
        return requestID;
    }
    public store getStore(){
        return store;
    }
    public product getProduct(){
        return product;
    }
    public int getRequestAmount(){
        return requestAmount;
    }
    public int getPriority(){
        return priority;
    }
    

}
