package universe.celestial_body.irregular;

import universe.celestial_body.CelestialBody;
import universe.enums.Materials;

import java.util.ArrayList;
import java.util.List;

public abstract class Irregual extends CelestialBody {
    private final List<Materials> materials = new ArrayList<>();

    private String type;

    public void addMaterial(Materials material) {
        materials.add(material);
    }

    public Materials getMaterial(int position) {
        return materials.get(position);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
