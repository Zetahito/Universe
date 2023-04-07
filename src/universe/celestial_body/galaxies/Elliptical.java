package universe.celestial_body.galaxies;

/**
 * <h1>Eliptická galaxie</h1>
 * Hvězdy jsou symetricky rozloženy.
 * Hustota hvězdných systémů rovnoměrně ubývá od středu galaxie k okraji.
 * V závislosti na tvaru se označují E0 (kruh) až E7 (elipsa).
 * Prastaré hvězdy zde již pohltili veškerý mezihvězdný prach a plyn.
 * Kvůli tomu zde nemohou vznikat nové hvězdy.
 * @author Jakub Štych
 * @version 7.4.2023
 */
public class Elliptical extends Galaxy {

    /**
     * <h2>Konstruktor eliptické galaxie</h2>
     */
    public Elliptical() {
        setType("Elliptical");
    }
}
