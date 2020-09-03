package com.malong.patterns;

/**
 * 抽象工厂
 * 提供一个创建一系列相关或相互依赖的对象的接口，而无需指定他们具体的类
 * <p>
 * 抽象产品 具体产品
 * 工厂接口 具体工厂
 * <p>
 * tip：创建多种产品
 */
public class AbstractFactory {
    public static void main(String[] args) {
//        Factory factory1 = new Factory1();
//        ProductA productA1 = factory1.createProductA();
//        ProductB productB1 = factory1.createProductB();
//        Factory factory2 = new Factory2();
//        ProductA productA2 = factory2.createProductA();
//        ProductB productB2 = factory2.createProductB();
    }
}
//
//// 抽象产品：汽车
//abstract class ProductA {
//}
//
//// 具体产品A1：Toyota汽车
//class ProductA1 extends ProductA {
//}
//// 具体产品A2：Benz汽车
//class ProductA2 extends ProductA {
//}
//
//// 抽象产品类B：飞机
//abstract class ProductB {
//}
//// 具体产品B1：Toyota飞机
//class ProductB1 extends ProductB {
//}
//// 具体产品B2：Benz飞机
//class ProductB2 extends ProductB {
//}
//
//// 工厂接口
//interface Factory {
//    ProductA createProductA();// 创建汽车
//
//    ProductB createProductB();// 创建飞机
//}
//// 具体工厂Toyota
//class Factory1 implements Factory {
//
//    public ProductA createProductA() {
//        return new ProductA1();
//    }
//
//    public ProductB createProductB() {
//        return new ProductB1();
//    }
//}
//// 具体工厂奔驰
//class Factory2 implements Factory {
//    public ProductA createProductA() {
//        return new ProductA2();
//    }
//
//    public ProductB createProductB() {
//        return new ProductB2();
//    }
//}