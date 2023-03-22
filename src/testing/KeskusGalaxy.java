package testing;

import galaxies.Spiral;

public class KeskusGalaxy extends Spiral {

    @Override
    public boolean existInRealWorld() {
        return false;
    }

    @Override
    public void form() {
        this.type = "Spiral galaxy";
        this.numberOfStars = 1_530_000_000_000L;
        this.namesOfStars = new String[] {"Bol", "Palju Sarvi", "Zeta"};
        this.numberOfCivilisations = 1;
        this.namesOfCivilisations = new String[] {"Keskus"};
    }
}
