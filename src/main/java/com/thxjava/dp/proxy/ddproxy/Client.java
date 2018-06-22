package com.thxjava.dp.proxy.ddproxy;

import com.thxjava.dp.proxy.dproxy.AdminService;
import com.thxjava.dp.proxy.dproxy.UserService;

public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        UserService userService = (UserService) ServiceProxyFactory.getProxy("com.thxjava.dp.proxy.dproxy.UserServiceImpl");
        System.out.println("---------------");
        userService.delUser();
        System.out.println("------------------------");
        AdminService as = (AdminService) ServiceProxyFactory.getProxy("com.thxjava.dp.proxy.dproxy.AdminServiceImpl");
        System.out.println("---------------");
        as.addAdmin();
    }

}
