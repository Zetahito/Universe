package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Gaia planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta poskytuje ideální podmínky pro všechny známé formy života.
 * Některými kulturami bývají tyto planety považovány za posvátné.
 * @author Jakub Štych
 * @version 17.5.2023
 */
public class Gaia extends Special {

    /**
     * <h2>Konstruktor gaia planety</h2>
     */
    public Gaia() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Gaia");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.MESA);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.BEACH);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.BUSHES);
        setSelectedPlanetaryFeature(PlanetaryFeature.STREAM);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIER);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.SINKHOLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.COLD_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.WARM_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LONG_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.HOT_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.SNOW_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MILD_EQUATOR);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
        setSelectedPlanetaryFeature(PlanetaryFeature.OMNIPRESENT_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
    }
}
