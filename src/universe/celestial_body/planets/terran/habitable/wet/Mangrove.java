package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Mangovníková planeta</h1>
 * Vlhká a mokrá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Povrch planety je pokrytý mělkými moři a hornatými kontinenty.
 * Husté džungle se táhnou stovky kilometrů za pobřeží.
 * Hydrosféra je silná a stabilní.
 * Podporuje hojnost fauny a flóry.
 * @author Jakub Štych
 * @version 7.5.2023
 */
public class Mangrove extends Wet {

    /**
     * <h2>Konstruktor mangovníkové planety</h2>
     */
    public Mangrove() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Mangrove");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.JUNGLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LOWLANDS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SNOW_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHALLOW_WATER);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
    }
}
