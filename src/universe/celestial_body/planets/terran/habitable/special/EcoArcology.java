package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.PlanetaryFeature;

/**
 * <h1>Ekologická ekumenopole</h1>
 * Kamenná planeta s dýchatelnou atmosférou složenou z dusíku a kyslíku.
 * Planeta je z půlky pohlcena městskou zástavbou a z půlky kontrolovanou přírodou v zahradách.
 * Město je velice ekologicky založené a ekosféra se přizpůsobila městské zástavbě.
 * Původní litosféra planety již není viditelná.
 * @author Jakub Štych
 * @version 17.5.2023
 */
public class EcoArcology extends Special {

    /**
     * <h2>Konstruktor ekologické ekumenopole</h2>
     */
    public EcoArcology() {
        setType("Terrestrial");
        setHabitablePlanetType("Special");
        setSpecialPlanetType("Eco-Arcology");

        setHabitability(100);

        setSelectedPlanetaryFeature(PlanetaryFeature.GARDEN);
        setSelectedPlanetaryFeature(PlanetaryFeature.ECOLOGICAL_CITY);
    }
}
