package universe.celestial_body.planets.terran;

/**
 * <h1>Subglaciální svět</h1>
 * Kamenná planeta pokrytá silnou vrstvou věčně zmrzlého ledu.
 * Nízké teploty a tenká atmosféra znemožňují přítomnost života na planetě.
 * Pod vrstvou ledu se nachází podpovrchový oceán, který je udržován teplem z geotermálních aktivit planety.
 * V tomto oceánu teoreticky život může existovat.
 * @author Jakub Štych
 * @version 13.5.2023
 */
public class Subglacial extends Terran {

    /**
     * <h2>Konstruktor subglaciálního světa</h2>
     */
    public Subglacial() {
        setType("Terran");
        setTerranPlanetType("Subglacial");
    }
}
