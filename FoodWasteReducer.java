class FoodWasteReducer {
    public static void main(String[] args) {
        suggestMealPlan(10, 5);
        suggestMealPlan(15, 4);
        suggestMealPlan(12, 6);
    }
    public static void suggestMealPlan(int ingredients, int meals) {
        int wasteSaved = ingredients * meals * 5;
        System.out.println(wasteSaved);
    }
}
