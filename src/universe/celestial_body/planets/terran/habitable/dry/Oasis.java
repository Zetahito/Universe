package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Oázová planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Hydrosféra podporuje pouze jednu velkou vodní plochu.
 * Kolem této plochy se nachází rozmanitá vegetace.
 * Srážky se málokdy dostanou do okolní pouště, která pokrývá zbytek planety.
 * @author Jakub Štych
 * @version 24.4.2023
 */
public class Oasis extends Dry {

    public Oasis() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Oasis");

        setHabitability(65);

        setSelectedPlanetaryFeature(PlanetaryFeature.OASIS);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
    }
}
