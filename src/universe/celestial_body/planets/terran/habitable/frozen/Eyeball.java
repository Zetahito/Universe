package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta oční bulvy</h1>
 * Kamenná zmrzlá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta je ve vázané rotaci, což znamená, že je ke hvězdě vždy otočená stejná strana planety.
 * Jedna strana planety má věčný den a druhá strana má věčnou noc.
 * Ke hvězdě je namířen rozmražený oceán, zatímco druhou polokouli tvoří převážně ledovce.
 * @author Jakub Štych
 * @version 11.5.2023
 */
public class Eyeball extends Frozen {

    /**
     * <h2>Konstruktor planety oční bulvy</h2>
     */
    public Eyeball() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setFrozenPlanetType("Eyeball");

        setHabitability(20);

        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIER);
        setSelectedPlanetaryFeature(PlanetaryFeature.COLD_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEEP_COLD_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
    }
}
