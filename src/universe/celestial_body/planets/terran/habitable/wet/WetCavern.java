package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Vlhká jeskynní planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Slabá magnetosféra planety způsobuje, že většina povrchu je pokryta holým krasem.
 * Nicméně pod povrchem je nekonečný systém jeskyní s bohatou hydrosférou.
 * @author Jakub Štych
 * @version 9.5.2023
 */
public class WetCavern extends Wet {

    /**
     * <h2>Konstruktor vlhké jeskynní planety</h2>
     */
    public WetCavern() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Cavern");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.LUSH_CAVE);
        setSelectedPlanetaryFeature(PlanetaryFeature.CAVE_SYSTEM);
        setSelectedPlanetaryFeature(PlanetaryFeature.HOLLOW_CAVERN);
        setSelectedPlanetaryFeature(PlanetaryFeature.UNDERGROUND_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.NETHERWORLD);
    }
}
