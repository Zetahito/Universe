package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Souostrovní planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta má významnou hydrosféru.
 * Z globálního oceánu vystupují roztroušené shluky souostroví.
 * Na těchto ostrovech je bohatá vulkanická aktivity.
 * To způsobuje vysokou míru vzniku a zániku jednotlivých ostrovů.
 * Krajina se tedy neustále mění.
 * @author Jakub Štych
 * @version 3.5.2023
 */
public class Archipelago extends Wet {

    /**
     * <h2>Konstruktor souostrovní planety</h2>
     */
    public Archipelago() {
        setType("Terrestrial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Archipelago");

        setHabitability(85);

        setSelectedPlanetaryFeature(PlanetaryFeature.ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.VOLCANO);
        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
    }
}
