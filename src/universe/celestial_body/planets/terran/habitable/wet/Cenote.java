package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta zatopených krasových závrtů</h1>
 * Vlhká kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Velké závrty a podzemní říční systémy se proplétají pod povrchem této planety.
 * Většina pevniny je pokryta hustou vegetací.
 * @author Jakub Štych
 * @version 8.5.2023
 */
public class Cenote extends Wet {

    /**
     * <h2>Konstruktor planety zatopených krasových závrtů</h2>
     */
    public Cenote() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Cenote");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SINKHOLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.WATERFALL);
        setSelectedPlanetaryFeature(PlanetaryFeature.LUSH_CAVE);
        setSelectedPlanetaryFeature(PlanetaryFeature.CAVE_SYSTEM);
        setSelectedPlanetaryFeature(PlanetaryFeature.HOLLOW_CAVERN);
        setSelectedPlanetaryFeature(PlanetaryFeature.UNDERGROUND_SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.UNDERGROUND_RIVER);
    }
}
