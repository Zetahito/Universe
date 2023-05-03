package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Subpolární planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta má subpolární klima s velkými teplotními rozdíly ročních období.
 * Nicméně dlouhé a ledové zimy jsou zde dominantním rysem.
 * Teplejší části planety pokrývají lesy.
 * V okolí pólů se nachází tundra a ledovce.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Boreal extends Frozen {

    /**
     * <h2>Konstruktor subpolární planety</h2>
     */
    public Boreal() {
        setType("Terrestial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Boreal");

        setHabitability(80);

        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.WATERFALL);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.SNOW_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
        setSelectedPlanetaryFeature(PlanetaryFeature.HILL);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIER);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOSS);
        setSelectedPlanetaryFeature(PlanetaryFeature.LICHEN);
        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.PERMAFROST);
    }
}
