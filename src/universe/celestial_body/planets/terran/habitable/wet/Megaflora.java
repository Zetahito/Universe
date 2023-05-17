package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta megaflóry</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta je hustě zalesněná se silnou a zdravou hydrosférou.
 * Je domovem velkého stromového ekosystému, známého jako megaflora.
 * Tento ekosystém pokrývá většinu povrchu planety.
 * @author Jakub Štych
 * @version 8.5.2023
 */
public class Megaflora extends Wet {

    /**
     * <h2>Konstruktor planety megaflory</h2>
     */
    public Megaflora() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Megaflora");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.BUSHES);
        setSelectedPlanetaryFeature(PlanetaryFeature.MEADOW);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOTHER_TREE);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLANET_WIDE_FLORA);
    }
}
