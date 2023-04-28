package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Superkontinentální planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Tektonické desky jsou zde ve stavu superkontinentu.
 * Pobřežní oblasti hýří životem.
 * Vnitrozemí jde rychle z travnatých plání do vyprahlých pouští.
 * @author Jakub Štych
 * @version 28.4.2023
 */
public class Supercontinent extends Dry {

    /**
     * <h2>Konstruktor superkontinentální planety</h2>
     */
    Supercontinent() {
        setType("Terrestial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Supercontinent");

        setHabitability(85);

        setSelectedPlanetaryFeature(PlanetaryFeature.OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.BEACH);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLANES);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
    }
}
