class CybersecurityMonitor {
    public void main(String[] args) {
        detectThreats(100, 1000);
        detectThreats(200, 500);
        detectThreats(150, 750);
    }
    public static void detectThreats(int systems, int scans) {
        int threatsFound = systems * scans / 100;
        System.out.println(threatsFound);
    }
}