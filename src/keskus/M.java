package keskus;

import universe.celestial_body.galaxies.Galaxy;
import universe.celestial_body.galaxies.Spiral;
import universe.celestial_body.planets.Planet;
import universe.celestial_body.planets.terran.habitable.special.Ecumenopolis;
import universe.celestial_body.stars.Star;
import universe.celestial_body.stars.regular.TypeG;

public class M {
    public static void main(String[] args) {

        Star bol = new TypeG();
        bol.setSize(1_392_700L);
        bol.setTemperature(5_772);
        System.out.println(bol.getClass());

        Planet boletus = new Ecumenopolis();

        Galaxy keskus = new Spiral();

    }
}
