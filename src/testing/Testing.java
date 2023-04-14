package testing;

import universe.celestial_body.galaxies.Galaxy;
import universe.celestial_body.galaxies.Spiral;

public class Testing {
    public static void main(String[] args) {

        Galaxy milkyWay = new Spiral();

        milkyWay.setWidth(105_700L);
        milkyWay.setHeight(107_500L);
        milkyWay.setVolume(1_200L);
        milkyWay.setWeight(1_500_000_000_000_000_000L);

        milkyWay.setNumberOfCivilisations(1L);
        milkyWay.addNameOfCivilisation("Humankind");

        milkyWay.setNumberOfStars(1L);
        milkyWay.addNameOfStar("Sun");
    }
}
