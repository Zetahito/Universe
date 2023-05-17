package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Močálová planeta</h1>
 * Vlhká a mokrá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Většina povrchu planety je pokryta hustými zalesněnými mokřady.
 * Pouze malé množství povrchu není pod mělkou vodou.
 * Hydrosféra je silná a stabilní.
 * Skládá se převážně z mělkých moří, bažin a mokřad.
 * Srážky jsou zde časté a planeta překypuje životem.
 * @author Jakub Štych
 * @version 7.5.2023
 */
public class Swamp extends Wet {

    /**
     * <h2>Konstruktor močálové planety</h2>
     */
    public Swamp() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Swamp");

        setHabitability(80);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.BOG);
        setSelectedPlanetaryFeature(PlanetaryFeature.SWAMP);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHALLOW_WATER);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
    }
}
