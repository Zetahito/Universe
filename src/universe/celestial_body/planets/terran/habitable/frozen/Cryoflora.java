package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Kryoflórová planeta</h1>
 * Studená kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Teploty jsou zde hluboko pod bodem mrazu.
 * Navzdory tomu se zdejší fauna a flóra dokázali přizpůsobit zdejšímu drsnému prostředí.
 * Tvoří si vlastní protinámrazové bílkoviny.
 * Povrch planety je tak tvořen bujnou kryogenickou vegetací.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Cryoflora extends Frozen {

    /**
     * <h2>Konstruktor kryoflórové planety</h2>
     */
    public Cryoflora() {
        setType("Terrestial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Cryoflora");

        setHabitability(60);

        setSelectedPlanetaryFeature(PlanetaryFeature.CRYOFLORA);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.FROZEN_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
    }
}
