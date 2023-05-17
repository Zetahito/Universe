package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Slaná planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Minerály pokrytý povrch se skládá hlavně ze slaných rovin, rozsáhlých hor a velkých formací krystalů.
 * I přes dýchatelnou atmosféru a vodní plochy není na planetě skoro žádný život.
 * @author Jakub Štych
 * @version 26.4.2023
 */
public class Salt extends Dry {

    /**
     * <h2>Konstruktor slané planety</h2>
     */
    public Salt() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Salt");

        setHabitability(35);

        setSelectedPlanetaryFeature(PlanetaryFeature.SEA);
        setSelectedPlanetaryFeature(PlanetaryFeature.LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.SALT_FLAT);
        setSelectedPlanetaryFeature(PlanetaryFeature.LARGE_CRYSTAL);
        setSelectedPlanetaryFeature(PlanetaryFeature.SMALL_CRYSTAL);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
    }
}
