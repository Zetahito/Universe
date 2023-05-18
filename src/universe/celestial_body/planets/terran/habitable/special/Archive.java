package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Archivová planeta</h1>
 * Železná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Celý povrch byl přebudován na velký superpočítač.
 * Vznášející se chladiče tvoří aktivní chlazení, zatímco umělý oceán tvoří pasivní chlazení.
 * Umělá tráva místo fotosyntézi sbírá energii z hvězdy a funguje jako zdroj napájení.
 * Jsou zde k nalezení rozsáhlé hory počítačové paměti.
 * Planeta je zázrakem inženýrství.
 * @author Jakub Štych
 * @version 17.5.2023
 */
public class Archive extends Special {

    /**
     * <h2>Konstruktor archivové planety</h2>
     */
    public Archive() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Archive");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.ARTIFICIAL_OCEAN);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARTIFICIAL_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.FLOATING_HEAT_SINK);
        setSelectedPlanetaryFeature(PlanetaryFeature.RANDOM_ACCESS_MEMORY_MOUNTAIN);
    }
}
