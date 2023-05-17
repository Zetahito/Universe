package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Dunová planeta</h1>
 * Horká kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Rozsáhlé písečné duny pokrývají většinu povrchu planety.
 * Hydrosféra se skládá hlavně z podzemních vod, které vyvěrají jako horské prameny.
 * Život se vyskytuje převážně v okolí oáz.
 * @author Jakub Štych
 * @version 24.4.2023
 */
public class Dune extends Dry {

    /**
     * <h2>Konstruktor dunové planety</h2>
     */
    public Dune() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Dune");

        setHabitability(55);

        setSelectedPlanetaryFeature(PlanetaryFeature.DUNES);
        setSelectedPlanetaryFeature(PlanetaryFeature.OASIS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SAND_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.MOUNTAIN_SPRING);
        setSelectedPlanetaryFeature(PlanetaryFeature.UNDERGROUND_RIVER);
    }
}
