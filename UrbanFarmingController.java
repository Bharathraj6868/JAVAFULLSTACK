class UrbanFarmingController {
    public void main(String[] args) {
        monitorCropGrowth(100, 10);
        monitorCropGrowth(200, 5);
        monitorCropGrowth(150, 7);
    }
    public static void monitorCropGrowth(int plants, int days) {
        int yield = plants * days / 2;
        System.out.println(yield);
    }
}