package universe.celestial_body.galaxies;

/**
 * <h1>Nepravidelná galaxie</h1>
 * Má chaotická vzhled.
 * Tvoří 25% veškerých galaxií ve vesmíru.
 * Deformace je způsobena gravitačním působením.
 * @author Jakub Štych
 * @version 7.4.2023
 */
public class Irregular extends Galaxy {

    /**
     * <h2>Konstruktor nepravidelné galaxie</h2>
     */
    public Irregular() {
        setType("Irregular");
        setFormed(true);
    }
}
