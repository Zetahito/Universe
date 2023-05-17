package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Hyceánová planeta</h1>
 * Horká, oceánem pokrytá planeta s nedýchatelnou atmosférou složenou převážně z vodíku.
 * <b>HY</b>dro o<b>CEAN</b>ová planeta.
 * Teploty se pohybují kolem 473 stupňů Kelvina.
 * @author Jakub Štych
 * @version 14.5.2023
 */
public class Hycean extends Special {

    /**
     * <h2>Konstruktor hyceánské planety</h2>
     */
    public Hycean() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Hycean");

        setHabitability(10);

        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEEP_DWELLER);
    }
}
