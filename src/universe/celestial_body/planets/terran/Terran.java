package universe.celestial_body.planets.terran;

import universe.celestial_body.planets.Planet;

/**
 * <h1>Terestrická Planeta</h1>
 * Planeta složená především z křemičitanových hornin.
 * Tvoří je centrální kovové jádro, převážně ze železa obklopené křemičitanovým pláštěm.
 * Na povrchu plášť přechází v kůru.
 * Topologii povrchu tvoří především krátery, kaňony, hory a sopky.
 * Mohou, ale nemusí mít i plynnou atmosféru.
 * Obyvatelné planety dědí od této třídy a dělí se na 4 typy:
 * @see universe.celestial_body.planets.terran.habitable.dry.Dry Suchá planeta
 * @see universe.celestial_body.planets.terran.habitable.wet.Wet Vlhká planeta
 * @see universe.celestial_body.planets.terran.habitable.frozen.Frozen Zmrzlá planeta
 * @see universe.celestial_body.planets.terran.habitable.special.Special Speciální planeta
 * @author Jakub Štych
 * @version 18.4.2023
 */
public abstract class Terran extends Planet {

    /**
     * <h3>Typ terestrické planety</h3>
     * Obyvatelné planety nejsou zahrnuty.
     * @see Barren Holý svět
     * @see Frozen Zmrzlý svět
     * @see Molten Roztavený svět
     * @see Protoplanet Protoplaneta
     * @see Toxic Toxický svět
     * @see #getTerranPlanetType() Getter
     * @see #setTerranPlanetType(String) Setter
     */
    private String terranPlanetType;

    /**
     * <h2>Getter terestrické planety</h2>
     * @return Typ planety
     * @see #terranPlanetType
     */
    public String getTerranPlanetType() {
        return terranPlanetType;
    }

    /**
     * <h2>Setter terestrické planety</h2>
     * @param terranPlanetType Typ planety
     * @see #terranPlanetType
     */
    public void setTerranPlanetType(String terranPlanetType) {
        this.terranPlanetType = terranPlanetType;
    }
}
