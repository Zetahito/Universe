package universe.celestial_body.planets.terran.habitable.special;

import universe.enums.KardashevLevel;

public class Superhabitable extends Special {
    @Override
    public boolean hasCivilisation() {
        return false;
    }

    @Override
    public KardashevLevel civilisationLevel() {
        return null;
    }
}
