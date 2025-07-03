class SocialMediaAnalyzer {
    public void main(String[] args) {
        getTrendingTopics(100, 500);
        getTrendingTopics(200, 300);
        getTrendingTopics(150, 400);
    }
    public static void getTrendingTopics(int posts, int likes) {
        int engagement = posts + likes;
        System.out.println(engagement);
    }
}