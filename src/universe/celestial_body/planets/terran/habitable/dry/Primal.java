package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Mladá planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Vulkanická aktivita tohoto mladého světa zpomalila.
 * Díky tomu se zde začala rozšiřovat fauna a flora.
 * Atmosféra i hydrosféra se již stabilizovala.
 * Planeta se vyvinula z {@link universe.celestial_body.planets.terran.habitable.special.Ash popelavé planety}
 * @author Jakub Štych
 * @version 26.4.2023
 */
public class Primal extends Dry {

    /**
     * <h2>Konstruktor mladé planety</h2>
     */
    public Primal() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Primal");

        setHabitability(60);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.VALLEY);
        setSelectedPlanetaryFeature(PlanetaryFeature.VOLCANO);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAVA_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAVA_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
    }
}
