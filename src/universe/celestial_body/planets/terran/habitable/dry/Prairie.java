package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Prériová planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Povrch tvoří jeden velký kus pevniny se spoustou vnitrozemských mořích.
 * Suchá léta jsou zde v kontrastu s drsnými zimami.
 * @author Jakub Štych
 * @version 25.4.2023
 */
public class Prairie extends Dry {

    /**
     * <h2>Konstruktor prériové planety</h2>
     */
    public Prairie() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Prairie");

        setHabitability(75);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCKS);
        setSelectedPlanetaryFeature(PlanetaryFeature.RAVINE);
        setSelectedPlanetaryFeature(PlanetaryFeature.STEPPES);
        setSelectedPlanetaryFeature(PlanetaryFeature.PRAIRIE);
        setSelectedPlanetaryFeature(PlanetaryFeature.LOWLAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.LONG_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);

    }
}
