class SmartTrafficController {
    public void main(String[] args) {
        optimizeTrafficFlow(20, 50);
        optimizeTrafficFlow(30, 40);
        optimizeTrafficFlow(25, 60);
    }
    public static void optimizeTrafficFlow(int signals, int efficiency) {
        int reduction = signals * efficiency / 10;
        System.out.println(reduction);
    }
}