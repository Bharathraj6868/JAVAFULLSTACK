class MentalHealthApp {
    public void main(String[] args) {
        logMeditationSession(5, 10);
        logMeditationSession(10, 15);
        logMeditationSession(8, 12);
    }
    public static void logMeditationSession(int sessions, int minutes) {
        int totalTime = sessions * minutes;
        System.out.println(totalTime);
    }
}