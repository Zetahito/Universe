package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Korálová planeta</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Kdysi bývala oceánovou planetou.
 * Kvůli nízké magnetosféře a dalším ekologickým faktorům ztratila svojí hydrosféru.
 * Zbývající voda je bohatá na minerály a sůl.
 * Pro většinu tvorů je voda jedovatá.
 * Korály se ale přizpůsobily tomuto suchému světu.
 * Lesy korálů pokrývají velkou část planety.
 * @author Jakub Štych
 * @version 23.4.2023
 */
public class Coral extends Dry {

    /**
     * <h2>Konstruktor korálové planety</h2>
     */
    public Coral() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Coral");

        setHabitability(70);

        setSelectedPlanetaryFeature(PlanetaryFeature.LAGOON);
        setSelectedPlanetaryFeature(PlanetaryFeature.CORAL_FOREST);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHALLOW_WATER);
        setSelectedPlanetaryFeature(PlanetaryFeature.MINERAL_WATER);
    }
}
