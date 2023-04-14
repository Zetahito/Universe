package universe.celestial_body.galaxies;

/**
 * <h1>Spirální galaxie s příčkou</h1>
 * Středová oblast má kruhový tvar.
 * Má pouze dvě spirální ramena.
 * Nenapojují se na jádro přímo, ale přes příčku otáčející se stejnoměrně spolu s jádrem.
 * Galaktické jádro obsahuje převážně staré hvězdy.
 * Galaktická ramena obsahují pro změnu převážně mladé hvězdy.
 * V ramenech i vznikají nové hvězdy.
 * @author Jakub Štych
 * @version 7.4.2023
 */
public class BarredSpiral extends Galaxy {

    /**
     * <h3>Počet ramen spirálové galaxie</h3>
     * @see #getNumberOfArms() Getter
     */
    private final int numberOfArms = 2;

    /**
     * <h3>Jména ramen spirálové galaxie</h3>
     * @see #getNamesOfArms() Getter
     * @see #setNamesOfArms(String[]) Setter
     */
    private String[] namesOfArms;

    /**
     * <h2>Konstruktor spirální galaxie</h2>
     */
    public BarredSpiral() {
        setType("Barred Spiral");
        setFormed(true);
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
