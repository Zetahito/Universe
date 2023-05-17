package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Geotermální planeta</h1>
 * Studená ledová planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Tropické trhliny obklopují věčný led.
 * Tyto průrvy jsou zahřívány přírodními geotermálními průduchy.
 * Z průduch neustále stoupá dým a způsobuje tání ledovců.
 * @author Jakub Štych
 * @version 9.5.2023
 */
public class Geothermal extends Frozen {

    /**
     * <h2>Konstruktor geotermální planety</h2>
     */
    public Geothermal() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setFrozenPlanetType("Cascadian");

        setHabitability(60);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.ICEBERG);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIER);
        setSelectedPlanetaryFeature(PlanetaryFeature.HOT_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLACIAL_ICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.MILD_EQUATOR);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.TROPICAL_ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.EVERLASTING_SNOW);
    }
}
