package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Vyprahlá planeta</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Prachem pokrytý povrch se skládá převážné ze stolových hor a kaňonů.
 * V okolí pólů lze nalézt i lesy, ale vegetace je jinak vzácná.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public class Arid extends Dry {

    /**
     * <h2>Konstruktor vyprahlé planety</h2>
     */
    public Arid() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Arid");

        setHabitability(85);

        setSelectedPlanetaryFeature(PlanetaryFeature.DUST);
        setSelectedPlanetaryFeature(PlanetaryFeature.MESA);
        setSelectedPlanetaryFeature(PlanetaryFeature.CANYON);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
    }
    
}
