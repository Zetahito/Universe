package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Nomádská planeta</h1>
 * Kamenná zmrzlá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Tato toulavá planeta byla zachycena gravitační silou hvězdy.
 * Předtím cestovala dlouhou dobu v mezihvězdném prostoru.
 * Zdejší extrémní geotermální aktivity i tak umožnili zdejšímu primitivnímu životu se vyvinout.
 * Geotermální aktivita taktéž vytváří hustou atmosféru, která na planetě zanechává vyprodukované teplo.
 * Planeta stejného typu, která stále cestuje mezihvězdým prostorem se nazývá
 * {@link universe.celestial_body.planets.terran.Rogue toulavý svět}
 * @author Jakub Štych
 * @version 15.5.2023
 */
public class Nomad extends Special {

    /**
     * <h2>Konstruktor nomádské planety</h2>
     */
    public Nomad() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Nomad");

        setHabitability(5);

        setSelectedPlanetaryFeature(PlanetaryFeature.VOLCANO);
    }
}
