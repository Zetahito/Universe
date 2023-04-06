package universe.celestial_body.galaxies;

import universe.celestial_body.CelestialBody;

/**
 * <h1>Abstraktní galaxie</h1>
 * Dědí od ní všechny typy galaxií.
 * Je potomkem Vesmírného tělesa.
 * @author Jakub Štych
 * @version 6.4.2023
 */
public abstract class Galaxy extends CelestialBody {

    /**
     * <h3>Typ galaxie</h3>
     * <ul>
     *     <li><b>Barred Spiral</b> - Spirální galaxie s příčkou</li>
     *     <li><b>Elliptical</b> - Eliptická galaxie</li>
     *     <li><b>Irregular</b> - Nepravidelná galaxie</li>
     *     <li><b>Lenticular</b> - Čočková galaxie</li>
     *     <li><b>Spiral</b> - Spirální galaxie bez příčky</li>
     * </ul>
     * @see #getType() Getter
     * @see #setType(String) Setter
     */
    private String type;

    /**
     * <h3>Počet hvězd v galaxii</h3>
     * Od několika miliard až po stovky trilionů.
     * @see #getNumberOfStars()  Getter
     * @see #setNumberOfStars(long)  Setter
     */
    private long numberOfStars;

    /**
     * <h3>Jména hvězdných systémů</h3>
     * Ve většině případů neobsahuje jména všech hvězd.
     * Pouze důležité a zajímavé soustavy.
     * @see #getNamesOfStar() Getter
     * @see #setNamesOfStar(String[]) Setter
     */
    private String[] namesOfStar;

    /**
     * <h3>Počet civilizací v galaxii</h3>
     * Od žádné až po několik stovek.
     * @see #getNumberOfCivilisations() Getter
     * @see #setNumberOfCivilisations(long) Setter
     */
    private long numberOfCivilisations;

    /**
     * <h3>Jména civilizací</h3>
     * Obsahuje jména všech civilizací.
     * Primitivní civilizace nikoliv.
     * @see #getNamesOfCivilisations() Getter
     * @see #setNamesOfCivilisations(String[]) Setter
     */
    private String[] namesOfCivilisations;

    /**
     * <h2>Getter galaxie</h2>
     * @return Typ galaxie
     * @see #type
     */
    public String getType() {
        return type;
    }

    /**
     * <h2>Setter galaxie</h2>
     * @param type Typ galaxie
     * @see #type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <h2>Getter galaxie</h2>
     * @return Počet hvězd v galaxii
     * @see #numberOfStars
     */
    public long getNumberOfStars() {
        return numberOfStars;
    }

    /**
     * <h2>Setter galaxie</h2>
     * @param numberOfStars Počet hvězd v galaxii
     * @see #numberOfStars
     */
    public void setNumberOfStars(long numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    /**
     * <h2>Getter galaxie</h2>
     * @return Jména hvězdných systémů
     * @see #namesOfStar
     */
    public String[] getNamesOfStar() {
        return namesOfStar;
    }

    /**
     * <h2>Setter galaxie</h2>
     * @param namesOfStar Jména hvězdných systémů
     * @see #namesOfStar
     */
    public void setNamesOfStar(String[] namesOfStar) {
        this.namesOfStar = namesOfStar;
    }

    /**
     * <h2>Getter galaxie</h2>
     * @return Počet civilizací v galaxii
     * @see #numberOfCivilisations
     */
    public long getNumberOfCivilisations() {
        return numberOfCivilisations;
    }

    /**
     * <h2>Setter galaxie</h2>
     * @param numberOfCivilisations Počet civilizací v galaxii
     * @see #numberOfCivilisations
     */
    public void setNumberOfCivilisations(long numberOfCivilisations) {
        this.numberOfCivilisations = numberOfCivilisations;
    }

    /**
     * <h2>Getter galaxie</h2>
     * @return Jména civilizací
     * @see #namesOfCivilisations
     */
    public String[] getNamesOfCivilisations() {
        return namesOfCivilisations;
    }

    /**
     * <h2>Setter galaxie</h2>
     * @param namesOfCivilisations Jména civilizací
     * @see #namesOfCivilisations
     */
    public void setNamesOfCivilisations(String[] namesOfCivilisations) {
        this.namesOfCivilisations = namesOfCivilisations;
    }
}
