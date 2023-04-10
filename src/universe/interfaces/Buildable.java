package universe.interfaces;

/**
 * <h1>Rozhraní vybudovatelných objektů</h1>
 * Implementují jej všechny umělé struktury.
 * Jedno z klíčových rozhraní.
 * @author Jakub Štych
 * @version 9.4.2023
 */
public interface Buildable {
    /**
     * <h2>Getter</h2>
     * @return Vybudování
     */
    boolean isBuilt();

    /**
     * <h2>Setter</h2>
     * @param built Vybudování
     */
    void setBuilt(boolean built);

    /**
     * <h2>Vybuduje umělou strukturu</h2>
     */
    void build();
}
