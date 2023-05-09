package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Suchá jeskynní planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Slabá magnetosféra planety způsobuje, že většina povrchu je holými kameny.
 * Nicméně pod povrchem je nekonečný systém pískovcových jeskyní se slabou hydrosférou.
 * @author Jakub Štych
 * @version 9.5.2023
 */
public class DryCavern extends Dry {

    /**
     * <h2>Konstruktor suché jeskynní planety</h2>
     */
    public DryCavern() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setDryPlanetType("Cavern");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.CAVE_SYSTEM);
        setSelectedPlanetaryFeature(PlanetaryFeature.HOLLOW_CAVERN);
        setSelectedPlanetaryFeature(PlanetaryFeature.UNDERGROUND_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.OASIS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.NETHERWORLD);
    }
}
