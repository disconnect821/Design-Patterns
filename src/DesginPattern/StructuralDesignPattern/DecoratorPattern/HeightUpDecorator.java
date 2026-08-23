package DesginPattern.StructuralDesignPattern.DecoratorPattern;

public class HeightUpDecorator extends Decorator {
    public HeightUpDecorator(Character character) {
        super(character);
    }

    @Override
    public String getAbility() {
        return character.getAbility() + "Tall Height,";
    }
}
