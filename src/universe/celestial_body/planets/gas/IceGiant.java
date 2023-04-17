package universe.celestial_body.planets.gas;

/**
 * <h1>Ledový obr</h1>
 * Chladnější než ostatní plynní obři.
 * Výrazněji v nich převažuje methan, čpavek a voda.
 * Vodík a hélium netvoří dominantní prvky.
 * Většina hmoty je ve formě plynu, popřípadě plynu stlačeného do kapalného skupenství.
 * @author Jakub Štych
 * @version 17.4.2023
 */
public class IceGiant extends Gas {

    /**
     * <h2>Konstruktor ledového obra</h2>
     */
    IceGiant() {
        setType("Gas");
        setGasPlanetType("Ice Giant");
    }

}
