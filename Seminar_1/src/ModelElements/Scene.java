package ModelElements;

import Stuff.Type;
public class Scene {
    public int id;
    public PoligonalModel models;
    public Flash flashes;
    public Camera camera;

    public Scene(int id, PoligonalModel models, Flash flashes, Camera camera) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public Scene() {

    }

    public Type method1(Type type) {
        return null;
    }
    public Type method2(Type type1, Type type2) {
        return null;
    }
}
