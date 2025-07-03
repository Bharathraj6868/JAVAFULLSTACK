class DroneDeliverySystem {
    public static void main(String[] args) {
        scheduleDelivery(5, 20);
        scheduleDelivery(10, 15);
        scheduleDelivery(8, 25);
    }
    public static void scheduleDelivery(int packages, int distance) {
        int totalDistance = packages * distance;
        System.out.println(totalDistance);
    }
}
