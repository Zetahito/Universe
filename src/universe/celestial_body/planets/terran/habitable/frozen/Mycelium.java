package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Podhoubní planeta</h1>
 * Studená kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Ekosystému této planety vládnou houby.
 * Většina povrchu planety je pokryta houbovými lesy a jeskyními systémy.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Mycelium extends Frozen {

    /**
     * <h2>Konstruktor podhoubní planety</h2>
     */
    public Mycelium() {
        setType("Terrestial");
        setHabitablePlanetType("Special");
        setFrozenPlanetType("Mycelium");

        setHabitability(60);

        setSelectedPlanetaryFeature(PlanetaryFeature.FUNGAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.MUSHROOM);
        setSelectedPlanetaryFeature(PlanetaryFeature.CAVE_SYSTEM);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
    }
}
