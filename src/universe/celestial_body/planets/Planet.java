package universe.celestial_body.planets;

import universe.celestial_body.CelestialBody;

public abstract class Planet extends CelestialBody {
    private String planetClass;
    private int size;
    private double diameter;
    private double orbitPeriod;
    private double rotationPeriod;
    private double gravity;
    private double temperature;
    private boolean hasAtmosphere;
    private boolean hasRing;

    public String getPlanetClass() {
        return planetClass;
    }

    public void setPlanetClass(String planetClass) {
        this.planetClass = planetClass;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getOrbitPeriod() {
        return orbitPeriod;
    }

    public void setOrbitPeriod(double orbitPeriod) {
        this.orbitPeriod = orbitPeriod;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(double rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }

    public boolean isHasRing() {
        return hasRing;
    }

    public void setHasRing(boolean hasRing) {
        this.hasRing = hasRing;
    }
}
