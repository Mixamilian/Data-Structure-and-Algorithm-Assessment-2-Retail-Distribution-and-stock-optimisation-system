public class product {
    
    private String productID;
    private String name;
    private String category;
    private double unitPrice;

    public product(String productID, String name, String category, double unitPrice){
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
    }

    public String getProductID(){
        return productID;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return unitPrice;
    }
}
