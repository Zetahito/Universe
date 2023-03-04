package interfaces;

public interface Galaxy extends CelestialBody {

    String type = "";

    long numberOfStars = 0L;
    String[] namesOfStars = {};

    int numberOfCivilisations = 0;
    String[] namesOfCivilisations = {};
}
