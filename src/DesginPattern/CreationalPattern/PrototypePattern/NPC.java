package DesginPattern.CreationalPattern.PrototypePattern;

public class NPC implements Cloneable<NPC>{
    public String name;
    public int health;

    //Heavy operation when new object is created.
    public NPC(String name, int health){
        this.name = name;
        this.health = health;

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Error while creating NPC");
        }
    }

    //Shallow copy
    //Copy data of Primitives type will be a shallow copy

    //Deep Copy (when copying Immutable object, once change in one object will
    // make changes in every cloned object),
    //So create new object of data when cloning object.

    // like this.array = new ArrayList<>(list.of(array));
    private NPC(NPC exsitingNPC){
        this.name = exsitingNPC.name;
        this.health = exsitingNPC.health;
    }


    @Override
    public NPC customizedClone() {
        return new NPC(this);
    }
}
