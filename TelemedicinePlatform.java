class TelemedicinePlatform {
    public void main(String[] args) {
        conductConsultation(5, 30);
        conductConsultation(10, 20);
        conductConsultation(8, 25);
    }
    public static void conductConsultation(int patients, int minutes) {
        int totalTime = patients * minutes;
        System.out.println(totalTime);
    }
}