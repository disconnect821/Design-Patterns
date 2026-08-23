package DesginPattern.StructuralDesignPattern.DecoratorPattern;

abstract class Decorator implements Character{
    Character character;
    public Decorator(Character character){
        this.character = character;
    }
}
