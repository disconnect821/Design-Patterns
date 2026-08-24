package DesginPattern.StructuralDesignPattern.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        //Compact example
        Character mario = new HeightUpDecorator(new SpeedUpDecorator(new MarioCharacter()));

        //One by one

        Character newMario = new MarioCharacter();
        System.out.println(newMario.getAbility());

        newMario = new HeightUpDecorator(newMario);
        System.out.println(newMario.getAbility());

        newMario = new SpeedUpDecorator(newMario);
        System.out.println(newMario.getAbility());
    }
}
