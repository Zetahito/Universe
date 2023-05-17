package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Popelová planeta</h1>
 * Kamenná planeta s nedýchatelnou atmosférou složenou z dusíku, uhlíku a oxidu siřičitého.
 * Jedná se o relativně mladý svět.
 * Planeta se ochladila ze své roztavené minulosti, stále má významné seizmické a sopečné aktivity.
 * Pro většinu živých tvorů je atmosféra jedovatá.
 * Postupně se vyvine v {@link universe.celestial_body.planets.terran.habitable.dry.Primal mladou planetu.}
 * @author Jakub Štych
 * @version 14.5.2023
 */
public class Ash extends Special {

    /**
     * <h2>Konstruktor popelové planety</h2>
     */
    public Ash() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Ash");

        setHabitability(0);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.VALLEY);
        setSelectedPlanetaryFeature(PlanetaryFeature.VOLCANO);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAVA_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAVA_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);

    }
}
