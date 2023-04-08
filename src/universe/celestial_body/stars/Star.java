package universe.celestial_body.stars;

import universe.celestial_body.CelestialBody;

/**
 * <h1>Hvězda</h1>
 * Plazmové těleso přibližně kulovitého tvaru.
 * Má vlastní zdroj viditelného zaření.
 * Drží ji pohromadě její vlastní gravitace.
 * Může tvořit vícenásobné systémy nebo i hvězdokupy.
 * Většinou je součástí galaxií.
 * Mohou ale být i toulavé.
 * @author Jakub Štych
 * @version 8.4.2023
 */
public abstract class Star extends CelestialBody {

    /**
     * <h3>Typ hvězdy</h3>
     * @see BlackHole Černá díra
     * @see BlackMatterStar Temná hvězda
     * @see Kvazar Kvazar
     * @see Magnetar Magnetar
     * @see NeutronStar Neutronová hvězda
     * @see Pulsar Pulsar
     * @see QuasiStar Kvazi hvězda
     * @see StrangeStar Zvláštní hvězda
     * @see TypeA Hvězda typu A
     * @see TypeB Hvězda typu B
     * @see TypeC Hvězda typu C
     * @see TypeD Hvězda typu D
     * @see TypeF Hvězda typu F
     * @see TypeG Hvězda typu G
     * @see TypeK Hvězda typu K
     * @see TypeL Hvězda typu L
     * @see TypeM Hvězda typu M
     * @see TypeO Hvězda typu O
     * @see TypeS Hvězda typu S
     * @see TypeT Hvězda typu T
     * @see TypeW Hvězda typu W
     * @see TZObject Hybridní hvězda
     * @see WhiteHole Bílá díra
     * @see #getType() Getter
     * @see #setType(String) Setter
     */
    private String type;

    /**
     * <h3>Velikost hvězdy</h3>
     * Od pár kilometrů až po miliardu a půl kilometrů.
     * @see #getSize() Getter
     * @see #setSize(long) Setter
     */
    private long size;

    /**
     * <h3>Teplota hvězdy</h3>
     * Mezi 2 500 až 50 000 stupňů Kelvina. (C = K - 273.15)
     * @see #getTemperature() Getter
     * @see #setTemperature(int) Setter
     */
    private int temperature;

    /**
     * <h3>Zářivost hvězdy</h3>
     * Mezi 38.5 triliard až 2.4 kvintilionů Wattů.
     * @see #getLuminosity() Getter
     * @see #setLuminosity(int) Setter
     */
    private int luminosity;

    /**
     * <h2>Getter hvězdy</h2>
     * @return Typ hvězdy
     * @see #type
     */
    public String getType() {
        return type;
    }

    /**
     * <h2>Setter hvězdy</h2>
     * @param type Typ hvězdy
     * @see #type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <h2>Getter hvězdy</h2>
     * @return Velikost hvězdy
     * @see #size
     */
    public long getSize() {
        return size;
    }

    /**
     * <h2>Setter hvězdy</h2>
     * @param size Velikost hvězdy
     * @see #size
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * <h2>Getter hvězdy</h2>
     * @return Teplota hvězdy
     * @see #temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * <h2>Setter hvězdy</h2>
     * @param temperature Teplota hvězdy
     * @see #temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * <h2>Getter hvězdy</h2>
     * @return Zářivost hvězdy
     * @see #luminosity
     */
    public int getLuminosity() {
        return luminosity;
    }

    /**
     * <h2>Setter hvězdy</h2>
     * @param luminosity Zářivost hvězdy
     * @see #luminosity
     */
    public void setLuminosity(int luminosity) {
        this.luminosity = luminosity;
    }
}
