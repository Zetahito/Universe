package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Skládková planeta</h1>
 * Kamenná planeta se znečištěnou atmosférou složenou z dusíku a kyslíku.
 * Tento svět je dlouhodobě používán jako skládka.
 * Každý kout planety je pokrytý průmyslovým šrotem a vraky vesmírných lodí.
 * To málo rostlin a zvířat, co přežilo zdejší podmínky, se museli adaptovat na tyto nebezpečné podmínky.
 * Hydrosféra je neexistující.
 * @author Jakub Štych
 * @version 16.5.2023
 */
public class Scrapyard extends Special {

    /**
     * <h2>Konstruktor skládkové planety</h2>
     */
    public Scrapyard() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Scrapyard");

        setHabitability(20);

        setSelectedPlanetaryFeature(PlanetaryFeature.JUNKYARD);
        setSelectedPlanetaryFeature(PlanetaryFeature.RADIOACTIVE_DUMP);
    }
}
