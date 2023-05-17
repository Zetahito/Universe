package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Krystalická planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Obrovská naleziště krystalů lze nalézt na celém povrchu planety, zvláště pak v tropických pásmech.
 * Zvířecí i rostlinný život bují napříč celou planetou.
 * @author Jakub Štych
 * @version 16.5.2023
 */
public class Crystal extends Special {

    /**
     * <h2>Konstruktor krystalické planety</h2>
     */
    public Crystal() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Crystal");

        setHabitability(95);

        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.MIXED_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.SMALL_CRYSTAL);
        setSelectedPlanetaryFeature(PlanetaryFeature.LARGE_CRYSTAL);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
    }
}
