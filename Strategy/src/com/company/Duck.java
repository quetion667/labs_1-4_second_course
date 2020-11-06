package com.company;

public abstract class Duck {
    //переменны объявляются с типом интерфейса поведения
    FlyBehavior flyBehavior;
    QuckBehavior quckBehavior;

    public Duck()
    {

    }
    public abstract void display();


    // методы , заменяют Квак и Флай
    public void performQuack()
    {
        quckBehavior.quack();
    }
    public void  performFly()
    {
        flyBehavior.fly();
    }
    public void DoSomethingElse()
    {
        System.out.println("Все ducks плавают и так!");
    }

    public void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }
    public  void setQuckBehavior(QuckBehavior qb)
    {
        quckBehavior = qb;
    }
}
