package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Amoniaková planeta</h1>
 * Kamenná planeta s nedýchatelnou atmosférou složenou z dusíku a amoniaku.
 * Amoniak tvoří většinu plynné atmosféry.
 * Planeta má výrazně vyšší atmosférický tlak než jiné terestrické planety.
 * Díky tomu je amoniak v atmosféře stabilní.
 * Může zde existovat pouze primitivní život.
 * @author Jakub Štych
 * @version 14.5.2023
 */
public class Ammonia extends Special {

    /**
     * <h2>Konstruktor amoniakové planety</h2>
     */
    public Ammonia() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Ammonia");

        setHabitability(5);

        setSelectedPlanetaryFeature(PlanetaryFeature.AMMONIA_SOLID);
    }

}
