public class product {
    
    private String productID;
    private String name;
    private String category;
    private Float unitPrice;

    public product(String productID, String name, String category, Float unitPrice){
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
    public Float getPrice(){
        return unitPrice;
    }
}
