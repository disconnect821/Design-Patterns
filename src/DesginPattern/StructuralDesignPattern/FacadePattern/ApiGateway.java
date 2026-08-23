package DesginPattern.StructuralDesignPattern.FacadePattern;

import DesginPattern.BehaviouralPattern.MediatorPattern.User;

public class ApiGateway {
    UserService userService;
    OrderService orderService;

    public ApiGateway(){
        this.orderService = new OrderService();
        this.userService = new UserService();
    }

    public String getFullOrderDetails(int userId, int orderId){
        String userDetail = userService.getUserDetails(userId);
        String orderDetail = orderService.getOrderDetails(orderId);

        return userDetail + "\n" + orderDetail;
    }
}
