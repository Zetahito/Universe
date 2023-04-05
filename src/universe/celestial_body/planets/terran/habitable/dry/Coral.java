package universe.celestial_body.planets.terran.habitable.dry;

import universe.enums.KardashevLevel;

public class Coral extends Dry {
    @Override
    public boolean hasCivilisation() {
        return false;
    }

    @Override
    public KardashevLevel civilisationLevel() {
        return null;
    }
}
