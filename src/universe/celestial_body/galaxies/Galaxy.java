package universe.celestial_body.galaxies;

import universe.celestial_body.CelestialBody;

import java.util.ArrayList;
import java.util.List;

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
     * <h3><s>Jména hvězdných systémů</s></h3>
     * <p><b>ZASTARALÝ ATRIBUT</b></p>
     * Ve většině případů neobsahuje jména všech hvězd.
     * Pouze důležité a zajímavé soustavy.
     * @since 14.4.2023
     * @see #getNameOfStar() Getter
     * @see #setNameOfStar(String[]) Setter
     */
    @Deprecated
    private String[] namesOfStar_deprecated;

    /**
     * <h3>Kolekce jmen hvězd galaxie</h3>
     * Ve většině případů neobsahuje jména všech hvězd.
     * Pouze důležité a zajímavé soustavy.
     * @see #getNameOfStar(int) Getter
     * @see #addNameOfStar(String) Setter
     */
    private List<String> nameOfStar = new ArrayList<>();

    /**
     * <h3>Počet civilizací v galaxii</h3>
     * Od žádné až po několik stovek.
     * @see #getNumberOfCivilisations() Getter
     * @see #setNumberOfCivilisations(long) Setter
     */
    private long numberOfCivilisations;

    /**
     * <h3><s>Jména civilizací</s></h3>
     * <p><b>ZASTARALÝ ATRIBUT</b></p>
     * Obsahuje jména všech civilizací.
     * Primitivní civilizace nikoliv.
     * @since 14.4.2023
     * @see #getNamesOfCivilisations() Getter
     * @see #setNamesOfCivilisations(String[]) Setter
     */
    @Deprecated
    private String[] namesOfCivilisations_deprecated;

    /**
     * <h3>Kolekce jmen civilizací galaxie</h3>
     * Obsahuje jména všech civilizací.
     * Primitivní civilizace nikoliv.
     * @see #getNameOfCivilisation(int) Getter
     * @see #addNameOfCivilisation(String) Setter
     */
    private List<String> namesOfCivilisations = new ArrayList<>();

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
     * <h2><s>Getter galaxie</s></h2>
     * <b>ZASTARALÁ METODA</b>
     * @return Jména hvězdných systémů
     * @since 14.4.2023
     * @see #namesOfStar_deprecated
     * @see #nameOfStar
     */
    @Deprecated
    public String[] getNameOfStar() {
        return namesOfStar_deprecated;
    }

    /**
     * <h2><s>Setter galaxie</s></h2>
     * <b>ZASTARALÁ METODA</b>
     * @param nameOfStar Jména hvězdných systémů
     * @since 14.4.2023
     * @see #namesOfStar_deprecated
     * @see #nameOfStar
     */
    @Deprecated
    public void setNameOfStar(String[] nameOfStar) {
        this.namesOfStar_deprecated = nameOfStar;
    }

    /**
     * <h2>Getter galaxie</h2>
     * Vrátí požadovanou hvězdu.
     * @param position Pozice hvězdy
     * @return Jméno hvězdy
     * @see #nameOfStar
     */
    public String getNameOfStar(int position) {
        return nameOfStar.get(position);
    }

    /**
     * <h2>Setter galaxie</h2>
     * Přidá hvězdu do kolekce hvězd.
     * @param name Jméno hvězdy
     * @see #nameOfStar
     */
    public void addNameOfStar(String name) {
        nameOfStar.add(name);
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
     * <h2><s>Getter galaxie</s></h2>
     * <b>ZASTARALÁ METODA</b>
     * @return Jména civilizací
     * @since 14.4.2023
     * @see #namesOfCivilisations
     * @see #namesOfCivilisations_deprecated
     */
    @Deprecated
    public String[] getNamesOfCivilisations() {
        return namesOfCivilisations_deprecated;
    }

    /**
     * <h2><s>Setter galaxie</s></h2>
     * <b>ZASTARALÁ METODA</b>
     * @param namesOfCivilisations Jména civilizací
     * @since 14.4.2023
     * @see #namesOfCivilisations_deprecated
     * @see #addNameOfCivilisation(String) Náhrada za tuto metodu
     */
    @Deprecated
    public void setNamesOfCivilisations(String[] namesOfCivilisations) {
        this.namesOfCivilisations_deprecated = namesOfCivilisations;
    }

    /**
     * <h2>Getter galaxie</h2>
     * Vrátí požadovanou civilizaci.
     * @param position Pozice civilizace
     * @return Jméno civilizace
     * @see #namesOfCivilisations
     */
    public String getNameOfCivilisation(int position) {
        return namesOfCivilisations.get(position);
    }

    /**
     * <h2>Setter galaxie</h2>
     * Přidá civilizaci do kolekce civilizací.
     * @param name Jméno civilizace
     * @see #namesOfCivilisations
     */
    public void addNameOfCivilisation(String name) {
        namesOfCivilisations.add(name);
    }
}
