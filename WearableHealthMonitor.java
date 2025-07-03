class WearableHealthMonitor {
    public void main(String[] args) {
        checkVitalSigns(70, 60);
        checkVitalSigns(80, 45);
        checkVitalSigns(75, 30);
    }
    public static void checkVitalSigns(int heartRate, int duration) {
        int healthScore = heartRate * duration / 60;
        System.out.println(healthScore);
    }
}