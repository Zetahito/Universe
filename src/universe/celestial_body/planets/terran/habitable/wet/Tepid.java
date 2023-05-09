package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Vlažná planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Hydrosféra je aktivní a stabilní.
 * Velké kusy pevniny jsou od sebe odděleny oceány.
 * Planeta nemá skoro žádný náklon rotační osy.
 * To způsobuje dokonalé podmínky pro spoustu typů fotosyntetických procesů.
 * @author Jakub Štych
 * @version 5.5.2023
 */
public class Tepid extends Wet {

    /**
     * <h2>Konstruktor vlažné planety</h2>
     */
    public Tepid() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Tepid");

        setHabitability(90);

        setSelectedPlanetaryFeature(PlanetaryFeature.OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.CRAGGY_MOUNTAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.WATERFALL);
        setSelectedPlanetaryFeature(PlanetaryFeature.LONG_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.LUSH_CAVE);
    }
}
