package DesginPattern.StructuralDesignPattern.ProxyPattern;

public class ProxyImage implements Image{
    private RealImage realImage;
    private final String filePath;

    public ProxyImage(String filePath){
        this.filePath = filePath;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(filePath);
        }
        realImage.display();
    }
}
