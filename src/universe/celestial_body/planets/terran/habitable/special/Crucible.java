package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Žíhací planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Povrch planety byl uměle roztaven.
 * Atmosféra je tenká a dýchatelná pouze v mělkém pásu, kde se vznášejí umělé ostrovy.
 * Povrch planety je udržován roztavený díky kruhovému pásu velkých pecí kolem rovníku planety.
 * @author Jakub Štych
 * @version 16.5.2023
 */
public class Crucible extends Special {

    /**
     * <h2>Konstruktor krystalické planety</h2>
     */
    public Crucible() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Crucible");

        setHabitability(35);

        setSelectedPlanetaryFeature(PlanetaryFeature.VOLCANO);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAVA_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAVA_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAVA_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.FLOATING_FURNACE);
    }
}
