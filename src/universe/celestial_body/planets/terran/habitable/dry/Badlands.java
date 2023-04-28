package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Badlands</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Prachem pokrytý povrch se skládá převážné ze sedimentárních hornin a půdy bohaté na jíl.
 * Lze zde nalézt rokle i skalní věže.
 * Terén je převážně kopcovitý.
 * Povrch je značné zerodovaný kvůli větru a vodě.
 * Vegetace je minimální a vyskytují se zejména keře a pevné klasy trávy.
 * Půda je zemědělsky zcela nevyužitelná.
 * V terénu tohoto typu je snadné se ztratit.
 * Navigace je obtížná vzhledem k celkové podobnosti velkých rozloh badlands.
 * Absentní jsou i výraznější orientační body.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public class Badlands extends Dry {

    /**
     * <h2>Konstruktor badlands</h2>
     */
    Badlands() {
        setType("Terrestial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Badlands");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.BADLANDS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SEDIMENTARY_ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.CLAY_RICH_SOIL);
        setSelectedPlanetaryFeature(PlanetaryFeature.RAVINE);
        setSelectedPlanetaryFeature(PlanetaryFeature.PINNACLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHRUBS);
        setSelectedPlanetaryFeature(PlanetaryFeature.HARDY_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.CANYON);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
    }
}
