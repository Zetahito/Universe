package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Středozemní planeta</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Povrch planety tvoří spousty velkých mořích, které jsou obklopeny řídkou vegetací, převážně křovinami.
 * Vnitrozemí je pokryto hlavně vyprahlou pouští.
 * @author Jakub Štych
 * @version 25.4.2023
 */
public class Mediterranean extends Dry {

    /**
     * <h2>Konstruktor středozemní planety</h2>
     */
    Mediterranean() {
        setType("Terrestial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Mediterranean");

        setHabitability(80);

        setSelectedPlanetaryFeature(PlanetaryFeature.SHRUBS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
    }
}
