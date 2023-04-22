package universe.interfaces;

import testing.Civilisation;
import universe.enums.PoliticalParty;

/**
 * <h1>Rozhraní obyvatelných objektů</h1>
 * Implementují jej všechny obyvatelné planety a habitaty.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public interface Habitable {

    /**
     * <h2>Getter</h2>
     * @return Přítomnost civilizace
     */
    boolean hasCivilisation();

    /**
     * <h2>Setter</h2>
     * @param civilisation Civilizace
     */
    void setCivilisation(Civilisation civilisation);

    /**
     * <h2>Getter</h2>
     * @return Civilizace
     */
    Civilisation getCivilisation();

    /**
     * <h2>Getter</h2>
     * @return Hlavní město
     */
    String getCapitalCity();

    /**
     * <h2>Setter</h2>
     * @param capitalCity Hlavní město
     */
    void setCapitalCity(String capitalCity);

    /**
     * <h2>Getter</h2>
     * @return Populace
     */
    long getPopulation();

    /**
     * <h2>Setter</h2>
     * @param population Populace
     */
    void setPopulation(Long population);

    /**
     * <h2>Getter</h2>
     * @return Stabilita
     */
    int getStability();

    /**
     * <h2>Setter</h2>
     * @param stability Stabilita
     */
    void setStability(int stability);

    /**
     * <h2>Getter</h2>
     * @return Obyvatelnost
     */
    int getHabitability();

    /**
     * <h2>Setter</h2>
     * @param habitability Obyvatelnost
     */
    void setHabitability(int habitability);

    /**
     * <h2>Getter</h2>
     * @return Dominantní politická strana
     */
    PoliticalParty getDominantPoliticalParty();

    /**
     * <h2>Setter</h2>
     * @param dominantPoliticalParty Dominantní politická strana
     */
    void setDominantPoliticalParty(PoliticalParty dominantPoliticalParty);
}
