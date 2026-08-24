package DesginPattern.StructuralDesignPattern.BridgePattern;

public abstract class CarType {
    Engine e;

    protected CarType(Engine e) {
        this.e = e;
    }

    public abstract void startEngine();
}
