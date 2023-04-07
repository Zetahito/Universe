package universe.celestial_body.galaxies;

/**
 * <h1>Spirální galaxie bez příčky</h1>
 * Středová oblast má kruhový tvar.
 * Z galaktické výdutě vycházejí jednotlivá ramena.
 * Může jich mít libovolné množství.
 * Galaktické jádro obsahuje převážně staré hvězdy.
 * Galaktická ramena obsahují pro změnu převážně mladé hvězdy.
 * V ramenech i vznikají nové hvězdy.
 * @author Jakub Štych
 * @version 7.4.2023
 */
public class Spiral extends Galaxy {

    /**
     * <h3>Počet ramen spirálové galaxie</h3>
     * @see #getNumberOfArms() Getter
     * @see #setNumberOfArms(int) Setter
     */
    private int numberOfArms;

    /**
     * <h3>Jména ramen spirálové galaxie</h3>
     * @see #getNamesOfArms() Getter
     * @see #setNamesOfArms(String[]) Setter
     */
    private String[] namesOfArms;

    /**
     * <h2>Konstruktor spirální galaxie</h2>
     */
    public Spiral() {
        setType("Spiral");
    }

    /**
     * <h2>Getter spirální galaxie</h2>
     * @return Počet ramen spirální galaxie
     * @see #numberOfArms
     */
    public int getNumberOfArms() {
        return numberOfArms;
    }

    /**
     * <h2>Setter spirální galaxie</h2>
     * @param numberOfArms Počet ramen spirální galaxie
     * @see #numberOfArms
     */
    public void setNumberOfArms(int numberOfArms) {
        this.numberOfArms = numberOfArms;
    }

    /**
     * <h2>Getter spirální galaxie</h2>
     * @return Jména ramen spirální galaxie
     * @see #namesOfArms
     */
    public String[] getNamesOfArms() {
        return namesOfArms;
    }

    /**
     * <h2>Setter spirální galaxie</h2>
     * @param namesOfArms Jména ramen spirální galaxie
     * @see #namesOfArms
     */
    public void setNamesOfArms(String[] namesOfArms) {
        this.namesOfArms = namesOfArms;
    }
}
