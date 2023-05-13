package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta s odhaleným jádrem</h1>
 * Kamenná planeta, která byla zbavena planetární kůry.
 * Průmysl zanechal jádro planety velice aktivní.
 * Je zde vysoká geotermální aktivita.
 * Jakákoliv biosféra, která kdy existovala na této planetě, byla nenávratně zničena.
 * @author Jakub Štych
 * @version 10.5.2023
 */
public class CoreTap extends Special {

    /**
     * <h2>Konstruktor planety s odhaleným jádrem</h2>
     */
    public CoreTap() {
        setType("Terrestial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Core Tap");

        setHabitability(25);

        setSelectedPlanetaryFeature(PlanetaryFeature.INDUSTRIAL_WASTELAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.MINE);
    }
}
