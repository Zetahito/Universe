package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Retinaldehydová planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Hydrosféra je aktivní a stabilní.
 * Kusy pevniny jsou od sebe odděleny oceány.
 * Rostlinstvo je na bázi retinaldehydu namísto chlorofylu.
 * To dává planetě osobitý fialový vzhled.
 * @author Jakub Štych
 * @version 5.5.2023
 */
public class Retinal extends Wet {

    /**
     * <h2>Konstruktor retinaldehydové planety</h2>
     */
    public Retinal() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Retinal");

        setHabitability(80);

        setSelectedPlanetaryFeature(PlanetaryFeature.RETINAL_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.RETINAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.CRAGGY_MOUNTAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.LOWLANDS);
        setSelectedPlanetaryFeature(PlanetaryFeature.OCEAN);
    }
}
