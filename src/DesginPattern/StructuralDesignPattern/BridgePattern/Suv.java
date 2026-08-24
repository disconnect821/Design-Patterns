package DesginPattern.StructuralDesignPattern.BridgePattern;

public class Suv extends CarType{
    public Suv(Engine e){
        super(e);
    }
    @Override
    public void startEngine() {
        System.out.println("SUV ");
        e.start();
    }
}
