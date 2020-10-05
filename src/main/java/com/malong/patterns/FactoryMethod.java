package com.malong.patterns;

/**
 * 工厂方法
 * 定义一个创建对象的接口，让子类决定实例化哪个类。使一个类的实例化延迟到子类
 */
public class FactoryMethod {
}

abstract class Product {
    abstract void use();
}

class ProductA extends Product {
    void use() {

    }
}

class ProductB extends Product {
    void use(){

    }

}

interface Factory {
    Product createProduct();
}

class FactoryA implements Factory {
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements Factory {
    public Product createProduct() {
        return new ProductB();
    }
}


class Client {
    public void sample() {
        FactoryA factoryA = new FactoryA();
        Product productA = factoryA.createProduct();

        Factory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
    }
}
