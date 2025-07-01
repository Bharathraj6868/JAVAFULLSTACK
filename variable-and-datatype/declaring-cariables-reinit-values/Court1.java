public class Court1 {
    static String  type;
    static String  location;
    static double  length;
    static double  width;
    static String  surfaceType;
    static boolean hasRoof;
    static int     seatingCapacity;
    static boolean floodLights;
    static boolean scoreboard;
    static boolean lockerRooms;
    static boolean isIndoor;
    static String  courtID;
    static boolean hasBleachers;
    static boolean publicAccess;
    static String  maintenanceSchedule;
    static String  lastResurfacedDate;
    static boolean wheelchairAccessible;
    static String  owner;
    static String  contactNumber;
    static String  bookingURL;

    public static void main(String[] args) {
        System.out.println("type: " + type);
        type = "Tennis";
        System.out.println("type: " + type);

        System.out.println("location: " + location);
        location = "West Complex";
        System.out.println("location: " + location);

        System.out.println("length: " + length);
        length = 23.77;
        System.out.println("length: " + length);

        System.out.println("width: " + width);
        width = 8.23;
        System.out.println("width: " + width);

        System.out.println("surfaceType: " + surfaceType);
        surfaceType = "Hardcourt";
        System.out.println("surfaceType: " + surfaceType);

        System.out.println("hasRoof: " + hasRoof);
        hasRoof = false;
        System.out.println("hasRoof: " + hasRoof);

        System.out.println("seatingCapacity: " + seatingCapacity);
        seatingCapacity = 2000;
        System.out.println("seatingCapacity: " + seatingCapacity);

        System.out.println("floodLights: " + floodLights);
        floodLights = true;
        System.out.println("floodLights: " + floodLights);

        System.out.println("scoreboard: " + scoreboard);
        scoreboard = true;
        System.out.println("scoreboard: " + scoreboard);

        System.out.println("lockerRooms: " + lockerRooms);
        lockerRooms = true;
        System.out.println("lockerRooms: " + lockerRooms);

        System.out.println("isIndoor: " + isIndoor);
        isIndoor = false;
        System.out.println("isIndoor: " + isIndoor);

        System.out.println("courtID: " + courtID);
        courtID = "CT-101";
        System.out.println("courtID: " + courtID);

        System.out.println("hasBleachers: " + hasBleachers);
        hasBleachers = true;
        System.out.println("hasBleachers: " + hasBleachers);

        System.out.println("publicAccess: " + publicAccess);
        publicAccess = true;
        System.out.println("publicAccess: " + publicAccess);

        System.out.println("maintenanceSchedule: " + maintenanceSchedule);
        maintenanceSchedule = "Monthly";
        System.out.println("maintenanceSchedule: " + maintenanceSchedule);

        System.out.println("lastResurfacedDate: " + lastResurfacedDate);
        lastResurfacedDate = "2024-02-15";
        System.out.println("lastResurfacedDate: " + lastResurfacedDate);

        System.out.println("wheelchairAccessible: " + wheelchairAccessible);
        wheelchairAccessible = true;
        System.out.println("wheelchairAccessible: " + wheelchairAccessible);

        System.out.println("owner: " + owner);
        owner = "Sports Trust";
        System.out.println("owner: " + owner);

        System.out.println("contactNumber: " + contactNumber);
        contactNumber = "+91-80-88776655";
        System.out.println("contactNumber: " + contactNumber);

        System.out.println("bookingURL: " + bookingURL);
        bookingURL = "www.courtbooking.com/CT-101";
        System.out.println("bookingURL: " + bookingURL);
    }
}