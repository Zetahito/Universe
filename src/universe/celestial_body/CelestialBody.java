package universe.celestial_body;

import universe.Universe;
import universe.interfaces.Formable;

/**
 * <h1>Astronomický objekt</h1>
 * Fyzická entita existující ve vesmíru.
 * @author Jakub Štych
 * @version 7.4.2023
 */
public abstract class CelestialBody extends Universe implements Formable {

    /**
     * <h3>Šířka astronomického objektu</h3>
     * Jeden z rozměrů.
     * @see #getWidth() Getter
     * @see #setWidth(long) Setter
     */
    private long width;

    /**
     * <h3>Výška astronomického objektu</h3>
     * Jeden z rozměrů.
     * @see #getHeight() Getter
     * @see #setHeight(long) Setter
     */
    private long height;

    /**
     * <h3>Hloubka astronomického objektu</h3>
     * Jeden z rozměrů.
     * @see #getVolume() Getter
     * @see #setVolume(long) Setter
     */
    private long volume;

    /**
     * <h3>Váha astronomického objektu</h3>
     * @see #getWeight() Getter
     * @see #setWeight(long) Setter
     */
    private long weight;

    /**
     * <h3>Zformování astronomického objektu</h3>
     * <ul>
     *    <li><b>true</b> - Astronomický objekt <u>byl</u> zformován</li>
     *    <li><b>false</b> - Astronomický objekt <u>nebyl</u> zformován</li>
     *</ul>
     * @see #form()
     */
    private boolean formed = false;

    /**
     * <h2>Getter astronomického objektu</h2>
     * @return Šířka astronomického objektu
     * @see #width
     */
    @Override
    public long getWidth() {
        return width;
    }

    /**
     * <h2>Setter astronomického objektu</h2>
     * @param width Šířka astronomického objektu
     * @see #width
     */
    @Override
    public void setWidth(long width) {
        this.width = width;
    }

    /**
     * <h2>Getter astronomického objektu</h2>
     * @return Výška astronomického objektu
     * @see #height
     */
    @Override
    public long getHeight() {
        return height;
    }

    /**
     * <h2>Setter astronomického objektu</h2>
     * @param height Výška astronomického objektu
     * @see #height
     */
    @Override
    public void setHeight(long height) {
        this.height = height;
    }

    /**
     * <h2>Getter astronomického objektu</h2>
     * @return Hloubka astronomického objektu
     * @see #volume
     */
    @Override
    public long getVolume() {
        return volume;
    }

    /**
     * <h2>Setter astronomického objektu</h2>
     * @param volume Hloubka astronomického objektu
     * @see #volume
     */
    @Override
    public void setVolume(long volume) {
        this.volume = volume;
    }

    /**
     * <h2>Getter astronomického objektu</h2>
     * @return Váha astronomického objektu
     * @see #weight
     */
    @Override
    public long getWeight() {
        return weight;
    }

    /**
     * <h2>Setter astronomického objektu</h2>
     * @param weight Váha astronomického objektu
     * @see #weight
     */
    @Override
    public void setWeight(long weight) {
        this.weight = weight;
    }

    /**
     * <h2>Getter astronomického objektu</h2>
     * @return Zformování astronomického objektu
     * @see #formed
     */
    @Override
    public boolean isFormed() {
        return formed;
    }

    /**
     * <h2>Setter astronomického objektu</h2>
     * @param formed Zformování astronomického objektu
     * @see #formed
     */
    @Override
    public void setFormed(boolean formed) {
        this.formed = formed;
    }

    /**
     * <h2>Zformuje vesmírný objekt</h2>
     * @see #formed
     */
    @Override
    public void form() {
        setFormed(true);
    }
}
