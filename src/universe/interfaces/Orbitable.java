package universe.interfaces;

/**
 * <h1>Rozhraní orbitujících objektů</h1>
 * Implementují jej všechny objekty pohybující v galaxii.
 * @author Jakub Štych
 * @version 16.4.2023
 */
public interface Orbitable {

    //TODO - boolean isOrbiting(); void setOrbiting(CelestialBody);

    /**
     * <h2>Getter</h2>
     * Doba, za kterou těleso oběhne jiné těleso.
     * @return Délka roku
     */
    double getOrbitPeriod();

    /**
     * <h2>Setter</h2>
     * Doba, za kterou těleso oběhne jiné těleso.
     * @param orbitPeriod Délka roku
     */
    void setOrbitPeriod(double orbitPeriod);

    /**
     * <h2>Getter</h2>
     * Doba, za kterou se těleso otočí kolem své osy.
     * @return Délka dne
     */
    double getRotationPeriod();

    /**
     * <h2>Setter</h2>
     * Doba, za kterou se těleso otočí kolem své osy.
     * @param rotationPeriod Délka dne
     */
    void setRotationPeriod(double rotationPeriod);

    /**
     * <h2>Getter</h2>
     * Směrem k jinému tělesu je natočena pouze jedna půlka tělesa.
     * @return Vázaná rotace
     */
    boolean isTidallyLocked();

    /**
     * <h2>Setter</h2>
     * Směrem k jinému tělesu je natočena pouze jedna půlka tělesa.
     * @param tidallyLocked Vázaná rotace
     */
    void setTidallyLocked(boolean tidallyLocked);
}
