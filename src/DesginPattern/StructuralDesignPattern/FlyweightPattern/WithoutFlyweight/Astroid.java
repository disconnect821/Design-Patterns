package DesginPattern.StructuralDesignPattern.FlyweightPattern.WithoutFlyweight;


public class Astroid {
    private final int length;
    private final int width;
    private final int weight;
    private final String color;
    private final String texture;

    private final int positionX;
    private final int positionY;
    private final int velocity;

    public Astroid(int length, int width, int weight, String color, String texture, int positionX, int positionY, int velocity){
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.color =color;
        this.texture = texture;
        this.positionX = positionX;
        this.positionY = positionY;
        this.velocity = velocity;
    }

    public void render(){
        System.out.println("Asteroid with length : " + length +
                " width : " + width +
                " weight : " + weight +
                " color : " + color +
                " texture : " + texture +
                " X-position : " + positionX +
                " Y-position : " + positionY +
                " Velocity : " + velocity);
    }


}
