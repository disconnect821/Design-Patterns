package DesginPattern.StructuralDesignPattern.DecoratorPattern;

public class SpeedUpDecorator extends Decorator{
    public SpeedUpDecorator(Character character) {
        super(character);
    }
    @Override
    public String getAbility() {
        return character.getAbility() + " High Speed, ";
    }
}
