package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Zničená planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Probíhá zde jaderná zima.
 * V atmosféře se nachází husté vrstvy sazí aerosolů.
 * Povrch planety je pokryt ruinami staveb.
 * Všudypřítomná radiace znemožňuje žít na povrchu planety.
 * @author Jakub Štych
 * @version 10.5.2023
 */
public class Tomb extends Special {

    /**
     * <h2>Konstruktor zničené planety</h2>
     */
    public Tomb() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Tomb");

        setHabitability(0);

        setSelectedPlanetaryFeature(PlanetaryFeature.TOMB);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.INDUSTRIAL_WASTELAND);
    }
}
