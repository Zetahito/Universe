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
     * //TODO
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
