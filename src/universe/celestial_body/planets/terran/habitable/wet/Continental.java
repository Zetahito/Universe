package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Kontinentální planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Je zde aktivní a stabilní hydrosféra.
 * Povrch se skládá z kontinentů, které jsou od sebe odděleny oceány.
 * Jsou zde velké klimatické rozdíly v závislosti na lokaci na planetě.
 * @author Jakub Štych
 * @version 4.5.2023
 */
public class Continental extends Wet {

    /**
     * <h2>Konstruktor kontinentální planety</h2>
     */
    public Continental() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Continental");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.LOWLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.COLD_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.LONG_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
    }
}
