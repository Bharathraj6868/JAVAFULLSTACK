class AirQualityMonitor {
    public void main(String[] args) {
        reportAirQuality(10, 500);
        reportAirQuality(20, 600);
        reportAirQuality(15, 450);
    }
    public static void reportAirQuality(int sensors, int readings) {
        int aqi = readings / sensors;
        System.out.println(aqi);
    }
}