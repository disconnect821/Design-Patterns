package DesginPattern.CreationalPattern.SingletonPattern;

public class SingletonClass {
    private static SingletonClass object;

    private SingletonClass(){
        System.out.println("First instance created");
    }
    public static SingletonClass getInstance(){
        if(object==null){
            object = new SingletonClass();
        }
        return object;
    }
}
