package DesginPattern.StructuralDesignPattern.BridgePattern;

public class HatchBack extends CarType{
    public HatchBack(Engine e){
        super(e);
    }
    @Override
    public void startEngine() {
        System.out.println("HatchBack ");
        e.start();
    }
}
