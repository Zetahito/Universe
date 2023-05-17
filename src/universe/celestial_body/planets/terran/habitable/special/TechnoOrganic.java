package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Techno-organická planeta</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Je zde vysoce sofistikovaný zavlažovací systém.
 * Planeta má díky tomu stabilní hydrosféru.
 * Většina fauny a flóry není organická.
 * Místo toho jsou zde hojní roboti jejichž stvořitel je neznámý.
 * Rodí se v takzvaných kaldronech a udržují stabilní ekosféru.
 * Ačkoliv je planeta dokonalá k životu, není jasné jak tento umělý ekosystém reaguje na skutečně živou hmotu.
 * @author Jakub Štych
 * @version 17.5.2023
 */
public class TechnoOrganic extends Special {

    /**
     * <h2>Konstruktor techno-organické planety</h2>
     */
    public TechnoOrganic() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Techno-Organic");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.SYNTHETIC_TREE);
        setSelectedPlanetaryFeature(PlanetaryFeature.SYNTHETIC_GRASS);
        setSelectedPlanetaryFeature(PlanetaryFeature.SYNTHETIC_PLANT);
        setSelectedPlanetaryFeature(PlanetaryFeature.IRRIGATION_SYSTEM);
    }
}
