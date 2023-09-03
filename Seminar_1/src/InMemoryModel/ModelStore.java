package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
public class ModelStore implements iModelChanger{
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private iModelChangedObserver changeObservers;

    public ModelStore(iModelChangedObserver changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new PoligonalModel();
        this.scenes = new Scene();
        this.flashes = new Flash();
        this.cameras = new Camera();
    }
    public Scene getScena(int n) {
        return this.scenes;
    }

    @Override
    public void notifyChange(iModelChanger sender) {

    }
}
