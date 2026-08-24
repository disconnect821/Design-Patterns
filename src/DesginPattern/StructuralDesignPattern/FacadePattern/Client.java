package DesginPattern.StructuralDesignPattern.FacadePattern;

public class Client {
    public static void main(String[] args) {
        ApiGateway gateway = new ApiGateway();
        String fullUserDetail = gateway.getFullOrderDetails(12, 88);
        System.out.println(fullUserDetail);
    }
}
