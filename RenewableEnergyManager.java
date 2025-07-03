class RenewableEnergyManager {
    public void main(String[] args) {
        balanceGridLoad(50, 100);
        balanceGridLoad(100, 80);
        balanceGridLoad(75, 90);
    }
    public static void balanceGridLoad(int panels, int output) {
        int totalPower = panels * output;
        System.out.println(totalPower);
    }
}