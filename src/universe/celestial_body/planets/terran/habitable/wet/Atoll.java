package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.KardashevLevel;

public class Atoll extends Wet {
    @Override
    public boolean hasCivilisation() {
        return false;
    }

    @Override
    public KardashevLevel civilisationLevel() {
        return null;
    }
}
