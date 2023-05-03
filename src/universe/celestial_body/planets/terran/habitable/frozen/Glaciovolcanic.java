package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta vulkanických ledovců</h1>
 * Hornatá zmrzlá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Na planetě je významná vulkanická činnost, která planetu ohřívá.
 * Bez ní by planeta byla pokrytá pouze ledovci a ledem.
 * Život se soustřeďuje v okolí horkých pramenů a teplých jezer.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Glaciovolcanic extends Frozen {

    /**
     * <h2>Konstruktor planety vulkanických ledovců</h2>
     */
    public Glaciovolcanic() {
        setType("Terrestial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Glaciovolcanic");

        setHabitability(50);

        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.FROZEN_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIER);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.VOLCANO);
        setSelectedPlanetaryFeature(PlanetaryFeature.HOT_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.WARM_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
    }
}
