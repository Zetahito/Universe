package universe.celestial_body.stars;

import universe.celestial_body.CelestialBody;
import universe.interfaces.Formable;

public abstract class Star extends CelestialBody implements Formable {

    private long size;

    private int temperature;

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    Star() {

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
