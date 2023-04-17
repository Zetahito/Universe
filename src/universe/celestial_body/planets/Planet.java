package universe.celestial_body.planets;

import universe.celestial_body.CelestialBody;
import universe.interfaces.Orbitable;

/**
 * <h1>Planeta</h1>
 * Těleso s dostatečnou hmotností, aby ho gravitační síla zformovala do přibližně kulového tvaru.
 * Je dominantní v zóně své oběžné dráhy.
 * Může obíhat hvězdy, nebo být bludnou planetou.
 * Může mít měsíce, nebo být měsícem.
 * @author Jakub Štych
 * @version 16.4.2023
 */
public abstract class Planet extends CelestialBody implements Orbitable {

    /**
     * <h3>Typ planety</h3>
     * @see universe.celestial_body.planets.gas.Gas Plynná planeta
     * @see universe.celestial_body.planets.terran.Terran Terestrická planeta
     * @see #getType() Getter
     * @see #setType(String) Setter
     */
    private String type;

    /**
     * <h3>Velikost planety</h3>
     * Udávaná ve stupnici 1-500.
     * Jeden bod stupnice představuje 654.5684 km průměru planety.
     * @see #getSize() Getter
     * @see #setSize(int) Setter
     */
    private int size;

    /**
     * <h3>Průměr planety</h3>
     * Od 600 km do 330 000 km.
     * @see #getDiameter() Getter
     * @see #setDiameter(double) Setter
     */
    private double diameter;

    /**
     * <h3>Délka roku planety</h3>
     * Doba, za jakou planeta oběhne svou mateřskou hvězdu.
     * V případě bludné planety se udává doba oběhu kolem středu galaxie.
     * @see #getOrbitPeriod() Getter
     * @see #setOrbitPeriod(double) Setter
     */
    private double orbitPeriod;

    /**
     * <h3>Délka dne planety</h3>
     * Doba, za jakou se planeta otočí kolem své osy.
     * V případě vázané rotace je den stejně dlouhý jako rok.
     * @see #getRotationPeriod() Getter
     * @see #setRotationPeriod(double) Setter
     */
    private double rotationPeriod;

    /**
     * <h3>Vázaná rotace planety</h3>
     * Směrem k hvězdě je natočena pouze jedna půlka planety.
     * Den je stejně dlouhý jako rok.
     * @see #isTidallyLocked() Getter
     * @see #setTidallyLocked(boolean) Setter
     */
    private boolean tidallyLocked;

    /**
     * <h3>Síla gravitace planety</h3>
     * Tíhová síla udává metry za sekundu na −2.
     * Vhodné pro život je 5-18 G
     * @see #getGravity() Getter
     * @see #setGravity(double) Setter
     */
    private double gravity;

    /**
     * <h3>Teplota planety</h3>
     * Udávaná v kelvinech.
     * Vhodné pro život je 5-18 G.
     * @see #getTemperature() Getter
     * @see #setTemperature(double) Setter
     */
    private double temperature;

    /**
     * <h3>Atmosféra planety</h3>
     * Přítomnost atmosféry neznamená její dýchatelnost.
     * Vhodné pro život je 5-18 G.
     * @see #isPlanetWithAtmosphere() Getter
     * @see #setPlanetWithAtmosphere(boolean) Setter
     */
    private boolean planetWithAtmosphere;

    /**
     * <h3>Prstenec planety</h3>
     * Nemá víc než estetický význam.
     * @see #isSurroundedByRing() Getter
     * @see #setSurroundedByRing(boolean) Setter
     */
    private boolean surroundedByRing;

    /**
     * <h2>Getter planety</h2>
     * @return Typ planety
     * @see #type
     */
    public String getType() {
        return type;
    }

    /**
     * <h2>Setter planety</h2>
     * @param type Typ planety
     * @see #type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Velikost planety
     * @see #size
     */
    public int getSize() {
        return size;
    }

    /**
     * <h2>Setter planety</h2>
     * @param size Velikost planety
     * @see #size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Průměr planety
     * @see #diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * <h2>Setter planety</h2>
     * @param diameter Průměr planety
     * @see #diameter
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Délka roku planety
     * @see #orbitPeriod
     */
    @Override
    public double getOrbitPeriod() {
        return orbitPeriod;
    }

    /**
     * <h2>Setter planety</h2>
     * @param orbitPeriod Délka roku planety
     * @see #orbitPeriod
     */
    @Override
    public void setOrbitPeriod(double orbitPeriod) {
        this.orbitPeriod = orbitPeriod;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Délka dne planety
     * @see #rotationPeriod
     */
    @Override
    public double getRotationPeriod() {
        return rotationPeriod;
    }

    /**
     * <h2>Setter planety</h2>
     * @param rotationPeriod Délka dne planety
     * @see #rotationPeriod
     */
    @Override
    public void setRotationPeriod(double rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Vázaná rotace planety
     * @see #tidallyLocked
     */
    @Override
    public boolean isTidallyLocked() {
        return tidallyLocked;
    }

    /**
     * <h2>Setter planety</h2>
     * @param tidallyLocked Vázaná rotace planety
     * @see #tidallyLocked
     */
    @Override
    public void setTidallyLocked(boolean tidallyLocked) {
        this.tidallyLocked = tidallyLocked;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Síla gravitace planety
     * @see #gravity
     */
    public double getGravity() {
        return gravity;
    }

    /**
     * <h2>Setter planety</h2>
     * @param gravity Síla gravitace planety
     * @see #gravity
     */
    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Teplota planety
     * @see #temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * <h2>Setter planety</h2>
     * @param temperature Teplota planety
     * @see #temperature
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Atmosféra planety
     * @see #planetWithAtmosphere
     */
    public boolean isPlanetWithAtmosphere() {
        return planetWithAtmosphere;
    }

    /**
     * <h2>Setter planety</h2>
     * @param planetWithAtmosphere Atmosféra planety
     * @see #planetWithAtmosphere
     */
    public void setPlanetWithAtmosphere(boolean planetWithAtmosphere) {
        this.planetWithAtmosphere = planetWithAtmosphere;
    }

    /**
     * <h2>Getter planety</h2>
     * @return Prstenec planety
     * @see #surroundedByRing
     */
    public boolean isSurroundedByRing() {
        return surroundedByRing;
    }

    /**
     * <h2>Setter planety</h2>
     * @param surroundedByRing Prstenec planety
     * @see #surroundedByRing
     */
    public void setSurroundedByRing(boolean surroundedByRing) {
        this.surroundedByRing = surroundedByRing;
    }
}
