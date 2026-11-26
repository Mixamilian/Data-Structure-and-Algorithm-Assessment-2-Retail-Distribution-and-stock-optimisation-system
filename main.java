public class main {
    public static void main(String[] args) {
        engine StockOperations = new engine();

        //sample products
        product bread = new product("1111","White Bread","Starchy food",1.79);
        StockOperations.addProduct(bread);
        product milk = new product("2222","1L Milk", "Dairy", 3.5);
        StockOperations.addProduct(milk);
        product cheese = new product("3333","Blue Cheese","dairy", 2.39);
        StockOperations.addProduct(cheese);

        //sample stores
        store Store1 = new store("01","london");
        StockOperations.addStore(Store1);
        store Store2 = new store("02","Portsmouth");
        StockOperations.addStore(Store2);
        store Store3 = new store("03","Liverpool");
        StockOperations.addStore(Store3);

        //Distribution centre stock samples
        distributionCentre North = new distributionCentre("10", "Manchester");
        StockOperations.addDistributionCentre(North);
        North.addCentreStock("1111", 500);
        North.addCentreStock("2222", 300);
        North.addCentreStock("3333", 150);

        distributionCentre Central= new distributionCentre("20", "Nottinghamshire");
        StockOperations.addDistributionCentre(Central);
        Central.addCentreStock("1111", 50);
        Central.addCentreStock("2222", 30);
        Central.addCentreStock("3333", 550);

        distributionCentre South = new distributionCentre("30", "southhampton");
        StockOperations.addDistributionCentre(South);
        South.addCentreStock("1111", 123);
        South.addCentreStock("2222", 111);
        South.addCentreStock("3333", 65);

        //sample request
        request req1 = new request("1", "01", "2222", 30, 5);
        StockOperations.requestRegistery(req1);
        request req2 = new request("2", "02", "1111", 80, 10);
        StockOperations.requestRegistery(req2);
        request req3 = new request("3", "03", "3333", 60, 7);
        StockOperations.requestRegistery(req3);

        StockOperations.engineProcess();
    }
}
