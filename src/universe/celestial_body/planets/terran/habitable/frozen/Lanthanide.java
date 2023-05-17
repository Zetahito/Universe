package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Lanthanoidská planeta</h1>
 * Hornatá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Sníh pokrývá vrcholky hor, které mají tvary kruhů.
 * Tyto nezvyklé hory byly vytvořeny díky velkému množství prvků kategorie lanthanoidů.
 * Magnetické pole planety je taktéž neobyčejně velké.
 * Planeta zažívá pouze minimální změny mezi ročními obdobími.
 * Kapalná voda na povrchu v podobě řek a jezer podporuje vznik a udržení života.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Lanthanide extends Frozen {

    /**
     * <h2>Konstruktor lanthanoidské planety</h2>
     */
    public Lanthanide() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Lanthanide");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.LONG_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.FROZEN_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.SNOW_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
        setSelectedPlanetaryFeature(PlanetaryFeature.RING_SHAPED_MOUNTAIN);
    }
}
