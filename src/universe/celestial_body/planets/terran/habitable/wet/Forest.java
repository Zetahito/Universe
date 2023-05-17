package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Lesní planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Hydrosféra je aktivní a stabilní.
 * Velké kusy pevniny jsou téměř celé pokryty hustými lesy.
 * @author Jakub Štych
 * @version 5.5.2023
 */
public class Forest extends Wet {

    /**
     * <h2>Konstruktor lesní planety</h2>
     */
    public Forest() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Forest");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
    }
}
