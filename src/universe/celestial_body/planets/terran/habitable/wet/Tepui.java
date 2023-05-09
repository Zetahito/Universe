package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Tepuiská planeta</h1>
 * Hornatá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta má významnou hydrosféru a je pokrytá hustou vegetací.
 * Povrch tvoří chladné a deštivé náhorní plošiny tepuií.
 * Pod těmito náhorními plošinami se rozprostírají teplé a vlhké džungle.
 * @author Jakub Štych
 * @version 8.5.2023
 */
public class Tepui extends Wet {

    /**
     * <h2>Konstruktor tepuiské planety</h2>
     */
    public Tepui() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Tepui");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.MESA);
        setSelectedPlanetaryFeature(PlanetaryFeature.JUNGLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.WATERFALL);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
    }
}
