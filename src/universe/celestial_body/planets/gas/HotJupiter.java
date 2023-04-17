package universe.celestial_body.planets.gas;

/**
 * <h1>Horký jupiter</h1>
 * Má hmotnost podobnou nebo vyšší než planeta Jupiter.
 * Obíhá mateřskou hvězdu v extrémně krátké vzdálenosti cca 0.05 AU.
 * @author Jakub Štych
 * @version 17.4.2023
 */
public class HotJupiter extends Gas {

    /**
     * <h2>Konstruktor horkého Jupitera</h2>
     */
    HotJupiter() {
        setType("Gas");
        setGasPlanetType("Hot Jupiter");
    }
}
