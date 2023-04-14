package universe.celestial_body.nebulas;

import universe.celestial_body.CelestialBody;
import universe.enums.Materials;
import universe.interfaces.Materiable;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Mlhovina</h1>
 * Mezihvězdné mračno prachových částic a plynů.
 * Mají velikost od 0.1 LY do 1000 LY
 * @author Jakub Štych
 * @version 14.4.2023
 */
public abstract class Nebula extends CelestialBody implements Materiable {

    /**
     * <h3>Krása mlhoviny</h3>
     * Všechny mlhoviny jsou krásné.
     */
    final boolean isBeautiful = true;

    /**
     * <h3>Kolekce materiálů mlhoviny</h3>
     * Každý materiál, který se nachází v mlhovině.
     * @see #getMaterial(int) Getter
     * @see #addMaterial(Materials) Setter
     */
    private List<Materials> materials = new ArrayList<>();

    /**
     * <h3>Hustota mlhoviny</h3>
     * Mezi 100 až 10 000 částic na centimentr čtvereční.
     * @see #getDensity() Getter
     * @see #setDensity(int) Setter
     */
    private int density;

    /**
     * <h2>Getter mlhoviny</h2>
     * Vrátí požadovaný materiál.
     * @param position Pozice materiálu
     * @return Materiál
     * @see #materials
     */
    @Override
    public Materials getMaterial(int position) {
        return materials.get(position);
    }

    /**
     * <h2>Setter mlhoviny</h2>
     * Přidá materiál do kolekce materiálů.
     * @param material Materiál
     * @see #materials
     */
    @Override
    public void addMaterial(Materials material) {
        materials.add(material);
    }

    /**
     * <h2>Getter mlhoviny</h2>
     * @return Hustota mlhoviny
     * @see #density
     */
    public int getDensity() {
        return density;
    }

    /**
     * <h2>Setter mlhoviny</h2>
     * @param density Hustota mlhoviny
     * @see #density
     */
    public void setDensity(int density) {
        this.density = density;
    }
}
