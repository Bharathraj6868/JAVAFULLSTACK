public class Gym1 {
    static String name;
    static String address;
    static int totalMembers;
    static int totalTrainers;
    static boolean hasPool;
    static boolean hasSauna;
    static boolean hasSpa;
    static boolean personalTraining;
    static String openingTime;
    static String closingTime;
    static double monthlyFee;
    static double yearlyFee;
    static boolean cardioSection;
    static boolean weightliftingSection;
    static boolean groupClasses;
    static boolean childcareFacility;
    static boolean parkingAvailable;
    static String contactNumber;
    static String email;
    static String website;

    public static void main(String[] args) {
        System.out.println("name: " + name);
        name = "FitZone";
        System.out.println("name: " + name);

        System.out.println("address: " + address);
        address = "456 Health Ave";
        System.out.println("address: " + address);

        System.out.println("totalMembers: " + totalMembers);
        totalMembers = 2000;
        System.out.println("totalMembers: " + totalMembers);

        System.out.println("totalTrainers: " + totalTrainers);
        totalTrainers = 25;
        System.out.println("totalTrainers: " + totalTrainers);

        System.out.println("hasPool: " + hasPool);
        hasPool = true;
        System.out.println("hasPool: " + hasPool);

        System.out.println("hasSauna: " + hasSauna);
        hasSauna = false;
        System.out.println("hasSauna: " + hasSauna);

        System.out.println("hasSpa: " + hasSpa);
        hasSpa = false;
        System.out.println("hasSpa: " + hasSpa);

        System.out.println("personalTraining: " + personalTraining);
        personalTraining = true;
        System.out.println("personalTraining: " + personalTraining);

        System.out.println("openingTime: " + openingTime);
        openingTime = "06:00";
        System.out.println("openingTime: " + openingTime);

        System.out.println("closingTime: " + closingTime);
        closingTime = "22:00";
        System.out.println("closingTime: " + closingTime);

        System.out.println("monthlyFee: " + monthlyFee);
        monthlyFee = 1500.0;
        System.out.println("monthlyFee: " + monthlyFee);

        System.out.println("yearlyFee: " + yearlyFee);
        yearlyFee = 15000.0;
        System.out.println("yearlyFee: " + yearlyFee);

        System.out.println("cardioSection: " + cardioSection);
        cardioSection = true;
        System.out.println("cardioSection: " + cardioSection);

        System.out.println("weightliftingSection: " + weightliftingSection);
        weightliftingSection = true;
        System.out.println("weightliftingSection: " + weightliftingSection);

        System.out.println("groupClasses: " + groupClasses);
        groupClasses = true;
        System.out.println("groupClasses: " + groupClasses);

        System.out.println("childcareFacility: " + childcareFacility);
        childcareFacility = false;
        System.out.println("childcareFacility: " + childcareFacility);

        System.out.println("parkingAvailable: " + parkingAvailable);
        parkingAvailable = true;
        System.out.println("parkingAvailable: " + parkingAvailable);

        System.out.println("contactNumber: " + contactNumber);
        contactNumber = "+91-80-87654321";
        System.out.println("contactNumber: " + contactNumber);

        System.out.println("email: " + email);
        email = "contact@fitzone.com";
        System.out.println("email: " + email);

        System.out.println("website: " + website);
        website = "www.fitzone.com";
        System.out.println("website: " + website);
    }
}