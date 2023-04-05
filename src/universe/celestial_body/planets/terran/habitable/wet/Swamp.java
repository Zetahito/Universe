package universe.celestial_body.planets.terran.habitable.wet;

import universe.enums.KardashevLevel;

public class Swamp extends Wet {
    @Override
    public boolean hasCivilisation() {
        return false;
    }

    @Override
    public KardashevLevel civilisationLevel() {
        return null;
    }

    @Override
    public void existInRealUniverse() {

    }

    @Override
    public void form() {

    }

    @Override
    public boolean isFormed() {
        return false;
    }
}
