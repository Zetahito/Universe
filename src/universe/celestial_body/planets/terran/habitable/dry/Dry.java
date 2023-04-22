package universe.celestial_body.planets.terran.habitable.dry;

import universe.celestial_body.planets.terran.habitable.HabitablePlanet;
import universe.enums.PlanetaryFeature;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Suchá planeta</h1>
 * Kamenná planeta s převládajícím suchým podnebím.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public abstract class Dry extends HabitablePlanet {

    /**
     * <h3>Typ suché planety</h3>
     * //TODO
     */
    private String dryPlanetType;

    /**
     * <h3>Kolekce planetárních rysů suché planety</h3>
     * @see PlanetaryFeature Možné rysy suché planety
     */
    private List<PlanetaryFeature> dryPlanetFeature = new ArrayList<>();

    /**
     * <h2>Getter suché planety</h2>
     * @return Typ suché planety
     * @see #dryPlanetType
     */
    public String getDryPlanetType() {
        return dryPlanetType;
    }

    /**
     * <h2>Setter suché planety</h2>
     * @param dryPlanetType Typ suché planety
     * @see #dryPlanetType
     */
    public void setDryPlanetType(String dryPlanetType) {
        this.dryPlanetType = dryPlanetType;
    }

    /**
     * <h2>Getter suché planety</h2>
     * @return Kolekce planetárních rysů
     * @see #dryPlanetFeature
     */
    public List<PlanetaryFeature> getDryPlanetFeature() {
        return dryPlanetFeature;
    }

    /**
     * <h2>Setter suché planety</h2>
     * @param dryPlanetFeature Kolekce planetárních rysů
     * @see #dryPlanetFeature
     */
    public void setDryPlanetFeature(List<PlanetaryFeature> dryPlanetFeature) {
        this.dryPlanetFeature = dryPlanetFeature;
    }

    /**
     * <h2>Getter suché planety</h2>
     * @param position Pozice v kolekci planetárních rysů
     * @return Planetární rys
     * @see #dryPlanetFeature
     */
    public String getSelectedPlanetaryFeature(int position) {
        return dryPlanetFeature.get(position).toString();
    }

    /**
     * <h2>Setter suché planety</h2>
     * @param planetaryFeature Planetární rys
     * @see #dryPlanetFeature
     */
    public void setSelectedPlanetaryFeature(PlanetaryFeature planetaryFeature) {
        this.dryPlanetFeature.add(planetaryFeature);
    }
}
