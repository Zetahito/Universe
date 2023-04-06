package universe.interfaces;

/**
 * <h1>Rozhraní existujících objektů</h1>
 * Implementují jej všechny existující objekty
 * Jedno z klíčových rozhraní
 * @author Jakub Štych
 * @version 6.4.2023
 */
public interface Existable {

    /**
     * <h2>Potvrdí nebo vyvrátí existenci v reálném vesmíru</h2>
     * <ul>
     *    <li><b>true</b> - Existuje v reálném vesmíru</li>
     *    <li><b>false</b> - Neexistuje v reálném vesmíru</li>
     *</ul>
     * @return Existence v reálném vesmíru
     */
    boolean isExistingInRealUniverse();
}
