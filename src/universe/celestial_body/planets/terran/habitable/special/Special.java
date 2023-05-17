package universe.celestial_body.planets.terran.habitable.special;

import universe.celestial_body.planets.terran.habitable.HabitablePlanet;
import universe.enums.PlanetaryFeature;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Speciální planeta</h1>
 * Kamenná planeta, která nespadá do žádné jiné kategorie.
 * @author Jakub Štych
 * @version 22.4.2023
 */
public abstract class Special extends HabitablePlanet {

    /**
     * <h3>Typ speciální planety</h3>
     * @see Acid Kyselinová planeta
     * @see Ammonia Amoniaková planeta
     * @see Archive Archivová planeta
     * @see Ash Popelová planeta
     * @see CoreTap Planeta s odhaleným jádrem
     * @see Crucible Žíhací planeta
     * @see Crystal Krystalová planeta
     * @see EcoArcology Ekologická ekumenopole
     * @see Ecumenopolis Ekumenopolis
     * @see Floating Vznášející se planeta
     * @see Gaia Planeta gaia
     * @see Hive Úlová planeta
     * @see Hycean Hyceánová planeta
     * @see Methane Metanová planeta
     * @see Necro Mrtvá planeta
     * @see Nomad Nomádská planeta
     * @see Radiotrophic Radiotropická planeta
     * @see Relic Reliktní planeta
     * @see Scrapyard Skládková planeta
     * @see Stripmine Planeta povrchového dolu
     * @see Sulfur Sírová planeta
     * @see TechnoOrganic Techno-organická planeta
     * @see TidallyLocked Planeta ve vázané rotaci
     * @see Tomb Zničená planeta
     * @see ToxicWasteland Toxicky pustá planeta
     */
    private String specialPlanetType;

    /**
     * <h3>Kolekce planetárních rysů speciální planety</h3>
     * @see PlanetaryFeature Možné rysy vlhké planety
     */
    private List<PlanetaryFeature> specialPlanetFeature = new ArrayList<>();

    /**
     * <h2>Getter speciální planety</h2>
     * @return Typ speciální planety
     * @see #specialPlanetType
     */
    public String getSpecialPlanetType() {
        return specialPlanetType;
    }

    /**
     * <h2>Setter speciální planety</h2>
     * @param specialPlanetType Typ speciální planety
     * @see #specialPlanetType
     */
    public void setSpecialPlanetType(String specialPlanetType) {
        this.specialPlanetType = specialPlanetType;
    }

    /**
     * <h2>Getter speciální planety</h2>
     * @return Kolekce planetárních rysů
     * @see #specialPlanetFeature
     */
    public List<PlanetaryFeature> getSpecialPlanetFeature() {
        return specialPlanetFeature;
    }

    /**
     * <h2>Setter speciální planety</h2>
     * @param specialPlanetFeature Kolekce planetárních rysů
     * @see #specialPlanetFeature
     */
    public void setSpecialPlanetFeature(List<PlanetaryFeature> specialPlanetFeature) {
        this.specialPlanetFeature = specialPlanetFeature;
    }

    /**
     * <h2>Getter speciální planety</h2>
     * @param position Pozice v kolekci planetárních rysů
     * @return Planetární rys
     * @see #specialPlanetFeature
     */
    public String getSelectedPlanetaryFeature(int position) {
        return specialPlanetFeature.get(position).toString();
    }

    /**
     * <h2>Setter speciální planety</h2>
     * @param planetaryFeature Planetární rys
     * @see #specialPlanetFeature
     */
    public void setSelectedPlanetaryFeature(PlanetaryFeature planetaryFeature) {
        this.specialPlanetFeature.add(planetaryFeature);
    }
}
