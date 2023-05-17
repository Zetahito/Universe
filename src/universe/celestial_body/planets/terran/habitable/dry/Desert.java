package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Pouštní planeta</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Srážky i vodní plochy jsou relativně vzácné.
 * Jsou zde velké rozdíly mezi denními a nočními teplotami.
 * Vegetace je vzácná, ale i mírné srážky dokáží poušť rozkvést.
 * @author Jakub Štych
 * @version 23.4.2023
 */
public class Desert extends Dry {

    /**
     * <h2>Konstruktor pouštní planety</h2>
     */
    public Desert() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Desert");

        setHabitability(75);

        setSelectedPlanetaryFeature(PlanetaryFeature.OASIS);
        setSelectedPlanetaryFeature(PlanetaryFeature.DUNES);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
    }
}
