package universe.celestial_body.planets.terran.habitable.frozen;

import universe.celestial_body.planets.terran.habitable.HabitablePlanet;
import universe.enums.PlanetaryFeature;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Studená planeta</h1>
 * Kamenná planeta s převládajícím studeným podnebím.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public abstract class Frozen extends HabitablePlanet {

    /**
     * <h3>Typ studené planety</h3>
     * @see Aeolian Větrná planeta
     * @see Alpine Vysokohorská planeta
     * @see Antarctic Antarktická planeta
     * @see Arctic Arktická planeta
     * @see Basalt Bazaltová planeta
     * @see Bog Bažinatá planeta
     * @see Boreal Subpolární planeta
     * @see Cryoflora Kryoflórová planeta
     * @see DuneForest Planeta dunových lesů
     * @see Frigid Mrazivá planeta
     * @see Glacial Glaciální planeta
     * @see Glaciovolcanic Planeta vulkanických ledovců
     * @see Highland Vysočinská planeta
     * @see Iceberg Ledovcová planeta
     * @see Lanthanide Lanthanoidská planeta
     * @see Lichen Lišejníková planeta
     * @see Mud Blátivá planeta
     * @see Mycelium Podhoubní planeta
     * @see Snow Sněžná planeta
     * @see Storm Bouřlivá planeta
     * @see Tundra Tundrová planeta
     * @see #getFrozenPlanetType() Getter
     * @see #setFrozenPlanetType(String) Setter
     */
    private String frozenPlanetType;

    /**
     * <h3>Kolekce planetárních rysů studené planety</h3>
     * @see PlanetaryFeature Možné rysy suché planety
     */
    private List<PlanetaryFeature> frozenPlanetFeature = new ArrayList<>();

    /**
     * <h2>Getter studené planety</h2>
     * @return Typ studené planety
     * @see #frozenPlanetType
     */
    public String getFrozenPlanetType() {
        return frozenPlanetType;
    }

    /**
     * <h2>Setter studené planety</h2>
     * @param frozenPlanetType Typ studené planety
     * @see #frozenPlanetType
     */
    public void setFrozenPlanetType(String frozenPlanetType) {
        this.frozenPlanetType = frozenPlanetType;
    }

    /**
     * <h2>Getter studené planety</h2>
     * @return Kolekce planetárních rysů
     * @see #frozenPlanetFeature
     */
    public List<PlanetaryFeature> getFrozenPlanetFeature() {
        return frozenPlanetFeature;
    }

    /**
     * <h2>Setter studené planety</h2>
     * @param frozenPlanetFeature Kolekce planetárních rysů
     * @see #frozenPlanetFeature
     */
    public void setFrozenPlanetFeature(List<PlanetaryFeature> frozenPlanetFeature) {
        this.frozenPlanetFeature = frozenPlanetFeature;
    }

    /**
     * <h2>Getter studené planety</h2>
     * @param position Pozice v kolekci planetárních rysů
     * @return Planetární rys
     * @see #frozenPlanetFeature
     */
    public String getSelectedPlanetaryFeature(int position) {
        return frozenPlanetFeature.get(position).toString();
    }

    /**
     * <h2>Setter studené planety</h2>
     * @param planetaryFeature Planetární rys
     * @see #frozenPlanetFeature
     */
    public void setSelectedPlanetaryFeature(PlanetaryFeature planetaryFeature) {
        this.frozenPlanetFeature.add(planetaryFeature);
    }
}
