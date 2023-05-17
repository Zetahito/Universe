package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Vysokohorská planeta</h1>
 * Hornatá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Špičky hor pokrývá vrstva věčného sněhu.
 * Pod nimi se nachází zamrzlá jezera v údolích.
 * Planeta má pouze minimální rozdíly mezi ročními obdobími.
 * Kapalná voda pod silnou vrstvou ledu dokáže podporovat život.
 * @author Jakub Štych
 * @version 1.5.2023
 */
public class Alpine extends Frozen {

    /**
     * <h2>Konstruktor vysokohorské planety</h2>
     */
    public Alpine() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Alpine");

        setHabitability(60);

        setSelectedPlanetaryFeature(PlanetaryFeature.VALLEY);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.COLD_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.FROZEN_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.FRIGID_LAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.UNDERGROUND_SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEEP_COLD_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
        setSelectedPlanetaryFeature(PlanetaryFeature.UNDERGROUND_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
    }
}
