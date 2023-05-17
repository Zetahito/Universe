package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Savanová planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Dominují zde suché vyprahlé planiny.
 * Drobná hydrosféra umožňuje krátká období dešťů
 * Kromě všudypřítomné trávy je vegetace soustředěný kolem mělkých oáz.
 * @author Jakub Štych
 * @version 26.4.2023
 */
public class Savanna extends Dry {

    /**
     * <h2>Konstruktor savanové planety</h2>
     */
    public Savanna() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Savanna");

        setHabitability(85);

        setSelectedPlanetaryFeature(PlanetaryFeature.OASIS);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLAINS);
    }
}
