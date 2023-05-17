package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta zkamenělých dřevin</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Je zde aktivní a stabilní hydrosféra.
 * Povrch se skládá z kontinentů, které jsou od sebe odděleny oceány.
 * Jsou zde velké klimatické rozdíly v závislosti na lokaci na planetě.
 * Kvůli celoplanetární potopě po konci doby ledové je povrch pokrytý zkamenělými pozůstatky lesů.
 * @author Jakub Štych
 * @version 9.5.2023
 */
public class PetrifiedWoods extends Wet {

    /**
     * <h2>Konstruktor planety zkamenělých dřevin</h2>
     */
    public PetrifiedWoods() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Continental");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.LOWLANDS);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.LONG_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.COLD_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.PETRIFIED_TREE);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
    }
}
