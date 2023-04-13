package universe.celestial_body.irregular;

/**
 * <h1>Kometa</h1>
 * Malé těleso převážně složené z ledu, oxidu uhličitého, methanu a prachu.
 * Dosahují rychlosti až 70 km/s.
 * Pevné jádro obklopuje plynná koma.
 * Směrem od hvězdy poté míří kometární ohon.
 * @author Jakub Štych
 * @version 10.4.2023
 */
public class Comet extends Irregular {

    /**
     * <h3>Průměr kometární komy</h3>
     * Od 1 km až po 120 km
     * @see #getComaDiameter() Getter
     * @see #setComaDiameter(double) Setter
     */
    private double comaDiameter;

    /**
     * <h3>Délka kometárního ohonu</h3>
     * Až půl miliardy km
     * @see #getTailLength() Getter
     * @see #setTailLength(long) Setter
     */
    private long tailLength;

    /**
     * <h2>Konstruktor Komety</h2>
     */
    Comet() {
        setType("Comet");
    }

    /**
     * <h2>Getter komety</h2>
     * @return Průměr kometární komy
     * @see #comaDiameter
     */
    public double getComaDiameter() {
        return comaDiameter;
    }

    /**
     * <h2>Setter komety</h2>
     * @param comaDiameter Průměr kometární komy
     * @see #comaDiameter
     */
    public void setComaDiameter(double comaDiameter) {
        this.comaDiameter = comaDiameter;
    }

    /**
     * <h2>Getter komety</h2>
     * @return Délka kometárního ohonu
     * @see #tailLength
     */
    public long getTailLength() {
        return tailLength;
    }

    /**
     * <h2>Setter komety</h2>
     * @param tailLength Délka kometárního ohonu
     * @see #tailLength
     */
    public void setTailLength(long tailLength) {
        this.tailLength = tailLength;
    }
}
