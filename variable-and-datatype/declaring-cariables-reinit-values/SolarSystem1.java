public class SolarSystem1 {
    static String name;
    static int numberOfPlanets;
    static int numberOfDwarfPlanets;
    static int numberOfMoons;
    static boolean hasAsteroidBelt;
    static boolean hasKuiperBelt;
    static boolean hasOortCloud;
    static double sunMassFraction;
    static double giantPlanetsMassFraction;
    static double ageInBillionYears;
    static double diameterInLightYears;
    static double sunDiameterKm;
    static double habitableZoneStartAU;
    static double habitableZoneEndAU;
    static boolean hasLifeDetected;
    static String dominantStarType;
    static boolean hasRings;
    static int totalKnownAsteroids;
    static int knownComets;
    static String structureNote;

    public static void main(String[] args) {
        System.out.println("name: " + name);
        name = "Solar System";
        System.out.println("name: " + name);

        System.out.println("numberOfPlanets: " + numberOfPlanets);
        numberOfPlanets = 8;
        System.out.println("numberOfPlanets: " + numberOfPlanets);

        System.out.println("numberOfDwarfPlanets: " + numberOfDwarfPlanets);
        numberOfDwarfPlanets = 5;
        System.out.println("numberOfDwarfPlanets: " + numberOfDwarfPlanets);

        System.out.println("numberOfMoons: " + numberOfMoons);
        numberOfMoons = 204;
        System.out.println("numberOfMoons: " + numberOfMoons);

        System.out.println("hasAsteroidBelt: " + hasAsteroidBelt);
        hasAsteroidBelt = true;
        System.out.println("hasAsteroidBelt: " + hasAsteroidBelt);

        System.out.println("hasKuiperBelt: " + hasKuiperBelt);
        hasKuiperBelt = true;
        System.out.println("hasKuiperBelt: " + hasKuiperBelt);

        System.out.println("hasOortCloud: " + hasOortCloud);
        hasOortCloud = true;
        System.out.println("hasOortCloud: " + hasOortCloud);

        System.out.println("sunMassFraction: " + sunMassFraction);
        sunMassFraction = 99.86;
        System.out.println("sunMassFraction: " + sunMassFraction);

        System.out.println("giantPlanetsMassFraction: " + giantPlanetsMassFraction);
        giantPlanetsMassFraction = 0.10;
        System.out.println("giantPlanetsMassFraction: " + giantPlanetsMassFraction);

        System.out.println("ageInBillionYears: " + ageInBillionYears);
        ageInBillionYears = 4.6;
        System.out.println("ageInBillionYears: " + ageInBillionYears);

        System.out.println("diameterInLightYears: " + diameterInLightYears);
        diameterInLightYears = 0.0000189;
        System.out.println("diameterInLightYears: " + diameterInLightYears);

        System.out.println("sunDiameterKm: " + sunDiameterKm);
        sunDiameterKm = 1_392_700;
        System.out.println("sunDiameterKm: " + sunDiameterKm);

        System.out.println("habitableZoneStartAU: " + habitableZoneStartAU);
        habitableZoneStartAU = 0.95;
        System.out.println("habitableZoneStartAU: " + habitableZoneStartAU);

        System.out.println("habitableZoneEndAU: " + habitableZoneEndAU);
        habitableZoneEndAU = 1.37;
        System.out.println("habitableZoneEndAU: " + habitableZoneEndAU);

        System.out.println("hasLifeDetected: " + hasLifeDetected);
        hasLifeDetected = true;
        System.out.println("hasLifeDetected: " + hasLifeDetected);

        System.out.println("dominantStarType: " + dominantStarType);
        dominantStarType = "G-type";
        System.out.println("dominantStarType: " + dominantStarType);

        System.out.println("hasRings: " + hasRings);
        hasRings = true;
        System.out.println("hasRings: " + hasRings);

        System.out.println("totalKnownAsteroids: " + totalKnownAsteroids);
        totalKnownAsteroids = 1_000_000;
        System.out.println("totalKnownAsteroids: " + totalKnownAsteroids);

        System.out.println("knownComets: " + knownComets);
        knownComets = 3_700;
        System.out.println("knownComets: " + knownComets);

        System.out.println("structureNote: " + structureNote);
        structureNote = "Sun, 4 terrestrial, asteroid belt, 4 giant, Kuiper belt";
        System.out.println("structureNote: " + structureNote);
    }
}