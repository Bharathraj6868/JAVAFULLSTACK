public class PoliceStation1 {
    static String  name;
    static String  location;
    static int     officers;
    static int     vehicles;
    static String  contact;
    static boolean cyberCell;
    static boolean womenCell;
    static int     casesResolved;
    static int     pendingCases;
    static String  jurisdiction;
    static boolean dayDuty;
    static String  headOfficer;
    static String  email;
    static int     staff;
    static String  establishedYear;
    static boolean lostAndFound;
    static boolean communityPrograms;
    static boolean fingerprintLab;
    static boolean dogSquadAvailable;

    public static void main(String[] args) {
        System.out.println("name: " + name);
        name = "State Police Station";
        System.out.println("name: " + name);

        System.out.println("location: " + location);
        location = "Downtown";
        System.out.println("location: " + location);

        System.out.println("officers: " + officers);
        officers = 120;
        System.out.println("officers: " + officers);

        System.out.println("vehicles: " + vehicles);
        vehicles = 30;
        System.out.println("vehicles: " + vehicles);

        System.out.println("contact: " + contact);
        contact = "100";
        System.out.println("contact: " + contact);

        System.out.println("cyberCell: " + cyberCell);
        cyberCell = true;
        System.out.println("cyberCell: " + cyberCell);

        System.out.println("womenCell: " + womenCell);
        womenCell = true;
        System.out.println("womenCell: " + womenCell);

        System.out.println("casesResolved: " + casesResolved);
        casesResolved = 1500;
        System.out.println("casesResolved: " + casesResolved);

        System.out.println("pendingCases: " + pendingCases);
        pendingCases = 310;
        System.out.println("pendingCases: " + pendingCases);

        System.out.println("jurisdiction: " + jurisdiction);
        jurisdiction = "City Limits";
        System.out.println("jurisdiction: " + jurisdiction);

        System.out.println("dayDuty: " + dayDuty);
        dayDuty = true;
        System.out.println("dayDuty: " + dayDuty);

        System.out.println("headOfficer: " + headOfficer);
        headOfficer = "Inspector Raju";
        System.out.println("headOfficer: " + headOfficer);

        System.out.println("email: " + email);
        email = "central@police.in";
        System.out.println("email: " + email);

        System.out.println("staff: " + staff);
        staff = 200;
        System.out.println("staff: " + staff);

        System.out.println("establishedYear: " + establishedYear);
        establishedYear = "1999";
        System.out.println("establishedYear: " + establishedYear);

        System.out.println("lostAndFound: " + lostAndFound);
        lostAndFound = true;
        System.out.println("lostAndFound: " + lostAndFound);

        System.out.println("communityPrograms: " + communityPrograms);
        communityPrograms = true;
        System.out.println("communityPrograms: " + communityPrograms);

        System.out.println("fingerprintLab: " + fingerprintLab);
        fingerprintLab = false;
        System.out.println("fingerprintLab: " + fingerprintLab);

        System.out.println("dogSquadAvailable: " + dogSquadAvailable);
        dogSquadAvailable = true;
        System.out.println("dogSquadAvailable: " + dogSquadAvailable);
    }
}