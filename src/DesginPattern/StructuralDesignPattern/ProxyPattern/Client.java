package DesginPattern.StructuralDesignPattern.ProxyPattern;

public class Client {
    public static void main(String[] args) {

        //When directly creating image
        long startTime = System.currentTimeMillis();
        Image withoutProxy = new RealImage("/home/Image");
        withoutProxy.display();
        long endTime  = System.currentTimeMillis();
        System.out.println("Image object creation took : " + (endTime - startTime));

        //With proxy, lazy initialization
        startTime = System.currentTimeMillis();
        Image withProxy = new ProxyImage("Home/Image");
        endTime = System.currentTimeMillis();
        System.out.println("Proxy creation time : " + ( endTime - startTime));
        withProxy.display();
    }
}
