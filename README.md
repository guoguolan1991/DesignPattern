# DesignPattern
# 创建型设计模式：
#### Singleton Pattern（单例模式）
#### Prototype Pattern（原型模式）
#### Factory Method Pattern（工厂方法模式）
#### Abstract Factory Pattern（抽象工厂模式）
#### Builder Pattern（建造者模式）
# 结构型设计模式：
#### Adapter Pattern（适配器模式）
将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作。
#### Bridge Pattern（桥接模式）
#### Composite Pattern（组合模式）
#### Decorator Pattern（装饰者模式）
#### Façade Pattern（外观模式）
#### Flyweight Pattern（享元模式）
#### Proxy Pattern（代理模式）
代理模式是常用的结构型设计模式之一，当无法直接访问某个对象或访问某个对象存在困难时可以通过一个代理对象来间接访问，为了保证客户端使用的透明性，
所访问的真实对象与代理对象需要实现相同的接口。

远程代理(Remote Proxy)

给一个位于不同的地址空间的对象提供一个本地的代理对象，这个不同的地址空间可以是在同一台主机中，也可是在另一台主机中，远程代理又称为大使(Ambassador)。

虚拟代理(Virtual Proxy)

如果需要创建一个资源消耗较大的对象，先创建一个消耗相对较小的对象来表示，真实对象只在需要时才会被真正创建。

保护代理(Protect Proxy)

控制对一个对象的访问，可以给不同的用户提供不同级别的使用权限。

缓冲代理(Cache Proxy)

为某一个目标操作的结果提供临时的存储空间，以便多个客户端可以共享这些结果。

智能引用代理(Smart Reference Proxy)

当一个对象被引用时，提供一些额外的操作，例如将对象被调用的次数记录下来等。
# 行为型设计模式：
#### Chain of Responsibility Pattern（职责链模式）
#### Command Pattern（命令模式）
#### Interpreter Pattern（解释器模式）
#### Iterator Pattern（迭代器模式）
#### Mediator Pattern（中介者模式）
#### Memento Pattern（备忘录模式）
#### Observer Pattern（观察者模式）
#### State Pattern（状态模式）
#### Strategy Pattern（策略模式）
策略模式属于对象的行为模式。其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。策略模式使得算法可以在不影响到客户端的情况下发生变化。
#### Template Method Pattern（模板方法模式）
#### Visitor Pattern（访问者模式）
