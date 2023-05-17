package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Polovyprahlá planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Povrch pokrývá křovinná vegetace a jsou zde k nalezení stolové hory a údolí.
 * Jsou zde krátká, ale významná období dešťů.
 * Kromě všudypřítomných trav se většina fauny a flóry soustřeďuje kolem vodních ploch a chráněných údolí.
 * @author Jakub Štych
 * @version 26.4.2023
 */
public class SemiArid extends Dry {

    /**
     * <h2>Konstruktor polovyprahlé planety</h2>
     */
    public SemiArid() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Semi-Arid");

        setHabitability(90);

        setSelectedPlanetaryFeature(PlanetaryFeature.MESA);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.VALLEY);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHRUBS);
        setSelectedPlanetaryFeature(PlanetaryFeature.CANYON);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
    }
}
