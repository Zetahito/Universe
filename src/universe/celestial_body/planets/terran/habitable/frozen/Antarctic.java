package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Antarktická planeta</h1>
 * Mrazivá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Hydrosféra je převážně zamrzlá.
 * Diamantový prach je zde stejně běžný jako sníh.
 * Vítr může dosahovat rychlosti až 250 km za hodinu v zimním období.
 * Život je k nalezení v izolovaných kapsách pod ledem v mořích, jeskyních a chráněných údolích.
 * @author Jakub Štych
 * @version 1.5.2023
 */
public class Antarctic extends Frozen {

    /**
     * <h2>Konstruktor antarktické planety</h2>
     */
    public Antarctic() {
        setType("Terrestial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Antarctic");

        setHabitability(45);

        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.FRIGID_LAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.FROZEN_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.DIAMOND_DUST);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
        setSelectedPlanetaryFeature(PlanetaryFeature.SINKHOLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEPRESSION);
        setSelectedPlanetaryFeature(PlanetaryFeature.VALLEY);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEEP_COLD_OCEAN);
    }
}
