package universe.celestial_body.planets.gas;

import universe.celestial_body.planets.Planet;

/**
 * <h1>Plynná Planeta</h1>
 * Planeta nemá pevný povrch.
 * Má pouze hustou atmosféru postupně přecházející do pláště.
 * Mohou ale mít pevné jádro.
 * @author Jakub Štych
 * @version 17.4.2023
 */
public abstract class Gas extends Planet {

    /**
     * <h3>Typ planety</h3>
     * @see universe.celestial_body.planets.gas.GasGiant Plynný obr
     * @see universe.celestial_body.planets.gas.HotJupiter Horký Jupiter
     * @see universe.celestial_body.planets.gas.IceGiant Ledový obr
     * @see #getGasPlanetType() Getter
     * @see #setGasPlanetType(String) Setter
     */
    private String gasPlanetType;

    /**
     * <h2>Getter plynné planety</h2>
     * @return Typ planety
     * @see #gasPlanetType
     */
    public String getGasPlanetType() {
        return gasPlanetType;
    }

    /**
     * <h2>Setter plynné planety</h2>
     * @param gasPlanetType Typ planety
     * @see #gasPlanetType
     */
    public void setGasPlanetType(String gasPlanetType) {
        this.gasPlanetType = gasPlanetType;
    }
}
