class FitnessGoalTracker {
    public void main(String[] args) {
        updateGoalProgress(5, 10);
        updateGoalProgress(10, 8);
        updateGoalProgress(8, 12);
    }
    public static void updateGoalProgress(int workouts, int intensity) {
        int progress = workouts * intensity;
        System.out.println(progress);
    }
}