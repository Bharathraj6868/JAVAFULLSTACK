class VirtualMeetingScheduler {
    public void main(String[] args) {
        scheduleMeeting(5, 60);
        scheduleMeeting(10, 45);
        scheduleMeeting(8, 30);
    }
    public static void scheduleMeeting(int participants, int duration) {
        int totalMinutes = participants * duration;
        System.out.println(totalMinutes);
    }
}