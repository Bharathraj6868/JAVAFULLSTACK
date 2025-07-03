class ContactlessPaymentSystem {
    public static void main(String[] args) {
        processPayment(5, 100);
        processPayment(10, 50);
        processPayment(8, 75);
    }
    public static void processPayment(int transactions, int amount) {
        int total = transactions * amount;
        System.out.println(total);
    }
}
