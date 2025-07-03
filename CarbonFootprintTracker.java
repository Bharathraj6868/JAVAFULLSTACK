class CarbonFootprintTracker {
    public static void main(String[] args) {
        calculateTripImpact(100, 20);
        calculateTripImpact(200, 15);
        calculateTripImpact(150, 10);
    }
    public static void calculateTripImpact(int miles, int efficiency) {
        int co2Saved = miles * efficiency / 10;
        System.out.println(co2Saved);
    }
}
