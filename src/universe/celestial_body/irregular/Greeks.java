package universe.celestial_body.irregular;

import universe.celestial_body.planets.Planet;

/**
 * <h1>Řekové</h1>
 * Planetky uvízlé v gravitačním zajetí planety a hvězdy.
 * Obíhají kolem libračního bolu L4 60 stupňů před planetou.
 * Dráha je v rezonanci 1:1 a je dlouhodobě stabilní.
 * @see Trojans Trojáné
 * @author Jakub Štych
 * @version 13.4.2023
 */
public class Greeks extends Irregular {

    /**
     * <h3>Počet Řeků</h3>
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
     * <h2>Konstruktor Řeků</h2>
     */
    Greeks() {
        setType("Greeks");
    }

    /**
     * <h2>Getter Řeků</h2>
     * @return Počet Řeků
     * @see #numberOf
     */
    public int getNumberOf() {
        return numberOf;
    }

    /**
     * <h2>Setter Řeků</h2>
     * @param numberOf Počet Řeků
     * @see #numberOf
     */
    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    /**
     * <h2>Getter Řeků</h2>
     * @return Centrální planeta
     * @see #planet
     */
    public Planet getPlanet() {
        return planet;
    }

    /**
     * <h2>Setter Řeků</h2>
     * @param planet Centrální planeta
     * @see #planet
     */
    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
}
