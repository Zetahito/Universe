package universe.celestial_body;

import universe.Universe;
import universe.interfaces.Formable;

public abstract class CelestialBody extends Universe implements Formable {
    long width = 0L;
    long height = 0L;
    long volume = 0L;
}
