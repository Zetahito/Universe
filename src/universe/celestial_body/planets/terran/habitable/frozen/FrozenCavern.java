package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Zmrzlá jeskynní planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Slabá magnetosféra planety způsobuje, že většina povrchu je pokryta holými kameny.
 * Nicméně pod povrchem je nekonečný systém jeskyní se zmrzlou hydrosférou.
 * Hojné jsou zde lišejníky a mechy.
 * @author Jakub Štych
 * @version 9.5.2023
 */
public class FrozenCavern extends Frozen {

    /**
     * <h2>Konstruktor zmrzlé jeskynní planety</h2>
     */
    public FrozenCavern() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setFrozenPlanetType("Cavern");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.CAVE_SYSTEM);
        setSelectedPlanetaryFeature(PlanetaryFeature.HOLLOW_CAVERN);
        setSelectedPlanetaryFeature(PlanetaryFeature.FROZEN_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.LICHEN);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOSS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.NETHERWORLD);
    }
}
