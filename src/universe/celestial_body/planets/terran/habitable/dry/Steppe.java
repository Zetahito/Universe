package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Stepní planeta</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Polovyprahlé trávy spolu s kopci a planinami dominují povrchu.
 * Ačkoliv na planetě nerostou téměř žádné stromy, srážky podporují růst křovin a trav.
 * @author Jakub Štych
 * @version 28.4.2023
 */
public class Steppe extends Dry {

    /**
     * <h2>Konstruktor stepní planety</h2>
     */
    Steppe() {
        setType("Terrestial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Steppe");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLANES);
        setSelectedPlanetaryFeature(PlanetaryFeature.HILL);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHRUBS);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
    }
}
