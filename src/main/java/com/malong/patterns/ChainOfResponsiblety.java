package com.malong.patterns;

/**
 * 责任链
 * 把多个对象连成一条链，并沿这条链传递请求，直到有一个对象处理这个请求位置。
 * 是多个对象都有机会处理请求，解耦请求的发送者与接收者
 */
public class ChainOfResponsiblety {
    public static void main(String[] args) {
        ConcreteHandler handler1 = new ConcreteHandler();
        ConcreteHandler handler2 = new ConcreteHandler();
        ConcreteHandler handler3 = new ConcreteHandler();

        handler1.next = handler2;
        handler2.next = handler3;

        handler1.handleRequest(1);

    }
}

/** 抽象拦截器 */
abstract class Handler {
    Handler next;

    abstract void handleRequest(int request);
}

/** 拦截器实现类 */
class ConcreteHandler extends Handler {
    void handleRequest(int request) {
        System.out.println("ConcreteHandler" + request + "获取请求");
        request++;
        // doSomethingBefore ...
        if (next != null)
            next.handleRequest(request);
        // doSomethingAfter ...
        request--;
        System.out.println("ConcreteHandler" + request + "获取响应结果");
    }
}

