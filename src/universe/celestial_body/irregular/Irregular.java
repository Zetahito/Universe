package universe.celestial_body.irregular;

import universe.celestial_body.CelestialBody;
import universe.enums.Materials;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Nepravidelné těleso</h1>
 * Těleso, které není přibližně kulovitého tvaru.
 * Často obíhá kolem hvězd na výstředních drahách.
 * Může být i měsícem planety.
 * @author Jakub Štych
 * @version 12.4.2023
 */
public abstract class Irregular extends CelestialBody {

    /**
     * <h3>Kolekce materiálů</h3>
     * Každý materiál, který se nachází v nepravidelném tělese
     * @see #getMaterial(int) Getter
     * @see #addMaterial(Materials) Setter
     */
    private final List<Materials> materials = new ArrayList<>();

    /**
     * <h3>Typ nepravidelného tělesa</h3>
     * @see Comet Kometa
     * @see Greeks Řekové
     * @see Minor Planetka
     * @see Trojans Trojané
     * @see #getType() Getter
     * @see #setType(String) Setter
     */
    private String type;

    /**
     * <h2>Getter nepravidelného tělesa</h2>
     * Vrátí požadovaný materiál
     * @param position Pozice materiálu
     * @return Materiál
     * @see #materials
     */
    public Materials getMaterial(int position) {
        return materials.get(position);
    }

    /**
     * <h2>Setter nepravidelného tělesa</h2>
     * Přidá materiál do kolekce materiálů
     * @param material Materiál
     * @see #materials
     */
    public void addMaterial(Materials material) {
        materials.add(material);
    }

    /**
     * <h2>Getter nepravidelného tělesa</h2>
     * @return Typ nepravidelného tělesa
     * @see #type
     */
    public String getType() {
        return type;
    }

    /**
     * <h2>Setter nepravidelného tělesa</h2>
     * @param type Typ nepravidelného tělesa
     * @see #type
     */
    public void setType(String type) {
        this.type = type;
    }
}
