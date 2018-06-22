package com.thxjava.dp.proxy;

public class Client {

    public static void main(String[] args) {
        AnyServiceImpl anyService = new AnyServiceImpl();
        ProxyService proxyService = new ProxyService(anyService);
        proxyService.doSomething();
    }

}
