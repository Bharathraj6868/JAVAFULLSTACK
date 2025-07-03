class GroceryDeliveryService {
    public static void main(String[] args) {
        processOrder(10, 5);
        processOrder(20, 3);
        processOrder(15, 4);
    }
    public static void processOrder(int items, int distance) {
        int cost = items * distance * 2;
        System.out.println(cost);
    }
}
