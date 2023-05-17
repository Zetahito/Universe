package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Kyselinová planeta</h1>
 * Kamenná vlhká planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta má vysoké množství přírodních kyselin.
 * Ty jsou k nalezení v celé hydrosféře.
 * Biologický život, který se adaptoval na korozivní vzduch a vodu, roste mimořádně vysokým tempem.
 * @author Jakub Štych
 * @version 14.5.2023
 */
public class Acid extends Special {

    /**
     * <h2>Konstruktor kyselinové planety</h2>
     */
    public Acid() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Acid");

        setHabitability(10);

        setSelectedPlanetaryFeature(PlanetaryFeature.ACID_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.ACID_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.HIGH_ACIDITY_LAKE);
    }
}
