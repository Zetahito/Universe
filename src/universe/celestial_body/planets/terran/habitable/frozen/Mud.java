package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Blátivá planeta</h1>
 * Zmrzlá blátivá planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Roční období se od sebe příliš neliší.
 * Celoročně je zde pozoruhodné množství srážek.
 * Hojnost geotermálních aktivit způsobuje vznik blátivých jezer a blátivých sopek na povrchu planety.
 * Liší se tím od {@link Bog bažinaté planety}.
 * @author Jakub Štych
 * @version 2.5.2023
 */
public class Mud extends Frozen {

    /**
     * <h2>Konstruktor blátivé planety</h2>
     */
    public Mud() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setFrozenPlanetType("Mud");

        setHabitability(75);

        setSelectedPlanetaryFeature(PlanetaryFeature.MUD);
        setSelectedPlanetaryFeature(PlanetaryFeature.MUD_LAKE);
        setSelectedPlanetaryFeature(PlanetaryFeature.MUD_VOLCANO);
        setSelectedPlanetaryFeature(PlanetaryFeature.HUGE_MOUNTAINS);
    }
}
