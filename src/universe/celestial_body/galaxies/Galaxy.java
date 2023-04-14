package universe.celestial_body.galaxies;

import universe.celestial_body.CelestialBody;

/**
 * <h1>Galaxie</h1>
 * Gravitačně vázaný systém hvězd, mezihvězdné hmoty, kosmického prachu a temné hmoty.
 * Drží pospolu působením gravitačních sil.
 * Jednotlivé komponenty obíhají kolem společného středu.
 * @author Jakub Štych
 * @version 6.4.2023
 */
public abstract class Galaxy extends CelestialBody {

    /**
     * <h3>Typ galaxie</h3>
     * @see BarredSpiral Spirální galaxie s příčkou
     * @see Elliptical Eliptická galaxie
     * @see Irregular Nepravidelná galaxie
     * @see Lenticular Čočková galaxie
     * @see Ring Prstencová galaxie
     * @see Spiral Spirální galaxie bez příčky
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
    @Deprecated
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
    @Deprecated
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
    @Deprecated
    public String[] getNamesOfStar() {
        return namesOfStar;
    }

    /**
     * <h2>Setter galaxie</h2>
     * @param namesOfStar Jména hvězdných systémů
     * @see #namesOfStar
     */
    @Deprecated
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
    @Deprecated
    public String[] getNamesOfCivilisations() {
        return namesOfCivilisations;
    }

    /**
     * <h2>Setter galaxie</h2>
     * @param namesOfCivilisations Jména civilizací
     * @see #namesOfCivilisations
     */
    @Deprecated
    public void setNamesOfCivilisations(String[] namesOfCivilisations) {
        this.namesOfCivilisations = namesOfCivilisations;
    }
}
