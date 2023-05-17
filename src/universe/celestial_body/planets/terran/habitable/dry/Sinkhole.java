package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Závrtová planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Suché a vyprahlé pláně dominují povrchu této planety.
 * Povrch má pouze malou stabilní hydrosféru.
 * Pod povrchem se však nachází obrovský oceán vytvářející závrty na povrchu.
 * @author Jakub Štych
 * @version 27.4.2023
 */
public class Sinkhole extends Dry {

    /**
     * <h2>Konstruktor závrtové planety</h2>
     */
    public Sinkhole() {
        setType("Terrestrial");
        setHabitablePlanetType("Dry");
        setDryPlanetType("Sinkhole");

        setHabitability(90);

        setSelectedPlanetaryFeature(PlanetaryFeature.SINKHOLE);
        setSelectedPlanetaryFeature(PlanetaryFeature.ARID_PLAINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SUBTERRANEAN_OCEAN);
    }
}
