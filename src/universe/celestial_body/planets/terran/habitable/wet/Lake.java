package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Jezerní planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Hydrosféra je extrémně aktivní a stabilní.
 * Povrch planety je pokryt miliony jezery různých velikostí.
 * Vodopády přenášejí vodu z jednoho jezera do druhého.
 * Klima se pohybuje od subtropického k subantarktickému.
 * @author Jakub Štych
 * @version 5.5.2023
 */
public class Lake extends Wet {

    /**
     * <h2>Konstruktor jezerové planety</h2>
     */
    public Lake() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Lake");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.MESA);
        setSelectedPlanetaryFeature(PlanetaryFeature.WARM_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.COLD_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.WATERFALL);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
    }
}
