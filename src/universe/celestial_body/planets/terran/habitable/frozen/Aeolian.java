package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Větrná planeta</h1>
 * Mrazivá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Větry běžně dosahují rychlostí přes 300 km za hodinu.
 * Tyto extrémní proudy vyhloubily duté závrty a prolákliny.
 * Zde může život bezpečně existovat a je chránět před nemilosrdným počasím.
 * @author Jakub Štych
 * @version 29.4.2023
 */
public class Aeolian extends Frozen {

    /**
     * <h2>Konstruktor větrné planety</h2>
     */
    public Aeolian() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Aeolian");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SINKHOLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEPRESSION);
        setSelectedPlanetaryFeature(PlanetaryFeature.FRIGID_LAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.HOLLOW_CAVERN);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
    }
}
