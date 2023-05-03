package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Arktická planeta</h1>
 * Mrazivá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Polární kruhy jsou velké, sahají téměř až k rovníku.
 * Velké množství vody je uchováno ve věčně zmrzlém ledovcovém ledu.
 * Planeta zažívá roční období a většina života žije v okolí rovníku.
 * @author Jakub Štych
 * @version 1.5.2023
 */
public class Arctic extends Frozen {

    /**
     * <h2>Konstruktor arktické planety</h2>
     */
    public Arctic() {
        setType("Terrestial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Arctic");

        setHabitability(65);

        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_POLES);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.MILD_EQUATOR);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
    }
}
