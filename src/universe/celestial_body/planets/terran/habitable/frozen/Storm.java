package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Bouřlivá planeta</h1>
 * Studená kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Většina pevné půdy se nachází v okolí obou pólů.
 * Póly odděluje jeden masivní oceán, který je zodpovědný za celoroční silné bouřky.
 * Ačkoliv je planeta technicky obyvatelná, na jejím povrchu přežijí pouze odolné rostliny a odolná zvířata.
 * Většina života na planetě je k nalezení pod hladinou oceánu.
 * Věčné bouře jsou spolehlivým zdrojem energie.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Storm extends Frozen {

    /**
     * <h2>Konstruktor bouřlivé planety</h2>
     */
    public Storm() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Storm");

        setHabitability(50);

        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_POLES);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEEP_COLD_OCEAN);
    }
}
