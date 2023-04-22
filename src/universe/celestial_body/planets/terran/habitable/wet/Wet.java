package universe.celestial_body.planets.terran.habitable.wet;


import universe.celestial_body.planets.terran.habitable.HabitablePlanet;
import universe.enums.PlanetaryFeature;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Vlhká planeta</h1>
 * Kamenná planeta s převládajícím vlhkým podnebím.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public abstract class Wet extends HabitablePlanet {

    /**
     * <h3>Typ vlhké planety</h3>
     * //TODO
     */
    private String wetPlanetType;

    /**
     * <h3>Kolekce planetárních rysů vlhké planety</h3>
     * @see PlanetaryFeature Možné rysy vlhké planety
     */
    private List<PlanetaryFeature> wetPlanetFeature = new ArrayList<>();

    /**
     * <h2>Getter vlhké planety</h2>
     * @return Typ vlhké planety
     * @see #wetPlanetType
     */
    public String getWetPlanetType() {
        return wetPlanetType;
    }

    /**
     * <h2>Setter vlhké planety</h2>
     * @param wetPlanetType Typ vlhké planety
     * @see #wetPlanetType
     */
    public void setWetPlanetType(String wetPlanetType) {
        this.wetPlanetType = wetPlanetType;
    }

    /**
     * <h2>Getter vlhké planety</h2>
     * @return Kolekce planetárních rysů
     * @see #wetPlanetFeature
     */
    public List<PlanetaryFeature> getWetPlanetFeature() {
        return wetPlanetFeature;
    }

    /**
     * <h2>Setter vlhké planety</h2>
     * @param wetPlanetFeature Kolekce planetárních rysů
     * @see #wetPlanetFeature
     */
    public void setWetPlanetFeature(List<PlanetaryFeature> wetPlanetFeature) {
        this.wetPlanetFeature = wetPlanetFeature;
    }

    /**
     * <h2>Getter vlhké planety</h2>
     * @param position Pozice v kolekci planetárních rysů
     * @return Planetární rys
     * @see #wetPlanetFeature
     */
    public String getSelectedPlanetaryFeature(int position) {
        return wetPlanetFeature.get(position).toString();
    }

    /**
     * <h2>Setter vlhké planety</h2>
     * @param planetaryFeature Planetární rys
     * @see #wetPlanetFeature
     */
    public void setSelectedPlanetaryFeature(PlanetaryFeature planetaryFeature) {
        this.wetPlanetFeature.add(planetaryFeature);
    }
}
