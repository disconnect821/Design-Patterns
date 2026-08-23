package DesginPattern.StructuralDesignPattern.ProxyPattern;

public class RealImage implements Image{
    private final String filePath;

    public RealImage(String filePath) {
        //Heavy operation
        this.filePath = filePath;
        System.out.println("Fetching image from path");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Error while creating NPC");
        }
    }

    @Override
    public void display() {
        System.out.println("Rendering image from " + filePath);
    }
}
