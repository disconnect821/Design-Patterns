package DesginPattern.StructuralDesignPattern.FlyweightPattern;


public class AstroidFlyweight {
    private final int length;
    private final int width;
    private final int weight;
    private final String color;
    private final String texture;

    public AstroidFlyweight(int length, int width, int weight, String color, String texture){
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.color =color;
        this.texture = texture;
    }

    public void render(int posX, int posY, int velocity){
        System.out.println("Asteroid with length : " + length +
                " width : " + width +
                " weight : " + weight +
                " color : " + color +
                " texture : " + texture +
                " X-position : " + posX +
                " Y-position : " + posY +
                " Velocity : " + velocity);
    }


}
