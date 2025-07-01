public class Satellite1 {
    static String name;
    static String operator;
    static String launchDate;
    static String orbitType;
    static double missionDuration;
    static String status;
    static double weight;
    static String manufacturer;
    static int powerOutput;
    static boolean solarPowered;
    static int transponders;
    static String frequencyBand;
    static boolean isEncrypted;
    static String country;
    static String purpose;
    static String groundStation;
    static boolean hasCamera;
    static boolean isActive;
    static String decommissionDate;
    static String controlCenterContact;

    public static void main(String[] args) {
        System.out.println("name: " + name);
        name = "GeoSat-1";
        System.out.println("name: " + name);

        System.out.println("operator: " + operator);
        operator = "SpaceCom";
        System.out.println("operator: " + operator);

        System.out.println("launchDate: " + launchDate);
        launchDate = "2023-07-15";
        System.out.println("launchDate: " + launchDate);

        System.out.println("orbitType: " + orbitType);
        orbitType = "GEO";
        System.out.println("orbitType: " + orbitType);

        System.out.println("missionDuration: " + missionDuration);
        missionDuration = 15.0;
        System.out.println("missionDuration: " + missionDuration);

        System.out.println("status: " + status);
        status = "Operational";
        System.out.println("status: " + status);

        System.out.println("weight: " + weight);
        weight = 1200.0;
        System.out.println("weight: " + weight);

        System.out.println("manufacturer: " + manufacturer);
        manufacturer = "Orbital Inc.";
        System.out.println("manufacturer: " + manufacturer);

        System.out.println("powerOutput: " + powerOutput);
        powerOutput = 5000;
        System.out.println("powerOutput: " + powerOutput);

        System.out.println("solarPowered: " + solarPowered);
        solarPowered = true;
        System.out.println("solarPowered: " + solarPowered);

        System.out.println("transponders: " + transponders);
        transponders = 24;
        System.out.println("transponders: " + transponders);

        System.out.println("frequencyBand: " + frequencyBand);
        frequencyBand = "Ku-band";
        System.out.println("frequencyBand: " + frequencyBand);

        System.out.println("isEncrypted: " + isEncrypted);
        isEncrypted = true;
        System.out.println("isEncrypted: " + isEncrypted);

        System.out.println("country: " + country);
        country = "USA";
        System.out.println("country: " + country);

        System.out.println("purpose: " + purpose);
        purpose = "Communications";
        System.out.println("purpose: " + purpose);

        System.out.println("groundStation: " + groundStation);
        groundStation = "Station X";
        System.out.println("groundStation: " + groundStation);

        System.out.println("hasCamera: " + hasCamera);
        hasCamera = false;
        System.out.println("hasCamera: " + hasCamera);

        System.out.println("isActive: " + isActive);
        isActive = true;
        System.out.println("isActive: " + isActive);

        System.out.println("decommissionDate: " + decommissionDate);
        decommissionDate = "";
        System.out.println("decommissionDate: " + decommissionDate);

        System.out.println("controlCenterContact: " + controlCenterContact);
        controlCenterContact = "contact@spacecom.com";
        System.out.println("controlCenterContact: " + controlCenterContact);
    }
}