package DesginPattern.StructuralDesignPattern.FlyweightPattern.WithoutFlyweight;


import java.util.ArrayList;
import java.util.List;

public class SpaceGame {
    private List<Astroid> astroidFlyweightList;
    public static void main(String[] args) {

        SpaceGame spaceGame = new SpaceGame();

        Runtime runtime = Runtime.getRuntime();
        System.gc();

        long before = runtime.totalMemory() - runtime.freeMemory();

        spaceGame.spawnAsteroid(1000000);

        System.gc();

        long after = runtime.totalMemory() - runtime.freeMemory();

        long usedMemory = after - before;

        System.out.println("Memory Used by asteroids : " + usedMemory/(1024.0*1024.0) + " MB");
        spaceGame.renderAll();
    }
    public void spawnAsteroid(int count){
        System.out.println("-------- Spawning Asteroid ------");

        astroidFlyweightList = new ArrayList<>();

        int[] length = {10,20,30};
        int[] width = {10,20,30};
        int[] weight = {10,20,30};
        String[] colors = {"Red" ,"Blue", "Green"};
        String[] texture = {"Hard","Soft","Soft Hard"};

        for(int i =0;i<count;i++){
            int type = i%3;

            astroidFlyweightList.add(new Astroid(
                    length[type],width[type],weight[type],
                    colors[type],texture[type],
                    100 + i * 2,
                    100 + i *3,
                    50));

        }

        System.out.println("--------- Created" + astroidFlyweightList.size() + " asteroid ----------");

    }
    public void renderAll(){
        System.out.println("---------- Rendering only 5 asteroid ------------");
        for (int i = 0; i< Math.min(5,astroidFlyweightList.size());i++){
            astroidFlyweightList.get(i).render();
        }
    }
}
