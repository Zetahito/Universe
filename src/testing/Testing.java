package testing;

import universe.celestial_body.galaxies.Galaxy;
import universe.celestial_body.galaxies.Irregular;
import universe.celestial_body.galaxies.Spiral;

public class Testing {
    public static void main(String[] args) {

        // ---===--- MLÉČNÁ DRÁHA ---===--- //

        Galaxy milkyWay = new Spiral();

        milkyWay.setWidth(105_700L);
        milkyWay.setHeight(107_500L);
        milkyWay.setVolume(1_200L);
        milkyWay.setWeight(1_500_000_000_000_000_000L);
        milkyWay.setNumberOfCivilisations(1L);
        milkyWay.addNameOfCivilisation("Humankind");
        milkyWay.setNumberOfStars(100_000_000_000L);
        milkyWay.addNameOfStar("Sun");

        // ---===--- ANDROMEDA ---===--- //

        Galaxy andromeda = new Spiral();

        andromeda.setWidth(220_000L);
        andromeda.setHeight(220_500L);
        andromeda.setVolume(1_700L);
        andromeda.setWeight(1_230_000_000_000_000_000L);
        andromeda.setNumberOfCivilisations(0L);
        andromeda.setNumberOfStars(1_000_000_000_000L);

        // ---===--- VELKÝ MAGELLANŮV OBLAK ---===--- //

        Galaxy largeMagellanicCloud = new Irregular();

        largeMagellanicCloud.setWidth(14_000L);
        largeMagellanicCloud.setHeight(14_500L);
        largeMagellanicCloud.setVolume(800L);
        largeMagellanicCloud.setWeight(10_000_000_000_000_000L);
        largeMagellanicCloud.setNumberOfCivilisations(0L);
        largeMagellanicCloud.setNumberOfStars(30_000_000_000L);

        // ---===--- MALÝ MAGELLANŮV OBLAK ---===--- //

        Galaxy smallMagellanicCloud = new Irregular();

        smallMagellanicCloud.setWidth(7_000L);
        smallMagellanicCloud.setHeight(6_700L);
        smallMagellanicCloud.setVolume(500L);
        smallMagellanicCloud.setWeight(6_500_000_000_000_000L);
        smallMagellanicCloud.setNumberOfCivilisations(0L);
        smallMagellanicCloud.setNumberOfStars(3_000_000_000L);
    }
}
