package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta povrchového dolu</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Původní povrch se skládal převážně z travnatých vyprahlých rovin.
 * Většina povrchu planety byla systematicky vytěžena kvůli nalezištím vzácných minerálů.
 * @author Jakub Štych
 * @version 16.5.2023
 */
public class Stripmine extends Special {

    /**
     * <h2>Konstruktor planety povrchového dolu</h2>
     */
    public Stripmine() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Stripmine");

        setHabitability(40);

        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEPRESSION);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.STRIPPED_GROUND);
    }
}
