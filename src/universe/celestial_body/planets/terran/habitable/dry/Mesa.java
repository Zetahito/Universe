package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Planeta stolových hor</h1>
 * Horká, suchá a kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Velké náhorní plošiny a stolové hory jsou běžné kolem rovníku planety.
 * Polární regiony jsou chladnější a zalesněné.
 * Skrz kaňony hučí velké řeky.
 * Kolem jejich koryt rozkvétá říční vegetace.
 * @author Jakub Štych
 * @version 25.4.2023
 */
public class Mesa extends Dry {

    /**
     * <h2>Konstruktor planety stolových hor</h2>
     */
    public Mesa() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Mesa");

        setHabitability(65);

        setSelectedPlanetaryFeature(PlanetaryFeature.MESA);
        setSelectedPlanetaryFeature(PlanetaryFeature.CANYON);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVERBED);
        setSelectedPlanetaryFeature(PlanetaryFeature.LONG_RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.SNOW_FOREST);
    }
}
