class SmartHomeController {
    public void main(String[] args) {
        optimizeEnergyUsage(10, 5);
        optimizeEnergyUsage(20, 3);
        optimizeEnergyUsage(15, 4);
    }
    public static void optimizeEnergyUsage(int deviceCount, int hours) {
        int savings = deviceCount * hours * 10;
        System.out.println(savings);
    }
}