package universe.celestial_body.planets.terran;

/**
 * <h1>Toulavý svět</h1>
 * Kamenná zmrzlá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Tato toulavá planeta neobíhá kolem žádné hvězdy.
 * Dlouhou dobu cestují mezihvězdným prostorem.
 * Geotermální aktivita taktéž vytváří hustou atmosféru, která na planetě zanechává vyprodukované teplo.
 * Planeta stejného typu, která byla zachycena gravitační silou hvězdy se nazývá
 * {@link universe.celestial_body.planets.terran.habitable.special.Nomad nomádská planeta}
 * @author Jakub Štych
 * @version 15.5.2023
 */
public class Rogue extends Terran {

    /**
     * <h2>Konstruktor toulavého světa</h2>
     */
    public Rogue() {
        setType("Terran");
        setTerranPlanetType("Molten");
    }
}
