package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta ve vázané rotaci</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta je ve vázané rotaci, což znamená, že je ke hvězdě vždy otočená stejná strana planety.
 * Jedna strana planety má věčný den a druhá strana má věčnou noc.
 * Na hranici obou polokoulí je úzký pruh, kde může život existovat.
 * @author Jakub Štych
 * @version 11.5.2023
 */
public class TidallyLocked extends Special {

    /**
     * <h2>Konstruktor planety ve vázané rotaci</h2>
     */
    public TidallyLocked() {
        setType("Terrestial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Tidally Locked");

        setHabitability(50);

        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.OASIS);
        setSelectedPlanetaryFeature(PlanetaryFeature.WARM_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.MEADOW);
        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.CRAGGY_MOUNTAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.STREAM);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.WATERFALL);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.FROZEN_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.SNOW_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIER);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
    }
}
