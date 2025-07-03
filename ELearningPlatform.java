class ELearningPlatform {
    public static void main(String[] args) {
        trackCourseProgress(20, 75);
        trackCourseProgress(30, 50);
        trackCourseProgress(25, 60);
    }
    public static void trackCourseProgress(int modules, int progress) {
        int completion = modules * progress / 100;
        System.out.println(completion);
    }
}
