package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Metanová planeta</h1>
 * Kamenná planeta s nedýchatelnou atmosférou složenou z dusíku a metanu.
 * Metan tvoří většinu plynné atmosféry.
 * Teploty se pohybují kolem 93 stupňů Kelvina.
 * Metanová hydrosféra je díky tomu stabilní.
 * @author Jakub Štych
 * @version 14.5.2023
 */
public class Methane extends Special {

    public Methane() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Methane");

        setHabitability(0);

        setSelectedPlanetaryFeature(PlanetaryFeature.METHANE_LAKE);
    }
}
