package DesginPattern.StructuralDesignPattern.BridgePattern;

public class Client {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();

        CarType suv = new Suv(petrolEngine);
        CarType hatchBack = new HatchBack(dieselEngine);

        suv.startEngine();
        System.out.println();
        hatchBack.startEngine();
    }
}
