package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Oceánová planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Oceány pokrývají více než 90% povrchu planety.
 * Rozprostřené ostrovy zde tvoří menšinu.
 * @author Jakub Štych
 * @version 4.5.2023
 */
public class Ocean extends Wet {

    /**
     * <h2>Konstruktor oceánové planety</h2>
     */
    public Ocean() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Ocean");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
    }
}
