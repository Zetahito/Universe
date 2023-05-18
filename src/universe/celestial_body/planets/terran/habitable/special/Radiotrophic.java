package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Radiotropická planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Vysoká úroveň radiace zmutovala zdejší život.
 * Ten nyní používá radiosyntézu a přeměňuje gama záření na energii.
 * @author Jakub Štych
 * @version 14.5.2023
 */
public class Radiotrophic extends Special {

    /**
     * <h2>Konstruktor radiotropické planety</h2>
     */
    public Radiotrophic() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Radiotrophic");

        setHabitability(20);

        setSelectedPlanetaryFeature(PlanetaryFeature.RADIOACTIVE_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.RADIOACTIVE_PLANT);
    }
}
