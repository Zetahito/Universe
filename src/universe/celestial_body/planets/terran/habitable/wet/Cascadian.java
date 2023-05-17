package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Kaskádová planeta</h1>
 * Mírná hornatá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Povrch se skládá převážně z pobřežních lesů a velkých hor.
 * Je zde aktivní a stabilní hydrosféra.
 * Časté jsou výskyty bouřek.
 * Zimní období bývají dlouhá.
 * Naopak letní období jsou krátká a ne moc horká.
 * @author Jakub Štych
 * @version 6.5.2023
 */
public class Cascadian extends Wet {

    /**
     * <h2>Konstruktor kaskádové planety</h2>
     */
    public Cascadian() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Cascadian");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
    }
}
