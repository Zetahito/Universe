package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Reliktní planeta</h1>
 * Suchá kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Celý povrch planety byl kdysi pokrytý souvislou městskou zástavbou.
 * Planeta se dříve nazývala {@link Ecumenopolis Ekumenopolis}.
 * Jakákoliv fauna i flóra byla nenávratně zničená.
 * Kvůli absenci rostlin musela mít planeta vlastní filtraci vzduchu.
 * Kvůli absenci hydrosféry musela mít planeta i vlastní zavlažovací systém.
 * Planeta byla závislá na importu z jiných planet.
 * Měla vysokou energetickou náročnost a bylo nutné je draze udržovat.
 * Civilizace ale tuto planetu opustila a planetární město tak začalo chátrat.
 * K vidění jsou rozsáhlé ruiny kdysi honosných čtvrtí.
 * Spadlé věže, které během své slávy byli nejvyššími stavbami na planetě.
 * Nekontrolovatelná atmosféra svými srážkami zcela zahlnila kanalizační systém.
 * Voda je tak přítomná i na povrchu planety.
 * Zvětrávání dál vede k celkovému úpadku planety.
 * Pokud by měla být někdy zrestaurována, byl by to jistě nejdražší projekt v celé galaxii.
 * @author Jakub Štych
 * @version 17.5.2023
 */
public class Relic extends Special {

    /**
     * <h2>Konstruktor reliktní planety</h2>
     */
    public Relic() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Relic");

        setHabitability(80);

        setSelectedPlanetaryFeature(PlanetaryFeature.RUINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.DENSE_RUINS);
        setSelectedPlanetaryFeature(PlanetaryFeature.RUINED_CITY);
        setSelectedPlanetaryFeature(PlanetaryFeature.FLOODED_CITY);
        setSelectedPlanetaryFeature(PlanetaryFeature.COLLAPSED_SPIRE);
        setSelectedPlanetaryFeature(PlanetaryFeature.MASSIVE_CREVICE);
        setSelectedPlanetaryFeature(PlanetaryFeature.SHATTERED_SOLAR_PANEL);
        setSelectedPlanetaryFeature(PlanetaryFeature.CRUMBLING_RESEARCH_DISTRICT);
    }
}
