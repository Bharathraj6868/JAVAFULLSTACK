public class ShoppingMall1 {
    static String name;
    static String address;
    static int numberOfStores;
    static int parkingCapacity;
    static boolean hasFoodCourt;
    static boolean hasCinema;
    static boolean hasPlayZone;
    static boolean hasWifi;
    static boolean petFriendly;
    static double totalFloorArea;
    static int floors;
    static String openingTime;
    static String closingTime;
    static int yearOpened;
    static String ownerCompany;
    static boolean wheelchairAccessible;
    static String websiteURL;
    static String contactNumber;
    static double annualFootTraffic;
    static boolean hasEVCharging;

    public static void main(String[] args) {
        System.out.println("name: " + name);
        name = "MegaMall";
        System.out.println("name: " + name);

        System.out.println("address: " + address);
        address = "Sunrise Road";
        System.out.println("address: " + address);

        System.out.println("numberOfStores: " + numberOfStores);
        numberOfStores = 150;
        System.out.println("numberOfStores: " + numberOfStores);

        System.out.println("parkingCapacity: " + parkingCapacity);
        parkingCapacity = 800;
        System.out.println("parkingCapacity: " + parkingCapacity);

        System.out.println("hasFoodCourt: " + hasFoodCourt);
        hasFoodCourt = true;
        System.out.println("hasFoodCourt: " + hasFoodCourt);

        System.out.println("hasCinema: " + hasCinema);
        hasCinema = true;
        System.out.println("hasCinema: " + hasCinema);

        System.out.println("hasPlayZone: " + hasPlayZone);
        hasPlayZone = true;
        System.out.println("hasPlayZone: " + hasPlayZone);

        System.out.println("hasWifi: " + hasWifi);
        hasWifi = true;
        System.out.println("hasWifi: " + hasWifi);

        System.out.println("petFriendly: " + petFriendly);
        petFriendly = false;
        System.out.println("petFriendly: " + petFriendly);

        System.out.println("totalFloorArea: " + totalFloorArea);
        totalFloorArea = 25000.0;
        System.out.println("totalFloorArea: " + totalFloorArea);

        System.out.println("floors: " + floors);
        floors = 5;
        System.out.println("floors: " + floors);

        System.out.println("openingTime: " + openingTime);
        openingTime = "10:00";
        System.out.println("openingTime: " + openingTime);

        System.out.println("closingTime: " + closingTime);
        closingTime = "22:00";
        System.out.println("closingTime: " + closingTime);

        System.out.println("yearOpened: " + yearOpened);
        yearOpened = 2010;
        System.out.println("yearOpened: " + yearOpened);

        System.out.println("ownerCompany: " + ownerCompany);
        ownerCompany = "Retail Developers Inc.";
        System.out.println("ownerCompany: " + ownerCompany);

        System.out.println("wheelchairAccessible: " + wheelchairAccessible);
        wheelchairAccessible = true;
        System.out.println("wheelchairAccessible: " + wheelchairAccessible);

        System.out.println("websiteURL: " + websiteURL);
        websiteURL = "www.megamall.com";
        System.out.println("websiteURL: " + websiteURL);

        System.out.println("contactNumber: " + contactNumber);
        contactNumber = "+91-80-66554433";
        System.out.println("contactNumber: " + contactNumber);

        System.out.println("annualFootTraffic: " + annualFootTraffic);
        annualFootTraffic = 2.5e6;
        System.out.println("annualFootTraffic: " + annualFootTraffic);

        System.out.println("hasEVCharging: " + hasEVCharging);
        hasEVCharging = true;
        System.out.println("hasEVCharging: " + hasEVCharging);
    }
}