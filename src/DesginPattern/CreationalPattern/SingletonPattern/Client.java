package DesginPattern.CreationalPattern.SingletonPattern;

public class Client {
    //or directly initialize object eagarly
//    SingletonClass singleInstance = SingletonClass.getInstance();
    public static void main(String[] args) {
        SingletonClass ob = SingletonClass.getInstance();
        SingletonClass ob2 = SingletonClass.getInstance();
    }
}
