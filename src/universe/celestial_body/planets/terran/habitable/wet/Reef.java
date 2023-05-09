package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Útesová planeta</h1>
 * Kamenná mírná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta má významnou hydrosféru.
 * Mělké oceány pokrývají více než 90% povrchu planety.
 * I z orbitu lze sledovat rozsáhlé útesy pod vodní hladinou.
 * Některé útesy ční nad hladinou a tvoří tak souostroví.
 * Tyto ostrovy podporují vznik korálů.
 * @author Jakub Štych
 * @version 3.5.2023
 */
public class Reef extends Wet {

    /**
     * <h2>Konstruktor útesové planety</h2>
     */
    public Reef() {
        setType("Terrestial");
        setHabitablePlanetType("Wet");
        setWetPlanetType("Reef");

        setHabitability(80);

        setSelectedPlanetaryFeature(PlanetaryFeature.GLOBAL_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.CORAL_REEF);
        setSelectedPlanetaryFeature(PlanetaryFeature.CORAL_ISLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.CORAL);
        setSelectedPlanetaryFeature(PlanetaryFeature.ISLAND);
    }
}
