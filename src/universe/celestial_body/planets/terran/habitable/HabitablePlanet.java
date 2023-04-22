package universe.celestial_body.planets.terran.habitable;

import testing.Civilisation;
import universe.celestial_body.planets.terran.Terran;
import universe.enums.PoliticalParty;
import universe.interfaces.Habitable;

/**
 * <h1>Obyvatelná planeta</h1>
 * Kamenná planeta uzpůsobená ke vzniku a udržení života.
 * Může se zde vyvinout civilizace.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public abstract class HabitablePlanet extends Terran implements Habitable {

    /**
     * <h3>Typ obyvatelné planety</h3>
     * Existují čtyři základní typy
     * @see universe.celestial_body.planets.terran.habitable.dry.Dry Suchá planeta
     * @see universe.celestial_body.planets.terran.habitable.frozen.Frozen Studená planeta
     * @see universe.celestial_body.planets.terran.habitable.special.Special Speciální planeta
     * @see universe.celestial_body.planets.terran.habitable.wet.Wet Vlhká planeta
     * @see #getHabitablePlanetType() Getter
     * @see #setHabitablePlanetType(String) Setter
     */
    private String habitablePlanetType;

    /**
     * <h3>Přítomnost civilizace na planetě</h3>
     * <ul>
     *    <li><b>true</b> - Civilizace <u>je</u> přítomná na planetě</li>
     *    <li><b>false</b> - Civilizace <u>není</u> přítomná na planetě</li>
     *</ul>
     */
    private boolean hasCivilisation = false;

    /**
     * <h3>Civilizace planety</h3>
     * @see universe.enums.KardashevLevel Možné typy civilizací
     * @see #getCivilisation() Getter
     * @see #setCivilisation(Civilisation) Setter
     */
    private Civilisation civilisation;

    /**
     * <h3>Hlavní město planety</h3>
     * Sídlo planetární administrace.
     * Nemusí se jednat o největší město na planetě.
     * @see #getCapitalCity() Getter
     * @see #setCapitalCity(String) Setter
     */
    private String capitalCity;

    /**
     * <h3>Populace planety</h3>
     * Od několika desítek až po biliony.
     * @see #getPopulation() Getter
     * @see #setPopulation(Long) Setter
     */
    private long population;

    /**
     * <h3>Stabilita planety</h3>
     * <ul>
     *     <li>100% - 95% = velmi vysoká</li>
     *     <li>95% - 80% = vysoká</li>
     *     <li>80% - 50% = střední</li>
     *     <li>50% - 30% = nízká</li>
     *     <li>30% - 0% = velmi nízká</li>
     * </ul>
     * @see #getStability() Getter
     * @see #setStability(int) Setter
     */
    private int stability;

    /**
     * <h3>Obyvatelnost planety</h3>
     * <ul>
     *     <li>100% = dokonalá</li>
     *     <li>100% - 80% = dobrá</li>
     *     <li>80% - 60% = ucházející</li>
     *     <li>60% - 40% = dostatečná</li>
     *     <li>40% - 20% = špatná</li>
     *     <li>20% - 0% = dlouhodobě neobyvatelná</li>
     *     <li>0% = neobyvatelná</li>
     * </ul>
     * @see #getHabitability() Getter
     * @see #setHabitability(int) Setter
     */
    private int habitability;

    /**
     * <h3>Dominantní politická strana planety</h3>
     * @see PoliticalParty Možné politické strany
     * @see #getDominantPoliticalParty() Getter
     * @see #setDominantPoliticalParty(PoliticalParty) Setter
     */
    private PoliticalParty dominantPoliticalParty;

    /**
     * <h2>Getter obyvatelné planety</h2>
     * @return Typ obyvatelné planety
     * @see #habitablePlanetType
     */
    public String getHabitablePlanetType() {
        return habitablePlanetType;
    }

    /**
     * <h2>Setter obyvatelné planety</h2>
     * @param habitablePlanetType Typ obyvatelné planety
     * @see #habitablePlanetType
     */
    public void setHabitablePlanetType(String habitablePlanetType) {
        this.habitablePlanetType = habitablePlanetType;
    }

    /**
     * <h2>Getter obyvatelné planety</h2>
     * @return Přítomnost civilizace planety
     * @see #hasCivilisation
     */
    @Override
    public boolean hasCivilisation() {
        return hasCivilisation;
    }

    /**
     * <h2>Getter obyvatelné planety</h2>
     * @return Civilizace planety
     * @see #civilisation
     */
    @Override
    public Civilisation getCivilisation() {
        return civilisation;
    }

    /**
     * <h2>Setter obyvatelné planety</h2>
     * @param civilisation Civilizace planety
     * @see #civilisation
     */
    @Override
    public void setCivilisation(Civilisation civilisation) {
        this.civilisation = civilisation;
        hasCivilisation = true;
    }

    /**
     * <h2>Getter obyvatelné planety</h2>
     * @return Hlavní město planety
     * @see #capitalCity
     */
    @Override
    public String getCapitalCity() {
        return capitalCity;
    }

    /**
     * <h2>Setter obyvatelné planety</h2>
     * @param capitalCity Hlavní město planety
     * @see #capitalCity
     */
    @Override
    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    /**
     * <h2>Getter obyvatelné planety</h2>
     * @return Populace planety
     * @see #population
     */
    @Override
    public long getPopulation() {
        return population;
    }

    /**
     * <h2>Setter obyvatelné planety</h2>
     * @param population Populace planety
     * @see #population
     */
    @Override
    public void setPopulation(Long population) {
        this.population = population;
    }

    /**
     * <h2>Getter obyvatelné planety</h2>
     * @return Stabilita planety
     * @see #stability
     */
    @Override
    public int getStability() {
        return stability;
    }

    /**
     * <h2>Setter obyvatelné planety</h2>
     * @param stability Stabilita planety
     * @see #stability
     */
    @Override
    public void setStability(int stability) {
        this.stability = stability;
    }

    /**
     * <h2>Getter obyvatelné planety</h2>
     * @return Obyvatelnost planety
     * @see #habitability
     */
    @Override
    public int getHabitability() {
        return habitability;
    }

    /**
     * <h2>Setter obyvatelné planety</h2>
     * @param habitability Obyvatelnost planety
     * @see #habitability
     */
    @Override
    public void setHabitability(int habitability) {
        this.habitability = habitability;
    }

    /**
     * <h2>Getter obyvatelné planety</h2>
     * @return Dominantní politická strana planety
     * @see #dominantPoliticalParty
     */
    @Override
    public PoliticalParty getDominantPoliticalParty() {
        return dominantPoliticalParty;
    }

    /**
     * <h2>Setter obyvatelné planety</h2>
     * @param dominantPoliticalParty Dominantní politická strana planety
     * @see #dominantPoliticalParty
     */
    @Override
    public void setDominantPoliticalParty(PoliticalParty dominantPoliticalParty) {
        this.dominantPoliticalParty = dominantPoliticalParty;
    }
}
