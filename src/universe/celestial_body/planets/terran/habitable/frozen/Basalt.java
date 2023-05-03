package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Bazaltová planeta</h1>
 * Studená kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Kvůli vulkanické minulosti je převážně rovinatý povrch planety pokryt bazaltem.
 * Stabilní hydrosféra se skládá převážně z mechů a lišejníků, které rostou na zchladlých bazaltech.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Basalt extends Frozen {

    /**
     * <h2>Konstruktor bazaltové planety</h2>
     */
    public Basalt() {
        setType("Terrestial");
        setHabitablePlanetType("Special");
        setFrozenPlanetType("Basalt");

        setHabitability(85);

        setSelectedPlanetaryFeature(PlanetaryFeature.EXTINCT_VOLCANO);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.PLATEAU);
        setSelectedPlanetaryFeature(PlanetaryFeature.LOWLANDS);
        setSelectedPlanetaryFeature(PlanetaryFeature.BASALT_MOUNTAIN);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOSS);
        setSelectedPlanetaryFeature(PlanetaryFeature.LICHEN);
    }
}
