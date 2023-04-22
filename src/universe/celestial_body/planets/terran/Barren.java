package universe.celestial_body.planets.terran;

import universe.interfaces.Terraformable;

/**
 * <h1>Holý svět</h1>
 * Kamenná planeta se slabou nebo neexistující atmosférou.
 * Povrch je pokryt krátery po meteorech.
 * Nepodporuje vznik a udržení života.
 * Může ale být teraformována.
 * @author Jakub Štych
 * @version 19.4.2023
 */
public class Barren extends Terran implements Terraformable {

    /**
     * <h2>Konstruktor holého světa</h2>
     */
    Barren() {
        setType("Terran");
        setTerranPlanetType("Barren");
    }
}
