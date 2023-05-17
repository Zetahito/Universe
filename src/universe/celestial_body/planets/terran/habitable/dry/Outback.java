package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Vnitrozemní planeta</h1>
 * Horká kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Povrch planety je pokryt hlavně vyprahlou křovinnou vegetací a pouštěmi.
 * Místa kolem vodních ploch mají víc vegetace.
 * Hydrosféra je stístěná v pár vnitroplanetárních mořích a podzemních pramenech.
 * @author Jakub Štych
 * @version 24.4.2023
 */
public class Outback extends Dry {

    /**
     * <h2>Konstruktor vnitrozemní planety</h2>
     */
    public Outback() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Outback");

        setHabitability(60);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHRUBS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
    }
}
