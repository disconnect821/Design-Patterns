package DesginPattern.StructuralDesignPattern.FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class SpaceGame {
    private List<AsteroidContext> astroidFlyweightList;
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

            AstroidFlyweight flyweightAsteroid = AsteroidFlyweightFactory.getAsteroidFlyweight(
                    length[type],width[type],weight[type],
                    colors[type],texture[type]
            );

            astroidFlyweightList.add(new AsteroidContext(flyweightAsteroid,
                    100 + i * 2,
                    100 + i *3,
                    50));

        }

        System.out.println("Created " + count + " asteroid ");
        System.out.println("Total flyweight objects " + AsteroidFlyweightFactory.getFactorySize() + " asteroid ");

    }
    public void renderAll(){
        System.out.println("---------- Rendering only 5 asteroid ------------");
        for (int i = 0; i< Math.min(5,astroidFlyweightList.size());i++){
            astroidFlyweightList.get(i).render();
        }
    }
}
