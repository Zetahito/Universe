package universe.interfaces;

/**
 * <h1>Rozhraní vytvořitelných objektů</h1>
 * Implementují jej všechny atronomické objekty.
 * Jedno z klíčových rozhraní.
 * @author Jakub Štych
 * @version 7.4.2023
 */
public interface Formable {

    /**
     * <h2>Getter</h2>
     * @return Šířka
     */
    long getWidth();

    /**
     * <h2>Setter</h2>
     * @param width Šířka
     */
    void setWidth(long width);

    /**
     * <h2>Getter</h2>
     * @return Výška
     */
    long getHeight();

    /**
     * <h2>Setter</h2>
     * @param height Výška
     */
    void setHeight(long height);

    /**
     * <h2>Getter</h2>
     * @return Hloubka
     */
    long getVolume();

    /**
     * <h2>Setter</h2>
     * @param volume Hloubka
     */
    void setVolume(long volume);

    /**
     * <h2>Getter</h2>
     * @return Váha
     */
    long getWeight();

    /**
     * <h2>Setter</h2>
     * @param weight Váha
     */
    void setWeight(long weight);

    /**
     * <h2>Getter</h2>
     * @return Zformování
     */
    boolean isFormed();

    /**
     * <h2>Setter</h2>
     * @param formed Zformování
     */
    void setFormed(boolean formed);

    /**
     * <h2>Zformuje vesmírný objekt</h2>
     */
    void form();
}
