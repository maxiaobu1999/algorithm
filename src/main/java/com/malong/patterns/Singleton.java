package com.malong.patterns;

/**
 * 单例
 * 保证一个类只有一个实例，并提供一个访问它的全局访问点
 *
 * 指令重排序：1、配置内存2、赋初始值3、堆区对象地址赋值。 执行顺序可能重排序。
 * volatile：1、修改变量值后，对其他线程立即可见；2、禁止指令重排序
 *          保证线程可见性、有序性，不保证原子性。
 */
public class Singleton {

    // 1、懒汉延时加载 2、static类共享单例
    // 3、volatile禁止指令重排序，修改可见
    private volatile static Singleton sInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (sInstance == null) {// 减少不必要的同步
            synchronized (Singleton.class) {// 同步类锁
                if (sInstance == null) {//
                    sInstance = new Singleton();
                }
            }
        }
        return sInstance;
    }
}
