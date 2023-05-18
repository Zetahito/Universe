package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Toxicky pustá planeta</h1>
 * Kamenná planeta se znečištěnou atmosférou složenou z dusíku a kyslíku.
 * Neregulovaný průmysl učinil planetu toxickou pro všechny formy života.
 * Na druhou stranu lze na planetě produkovat cokoliv bez ohlížení se na prostředí.
 * @author Jakub Štych
 * @version 10.5.2023
 */
public class ToxicWasteland extends Special {

    /**
     * <h2>Konstruktor toxicky pusté planety</h2>
     */
    public ToxicWasteland() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Toxic Wasteland");

        setHabitability(0);

        setSelectedPlanetaryFeature(PlanetaryFeature.RADIOACTIVE_DUMP);
        setSelectedPlanetaryFeature(PlanetaryFeature.TOXIC_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.TOXIC_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.INDUSTRIAL_WASTELAND);
    }
}
