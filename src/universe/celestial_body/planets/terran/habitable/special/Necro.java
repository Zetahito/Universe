package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Mrtvá planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a z malého množství kyslíku.
 * Celý povrch planety je pokrytý hrobkami a sarkofágy.
 * Kromě ostatních posmrtných struktur je planeta holá pustina.
 * Kvůli nedostatku kyslíku v atmosféře nebývá planeta trvale obývána a ani zde není žádný jiný život.
 * Zároveň tento nedostatek kyslíku zpomaluje rozklad mrtvých těl.
 * Kolem rovníku planety se nachází konstrukce Bábuškového mozku
 * Slouží jako záložní paměť pro megastrukturu kolem hvězdy.
 * @author Jakub Štych
 * @version 10.5.2023
 */
public class Necro extends Special {

    /**
     * <h2>Konstruktor mrtvé planety</h2>
     */
    public Necro() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Necro");

        setHabitability(0);

        setSelectedPlanetaryFeature(PlanetaryFeature.TOMB);
        setSelectedPlanetaryFeature(PlanetaryFeature.RIVER);
        setSelectedPlanetaryFeature(PlanetaryFeature.CEMENTARY);
        setSelectedPlanetaryFeature(PlanetaryFeature.ROCK_DESERT);
        setSelectedPlanetaryFeature(PlanetaryFeature.SARCOPHAGUS);
    }
}
