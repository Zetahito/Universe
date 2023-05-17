package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Akvatická planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta má významnou hydrosféru a veškerý povrch je pokryt oceánem.
 * @author Jakub Štych
 * @version 3.5.2023
 */
public class Aquatic extends Wet {

    /**
     * <h2>Konstruktor větrné planety</h2>
     */
    public Aquatic() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Aquatic");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
    }
}
