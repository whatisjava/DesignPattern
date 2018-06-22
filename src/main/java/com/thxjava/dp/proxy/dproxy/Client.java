package com.thxjava.dp.proxy.dproxy;

public class Client {
    public static void main(String[] args) {
        UserService userService = UserServiceProxyFactory.getProxy();
        System.out.println(userService.getClass().getName());
        userService.addUser();
        userService.delUser();
    }
}
