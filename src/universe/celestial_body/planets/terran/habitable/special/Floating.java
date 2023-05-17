package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Vznášející se planeta</h1>
 * Zvláštní planeta se vznášejícími se ostrovy a s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Vzdušné ostrovy stabilně drží svoji pozici ve vzduchu nad globálním oceánem.
 * Planetu obývá velké množství létajících živočichů a je zde hustá vegetace.
 * @author Jakub Štych
 * @version 16.5.2023
 */
public class Floating extends Special {

    /**
     * <h2>Konstruktor vznášející se planety</h2>
     */
    public Floating() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Floating");

        setHabitability(90);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.WATERFALL);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.CRAGGY_MOUNTAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.FLOATING_ISLAND);
    }
}
