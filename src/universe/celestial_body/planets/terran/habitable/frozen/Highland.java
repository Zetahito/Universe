package universe.celestial_body.planets.terran.habitable.frozen;

import universe.enums.KardashevLevel;

public class Highland extends Frozen {
    @Override
    public boolean hasCivilisation() {
        return false;
    }

    @Override
    public KardashevLevel civilisationLevel() {
        return null;
    }
}
