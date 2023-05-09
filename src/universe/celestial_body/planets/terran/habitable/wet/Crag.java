package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta skalních útesů</h1>
 * Studená kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Je zde aktivní a stabilní hydrosféra.
 * Oceány a polární čepičky pokrývají 90% povrchu planety.
 * Rozptýlené skalnaté ostrovy ční kilometry nad hladinou oceánu.
 * Srážky i vulkanické aktivity jsou zde časté.
 * @author Jakub Štych
 * @version 7.5.2023
 */
public class Crag extends Wet {

    /**
     * <h2>Konstruktor planety skalních útesů</h2>
     */
    public Crag() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Crag");

        setHabitability(90);

        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.CRAGGY_MOUNTAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.VOLCANO);
        setSelectedPlanetaryFeature(PlanetaryFeature.MARINE_LIFE);
    }
}
