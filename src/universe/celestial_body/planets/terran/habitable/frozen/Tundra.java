package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Tundrová planeta</h1>
 * Studená kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Většinu povrchu tvoří permafrost.
 * Výjimku tvoří oblast kolem rovníku planety.
 * Existuje zde stabilní biosféra, nicméně většina vegetace se omezuje na mechy a lišejníky.
 * @author Jakub Štych
 * @version 1.5.2023
 */
public class Tundra extends Frozen {

    /**
     * <h2>Konstruktor tundrové planety</h2>
     */
    public Tundra() {
        setType("Terrestial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Tundra");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.PERMAFROST);
        setSelectedPlanetaryFeature(PlanetaryFeature.MILD_EQUATOR);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOSS);
        setSelectedPlanetaryFeature(PlanetaryFeature.LICHEN);
    }
}
