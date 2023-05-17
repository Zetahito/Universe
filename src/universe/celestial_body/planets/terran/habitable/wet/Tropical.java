package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Tropická planeta</h1>
 * Vlhká planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Střídá se zde období vydatných srážek a období sucha.
 * Většina povrchu je pokryta hustou vegetací.
 * @author Jakub Štych
 * @version 4.5.2023
 */
public class Tropical extends Wet {

    /**
     * <h2>Konstruktor tropické planety</h2>
     */
    public Tropical() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Tropical");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.JUNGLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.DENSE_VEGETATION);
    }
}
