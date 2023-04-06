package universe.celestial_body;

import universe.Universe;
import universe.interfaces.Formable;

public abstract class CelestialBody extends Universe implements Formable {
    long width = 0L;
    long height = 0L;
    long volume = 0L;

    /**
     * <h3>Zformování</h3>
     * <ul>
     *     <li><b>true</b> - Objekt zformován</li>
     *     <li><b>false</b> - Objekt nezformován</li>
     * </ul>
     * @see #isFormed() Getter
     * @see #setFormed(boolean) Setter
     */
    private boolean formed = false;

    /**
     * <h2>Getter vesmírného objektu</h2>
     * @return Zformování
     * @see #formed
     */
    @Override
    public boolean isFormed() {
        return formed;
    }

    /**
     * <h2>Setter vesmírného objektu</h2>
     * @param formed Zformování
     * @see #formed
     */
    public void setFormed(boolean formed) {
        this.formed = formed;
    }

    /**
     * <h2>Zformuje vesmírný objekt</h2>
     * Nastaví <i>formed</i> na <i>true</i>
     * @see #formed
     * @see #setFormed(boolean)
     */
    @Override
    public void form() {
        setFormed(true);
    }
}
