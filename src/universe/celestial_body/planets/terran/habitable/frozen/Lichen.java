package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Lišejníková planeta</h1>
 * Studená kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta má mimořádně vysokou stabilitu hydrosféry a obecně předvídatelné nízké teploty.
 * Celý povrch planety díky tomu tvoří lišejníky.
 * Lišejné lesy rostou mezi skalnatými pohořími a povrchovými ledovci.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Lichen extends Frozen {

    /**
     * <h2>Konstruktor kryoflórové planety</h2>
     */
    public Lichen() {
        setType("Terrestial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Lichen");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.LICHEN);
        setSelectedPlanetaryFeature(PlanetaryFeature.LICHEN_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.CRAGGY_MOUNTAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIER);
    }
}
