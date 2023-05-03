package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Ekumenopolis</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Celý povrch planety je pokrytý souvislou městskou zástavbou.
 * Jakákoliv fauna i flóra je nenávratně zničená.
 * Kvůli absenci rostlin musí mít planeta vlastní filtraci vzduchu.
 * Kvůli absenci hydrosféry musí mít planeta i vlastní zavlažovací systém.
 * Planeta je závislá na importu z jiných planet.
 * Ze všech planet nabízí největší prostor pro obyvatele.
 * Z toho důvodu mívají tyto planety největší množstvím obyvatel.
 * Mají vysokou energetickou náročnost a je nutné je draze udržovat.
 * @see Relic Opuštěná ekumenopole
 * @author Jakub Štych
 * @version 22.4.2023
 */
public class Ecumenopolis extends Special {

    /**
     * <h2>Konstruktor ekumenopole</h2>
     */
    public Ecumenopolis() {
        setType("Terrestial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Ecumenopolis");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.PLANET_WIDE_CITY);
    }
}
