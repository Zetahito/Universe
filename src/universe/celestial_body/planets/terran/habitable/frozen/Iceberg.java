package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Ledovcová planeta</h1>
 * Mrazivá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Teploty jsou zde hluboko pod bodem mrazu.
 * Navzdory tomu je zde kapalný, vysoce slaný oceán pokrývající celý povrch planety.
 * Když se voda oddělí od soli, vznikají polopermanentní ledovce.
 * Kvetou zde především kolonie slanovodních chaluh.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Iceberg extends Frozen {

    /**
     * <h2>Konstruktor ledovcové planety</h2>
     */
    public Iceberg() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Iceberg");

        setHabitability(65);

        setSelectedPlanetaryFeature(PlanetaryFeature.KELP);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.DEEP_COLD_OCEAN);
    }
}
