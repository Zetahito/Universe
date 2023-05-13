package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Bioluminescentní planeta</h1>
 * Tropická kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Netoxické exotické částice způsobují hustá mračna pokrývající celou planetu.
 * Teplo obstarává skleníkový efekt a geotermální aktivita.
 * Navzdory tomuto faktu planeta bují životem.
 * Téměř veškerá fauna a flóra produkuje vlastní bioluminescentní světlo.
 * Podle mnohých názorů se jedná o nejkrásnější typ planety.
 * @author Jakub Štych
 * @version 11.5.2023
 */
public class Bioluminescent extends Wet {

    /**
     * <h2>Konstruktor bioluminescentní planety</h2>
     */
    public Bioluminescent() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Bioluminescent");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.BIOLUMINESCENT_FLOWER);
        setSelectedPlanetaryFeature(PlanetaryFeature.BIOLUMINESCENT_TREE);
        setSelectedPlanetaryFeature(PlanetaryFeature.BIOLUMINESCENT_BUSH);
        setSelectedPlanetaryFeature(PlanetaryFeature.BIOLUMINESCENT_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.BIOLUMINESCENT_FUNGUS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.WATERFALL);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.STREAM);
    }
}
