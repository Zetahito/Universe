package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Veldová planeta</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Subtropické podnebí doplňuje množství křovin a savan.
 * Planeta má mírné zimy a horká dlouhá léta.
 * Veld je otevřená rurální oblast převážných rovin.
 * @author Jakub Štych
 * @version 28.4.2023
 */
public class Veld extends Dry {

    /**
     * <h2>Konstruktor veldové planety</h2>
     */
    Veld() {
        setType("Terrestial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Veld");

        setHabitability(85);

        setSelectedPlanetaryFeature(PlanetaryFeature.FLAT);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHRUBS);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.OASIS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLANES);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
    }
}
