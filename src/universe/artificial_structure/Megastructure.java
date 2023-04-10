package universe.artificial_structure;

import universe.Universe;
import universe.interfaces.Buildable;

/**
 * <h1>Megastruktura</h1>
 * Artificiální struktura existující ve vesmíru.
 * @author Jakub Štych
 * @version 10.4.2023
 */
public abstract class Megastructure extends Universe implements Buildable {

    /**
     * <h2>Getter</h2>
     *
     * @return Vybudování
     */
    @Override
    public boolean isBuilt() {
        return false;
    }

    /**
     * <h2>Setter</h2>
     *
     * @param built Vybudování
     */
    @Override
    public void setBuilt(boolean built) {

    }

    /**
     * <h2>Vybuduje umělou strukturu</h2>
     */
    @Override
    public void build() {

    }
}
