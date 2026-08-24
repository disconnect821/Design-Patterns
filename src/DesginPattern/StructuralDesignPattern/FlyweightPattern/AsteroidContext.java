package DesginPattern.StructuralDesignPattern.FlyweightPattern;


public class AsteroidContext {
    private AstroidFlyweight astroid;
    private int velocity;
    private int positionX;
    private int positionY;

    public AsteroidContext(AstroidFlyweight astroid, int positionX, int positionY, int velocity){
        this.positionX = positionX;
        this.positionY = positionY;
        this.velocity = velocity;
        this.astroid = astroid;
    }

    public void render(){
        astroid.render(positionX, positionY, velocity);
    }


}
