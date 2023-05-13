package universe.celestial_body.planets.terran;

/**
 * <h1>Sopečný svět</h1>
 * Kamenná planeta pokrytá velkým množstvím sopek.
 * Atmosféra je tenká, popřípadě neexistující.
 * Vysoká geologická aktivita z vnitra planety způsobuje neustálé erupce.
 * Tento typ planety neumožňuje udržení života.
 * Chuchvalce síry mohou dosahovat výšky až 500 km nad povrchem planety.
 * @author Jakub Štych
 * @version 12.5.2023
 */
public class Volcanic extends Terran {

    /**
     * <h2>Konstruktor sopečného světa</h2>
     */
    public Volcanic() {
        setType("Terran");
        setTerranPlanetType("Volcanic");
    }
}
