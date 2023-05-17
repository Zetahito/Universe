package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Glaciální planeta</h1>
 * Mrazivá ledová planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Vodní zdroje jsou převážně zmrzlými ledovcovými ledy.
 * V letním období jsou významné oblevy.
 * Sníh je prakticky všudypřítomný.
 * Geotermální aktivita způsobuje permanentní díry v ledu a podporuje vznik podmořského života.
 * Celoročně jsou na planetě k vidění polární záře.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Glacial extends Frozen {

    /**
     * <h2>Konstruktor glaciální planety</h2>
     */
    public Glacial() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Glacial");

        setHabitability(45);

        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIER);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.SINKHOLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
    }
}
