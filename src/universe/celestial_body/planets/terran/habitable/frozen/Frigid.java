package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Mrazivá planeta</h1>
 * Mrazivá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Srážky jsou zde nízké a velké vodní plochy na povrchu planety jsou vzácné.
 * Teploty jsou celoročně hluboko pod bodem mrazu.
 * Mračna v atmosféře propouštějí jen málo svitu hvězdy.
 * Je zde věčné šero.
 * Ačkoliv je technicky obyvatelná, není domovem žádného přirozeného života.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Frigid extends Frozen {

    /**
     * <h2>Konstruktor mrazivé planety</h2>
     */
    public Frigid() {
        setType("Terrestrial");
        setHabitablePlanetType("Frozen");
        setFrozenPlanetType("Frigid");

        setHabitability(25);

        setSelectedPlanetaryFeature(PlanetaryFeature.PERMAFROST);
        setSelectedPlanetaryFeature(PlanetaryFeature.FRIGID_LAND);
        setSelectedPlanetaryFeature(PlanetaryFeature.FROZEN_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.PERMANENTLY_FROZEN_PLAINS);
    }
}
