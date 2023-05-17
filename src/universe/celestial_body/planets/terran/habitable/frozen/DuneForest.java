package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta dunových lesů</h1>
 * Studená hornatá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Kvůli velkému množství mlh a nízkým srážkám je většina nížin pokrytá suchými dunami.
 * Hory jsou zalesněné a jejich vrcholky zdobí věčný sníh.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class DuneForest extends Frozen {

    /**
     * <h2>Konstruktor planety dunových lesů</h2>
     */
    public DuneForest() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Dune Forest");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.DUST);
        setSelectedPlanetaryFeature(PlanetaryFeature.DUNES);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.SNOW_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
    }
}
