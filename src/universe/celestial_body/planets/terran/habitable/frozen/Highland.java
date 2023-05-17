package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Vysočinská planeta</h1>
 * Studená vlhká planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Většina planety je pokryta mlhovými vysočinami.
 * K nalezení jsou zde pevné trávy a lišejníky v okolí náhorních plošin.
 * Hydrosféra je stabilní mezi zmrzlými horami a vnitrozemskými mořemi.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Highland extends Frozen {

    /**
     * <h2>Konstruktor vysočinské planety</h2>
     */
    public Highland() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Highland");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.LICHEN);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.CRAGGY_MOUNTAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
    }
}
