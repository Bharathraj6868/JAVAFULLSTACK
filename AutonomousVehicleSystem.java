class AutonomousVehicleSystem {
    public static void main(String[] args) {
        navigateRoute(100, 50);
        navigateRoute(200, 40);
        navigateRoute(150, 60);
    }
    public static void navigateRoute(int distance, int speed) {
        int eta = distance / speed;
        System.out.println(eta);
    }
}
