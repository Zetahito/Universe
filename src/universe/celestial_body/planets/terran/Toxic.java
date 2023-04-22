package universe.celestial_body.planets.terran;

import universe.interfaces.Terraformable;

/**
 * <h1>Toxický svět</h1>
 * Kamenná planeta se silnou vrstvou atmosféry, která je smrtelná pro všechny známé formy života.
 * Může ale být teraformána.
 * @author Jakub Štych
 * @version 19.4.2023
 */
public class Toxic extends Terran implements Terraformable {

    /**
     * <h2>Konstruktor toxického světa</h2>
     */
    Toxic() {
        setType("Terran");
        setTerranPlanetType("Toxic");
    }
}
