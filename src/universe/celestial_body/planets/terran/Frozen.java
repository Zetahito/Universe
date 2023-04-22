package universe.celestial_body.planets.terran;

/**
 * <h1>Zmrzlý svět</h1>
 * Kamenná planeta pokrytá silnou vrstvou věčně zmrzlého ledu.
 * Extrémně nízké teploty a velmi slabá atmosféra znemožňuje existenci života na povrchu.
 * Může mít podpovrchový oceán.
 * @author Jakub Štych
 * @version 19.4.2023
 */
public class Frozen extends Terran {

    /**
     * <h2>Konstruktor zmrzlého světa</h2>
     */
    Frozen() {
        setType("Terran");
        setTerranPlanetType("Frozen");
    }
}
