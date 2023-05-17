package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Vodonosná planeta</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * I přes vzácné srážky má planeta bohatou hydrosféru pod povrchem a v lagunách na povrchu.
 * Život se drží v okolí těchto lagun a podzemních řek.
 * Zbytek planety pokrývá suchý a horký písek.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public class Aquifer extends Dry {

    /**
     * <h2>Konstruktor vodonosné planety</h2>
     */
    public Aquifer() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Aquifer");

        setHabitability(90);

        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.IRRIGATION_SYSTEM);
        setSelectedPlanetaryFeature(PlanetaryFeature.UNDERGROUND_RIVER);
    }

}
