package com.malong.patterns;

import java.util.HashSet;
import java.util.Set;

/**
 * 观察者
 * 定义一种一对多的依赖关系，当一个对象的状态发生改变，其他依赖于它的对象都会得到通知并且被自动更新
 */
public abstract class Observer {

    public abstract void update();
}

class ConcreteObserver extends Observer {
    public void update() {
        //...
    }
}


/** 被观察者 */
class Subject {
    private Set<Observer> mObservers = new HashSet<Observer>();

    void attch(Observer observer) {
        mObservers.add(observer);
    }

    void detach(Observer observer) {
        mObservers.remove(observer);
    }

    void update() {
        for (Observer observer : mObservers) {
            observer.update();
        }
    }

}

class Sample {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.attch(observer1);
        subject.attch(observer2);

        subject.update();

        subject.detach(observer1);
        subject.detach(observer2);
    }
}
