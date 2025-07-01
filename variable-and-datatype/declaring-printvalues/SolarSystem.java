public class SolarSystem {
    static String name = "Solar System";
    static int numberOfPlanets = 8;
    static int numberOfDwarfPlanets = 5;
    static int numberOfMoons = 204;             
    static boolean hasAsteroidBelt = true;
    static boolean hasKuiperBelt = true;
    static boolean hasOortCloud = true;
    static double sunMassFraction = 99.86;      
    static double giantPlanetsMassFraction = 0.10; 
static double ageInBillionYears = 4.6;      
    static double diameterInLightYears = 0.0000189; 
    static double sunDiameterKm = 1_392_700;
    static double habitableZoneStartAU = 0.95;
    static double habitableZoneEndAU = 1.37;
    static boolean hasLifeDetected = true;      
    static String dominantStarType = "G-type";
    static boolean hasRings = true;           
    static int totalKnownAsteroids = 1_000_000; 
    static int knownComets = 3_700;             
    static String structureNote = "Sun, 4 terrestrial, asteroid belt, 4 giant, Kuiper belt";

    public static void main(String[] args) {
        System.out.println("name: " + name);
        System.out.println("numberOfPlanets: " + numberOfPlanets);
        System.out.println("numberOfDwarfPlanets: " + numberOfDwarfPlanets);
        System.out.println("numberOfMoons: " + numberOfMoons);
        System.out.println("hasAsteroidBelt: " + hasAsteroidBelt);
        System.out.println("hasKuiperBelt: " + hasKuiperBelt);
        System.out.println("hasOortCloud: " + hasOortCloud);
        System.out.println("sunMassFraction (%): " + sunMassFraction);
        System.out.println("giantPlanetsMassFraction (%): " + giantPlanetsMassFraction);
        System.out.println("ageInBillionYears: " + ageInBillionYears);
        System.out.println("diameterInLightYears: " + diameterInLightYears);
        System.out.println("sunDiameterKm: " + sunDiameterKm);
        System.out.println("habitableZoneStartAU: " + habitableZoneStartAU);
        System.out.println("habitableZoneEndAU: " + habitableZoneEndAU);
        System.out.println("hasLifeDetected: " + hasLifeDetected);
        System.out.println("dominantStarType: " + dominantStarType);
        System.out.println("hasRings: " + hasRings);
        System.out.println("totalKnownAsteroids: " + totalKnownAsteroids);
        System.out.println("knownComets: " + knownComets);
        System.out.println("structureNote: " + structureNote);
    }
}