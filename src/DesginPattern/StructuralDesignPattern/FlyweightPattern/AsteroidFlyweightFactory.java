package DesginPattern.StructuralDesignPattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class AsteroidFlyweightFactory {
    private static final Map<String, AstroidFlyweight> map= new HashMap<>();

    public static AstroidFlyweight getAsteroidFlyweight(int length, int width, int weight, String color, String texture){
        String key = length + " | " + width + " | " + weight + " | " + color + " | " + texture;
        if(!map.containsKey(key)){
            map.put(key, new AstroidFlyweight(length, width, weight, color, texture));
        }
        return map.get(key);
    }

    public static int getFactorySize(){
        return map.size();
    }
}
