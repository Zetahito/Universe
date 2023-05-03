package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Bažinatá planeta</h1>
 * Studená blátivá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Roční období se od sebe příliš neliší.
 * Celoročně je zde pozoruhodné množství srážek.
 * Na rozdíl od {@link Mud blátivé planety} nejsou tak hojné geotermální aktivity.
 * Většina povrchu planety je pokryta hustou vegetací.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Bog extends Frozen {

    /**
     * <h2>Konstruktor bažinaté planety</h2>
     */
    public Bog() {
        setType("Terrestial");
        setHabitablePlanetType("Special");
        setFrozenPlanetType("Bog");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.BOG);
        setSelectedPlanetaryFeature(PlanetaryFeature.SNOW_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);

    }
}
