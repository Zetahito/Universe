package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Mlhavá planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Hydrosféra je silná a stabilní.
 * Oceány pokrývají většinu povrchu planety.
 * Extrémní vlhkost způsobuje nikdy nekončící mlhu, která se line přes bujné lesy a pastviny.
 * @author Jakub Štych
 * @version 7.5.2023
 */
public class Fog extends Wet {

    /**
     * <h2>Konstruktor mlhavé planety</h2>
     */
    public Fog() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Fog");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.MIST);
        setSelectedPlanetaryFeature(PlanetaryFeature.LUSH_CAVE);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
    }
}
