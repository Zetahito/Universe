package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Pobřežní planeta</h1>
 * Suchá subtropická planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Nachází se zde hluboké ledové oceány.
 * Jejich proudy způsobují vysokou stabilitu atmosféry.
 * Srážky jsou na pevnině vzácné, ale mlhy zajišťují dostatečnou vlhkost půdy.
 * Vyskytuje se zde široká škála druhů lišejníků, sukulentů a keřů.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public class Coastal extends Dry {

    /**
     * <h2>Konstruktor pobřežní planety</h2>
     */
    Coastal() {
        setType("Terrestial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Coastal");

        setHabitability(93);

        setSelectedPlanetaryFeature(PlanetaryFeature.DEEP_COLD_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.BEACH);
        setSelectedPlanetaryFeature(PlanetaryFeature.LICHEN);
        setSelectedPlanetaryFeature(PlanetaryFeature.SUCCULENT);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHRUBS);
    }
}
