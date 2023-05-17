package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Úlová planeta</h1>
 * Planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Celá planeta je pokryta jedním velkým žijícím organismem.
 * Organismus je psionicky spojen s úlovou myslí, která ho vytvořila.
 * Na jakýkoliv život na planetě by zaútočil sám terén planety.
 * @author Jakub Štych
 * @version 11.5.2023
 */
public class Hive extends Special {

    /**
     * <h2>Konstruktor úlové planety</h2>
     */
    public Hive() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Hive");

        setHabitability(0);

        setSelectedPlanetaryFeature(PlanetaryFeature.GIANT_ORGANISM);
    }
}
