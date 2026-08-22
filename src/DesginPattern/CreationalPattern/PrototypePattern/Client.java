package DesginPattern.CreationalPattern.PrototypePattern;

public class Client {
    public static void main(String[] args) {
        long systemStartTime = System.currentTimeMillis();
        NPC npc1 = new NPC("Fist", 100);
        NPC npc2 = new NPC("Second", 100);
        NPC npc3 = new NPC("Third", 100);
        NPC npc4 = new NPC("Fourth", 100);
        NPC npc5 = new NPC("Fifth", 100);
        long systemEndTime = System.currentTimeMillis();

        System.out.println("Time taken to create NPCs : " + (systemEndTime - systemStartTime));

        systemStartTime = System.currentTimeMillis();
        NPC npc6 = new NPC("Sixth", 100);
        NPC npc7 = npc6.customizedClone();
        NPC npc8 = npc6.customizedClone();
        NPC npc9 = npc6.customizedClone();
        NPC npc10 = npc6.customizedClone();
        systemEndTime = System.currentTimeMillis();

        System.out.println("Time Taken to create NPCs with Clone : " + (systemEndTime - systemStartTime));
    }
}
