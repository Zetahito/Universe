package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Atolová planeta</h1>
 * Oceánová planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Povrch planety tvoří mělké laguny, korálové útesy a tropické ostrovy.
 * Tropické podnebí na většině povrchu planety podporuje hojnost a rozmanitost biosféry.
 * @author Jakub Štych
 * @version 7.5.2023
 */
public class Atoll extends Wet {

    /**
     * <h2>Konstruktor atolové planety</h2>
     */
    public Atoll() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Atoll");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.CORAL_REEF);
        setSelectedPlanetaryFeature(PlanetaryFeature.CORAL_ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.MILD_EQUATOR);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_ISLAND);
    }
}
