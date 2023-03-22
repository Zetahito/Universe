package galaxies;

import interfaces.Galaxy;

public abstract class Spiral implements Galaxy {

    protected String type;
    protected long numberOfStars = 0L;
    protected String[] namesOfStars = {};
    protected int numberOfCivilisations = 0;
    protected String[] namesOfCivilisations = {};
}
