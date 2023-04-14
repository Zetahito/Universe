package universe.interfaces;

import universe.enums.Materials;

/**
 * <h1>Rozhraní materiálních objektů</h1>
 * Implementují jej všechny objekty z materiálů.
 * @author Jakub Štych
 * @version 14.4.2023
 */
public interface Materiable {

    /**
     * <h2>Getter</h2>
     * @param position Pozice materiálu
     * @return Materiál
     */
    Materials getMaterial(int position);

    /**
     * <h2>Setter</h2>
     * @param material Materiál
     */
    void addMaterial(Materials material);
}
