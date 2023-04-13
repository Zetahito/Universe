package universe.celestial_body.irregular;

import universe.celestial_body.planets.Planet;

/**
 * <h1>Trojáni</h1>
 * Planetky uvízlé v gravitačním zajetí planety a hvězdy.
 * Obíhají kolem libračního bolu L5 60 stupňů za planetou.
 * Dráha je v rezonanci 1:1 a je dlouhodobě stabilní.
 * @see Greeks Řekové
 * @author Jakub Štych
 * @version 13.4.2023
 */
public class Trojans extends Irregular {

    /**
     * <h3>Počet Trojánů</h3>
     * Až několik tisíc.
     * @see #getNumberOf() Getter
     * @see #setNumberOf(int) Setter
     */
    private int numberOf;

    /**
     * <h3>Centrální planeta</h3>
     * Obíhají v jejím libračním bodu L5 60 stupňů za ní
     * @see #getPlanet() Getter
     * @see #setPlanet(Planet) Setter
     */
    private Planet planet;

    /**
     * <h2>Konstruktor Trojánů</h2>
     */
    Trojans() {
        setType("Trojans");
    }

    /**
     * <h2>Getter Trojánů</h2>
     * @return Počet Trojánů
     * @see #numberOf
     */
    public int getNumberOf() {
        return numberOf;
    }

    /**
     * <h2>Setter Trojánů</h2>
     * @param numberOf Počet Trojánů
     * @see #numberOf
     */
    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    /**
     * <h2>Getter Trojánů</h2>
     * @return Centrální planeta
     * @see #planet
     */
    public Planet getPlanet() {
        return planet;
    }

    /**
     * <h2>Setter Trojánů</h2>
     * @param planet Centrální planeta
     * @see #planet
     */
    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
}
