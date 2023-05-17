package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Sírová planeta</h1>
 * Kamenná planeta s nedýchatelnou atmosférou složenou z dusíku a síry.
 * Síra tvoří většinu plynné atmosféry.
 * Vysoká sopečná činnost pokrývá povrch planety tisíci sírovými horkými prameny.
 * V těchto pramenech může existovat primitivní život.
 * @author Jakub Štych
 * @version 14.5.2023
 */
public class Sulfur extends Special {

    /**
     * <h2>Konstruktor sírové planety</h2>
     */
    public Sulfur() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Sulfur");

        setHabitability(5);

        setSelectedPlanetaryFeature(PlanetaryFeature.SULFUR_HOT_SPRING);
    }
}
