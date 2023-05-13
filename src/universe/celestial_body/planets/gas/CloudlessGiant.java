package universe.celestial_body.planets.gas;

/**
 * <h1>Bezmračný plynný obr</h1>
 * Plynná planeta bez jakýkoliv mračen.
 * V atmosféře chybí prvky, které by mraky mohly vytvářet.
 * @author Jakub Štych
 * @version 11.5.2023
 */
public class CloudlessGiant extends Gas {

    /**
     * <h2>Konstruktor bezmračného plynného obra</h2>
     */
    public CloudlessGiant() {
        setType("Gas");
        setGasPlanetType("Cloudless Giant");
    }
}
