# DesignPattern
# 创建型设计模式：
***
#### Singleton Pattern（单例模式）
#### Prototype Pattern（原型模式）
用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
#### Factory Method Pattern（工厂方法模式）
#### Abstract Factory Pattern（抽象工厂模式）
#### Builder Pattern（建造者模式）
# 结构型设计模式：
#### Adapter Pattern（适配器模式）
将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作。
#### Bridge Pattern（桥接模式）
#### Composite Pattern（组合模式）
组合模式的环境为：
    在设计中想表示对象的“部分－整体”层次结构；希望用户忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象。
看下组合模式的组成。
1. 抽象构件角色Component：它为组合中的对象声明接口，也可以为共有接口实现缺省行为。
2. 树叶构件角色Leaf：在组合中表示叶节点对象——没有子节点，实现抽象构件角色声明的接口。
3. 树枝构件角色Composite：在组合中表示分支节点对象——有子节点，实现抽象构件角色声明的接口；存储子部件。
#### Decorator Pattern（装饰者模式）
#### Façade Pattern（外观模式）
#### Flyweight Pattern（[享元模式](http://blog.csdn.net/tanggao1314/article/details/50615033)）
Flyweight在拳击比赛中指最轻量级，即“蝇量级”或“雨量级”，这里选择使用“享元模式”的意译，是因为这样更能反映模式的用意。
享元模式是对象的结构模式。享元模式以共享的方式高效地支持大量的细粒度对象。 
也就是说在一个系统中如果有多个相同的对象，那么只共享一份就可以了，不必每个都去实例化一个对象。
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
***
#### Chain of Responsibility Pattern（[职责链模式](http://www.cnblogs.com/java-my-life/archive/2012/05/28/2516865.html)）
责任链模式是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其
下家的引用而连接起来形成一条链。请求在这个链上传递，直到链上的某一个对象
决定处理此请求。发出这个请求的客户端并不知道链上的哪一个对象最终处理这个
请求，这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。
<font color='red' size='5'>存在问题：职责链存在并行吗？可以像拓扑结构那样处理职责吗？</font>
#### Command Pattern（命令模式）
  命令模式把一个请求或者操作封装到一个对象中。命令模式允许系统使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。  
命令模式是对命令的封装。命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象。
每一个命令都是一个操作：请求的一方发出请求要求执行一个操作；接收的一方收到请求，并执行操作。命令模式允许请求的一方和接收的一方独立开来，使得请求的一方不必知道接收请求的一方的接口，更不必知道请求是怎么被接收，以及操作是否被执行、何时被执行，以及是怎么被执行的。
命令允许请求的一方和接收请求的一方能够独立演化，从而具有以下的优点：
1. 命令模式使新的命令很容易地被加入到系统里。
2. 允许接收请求的一方决定是否要否决请求。
3. 能较容易地设计一个命令队列。
4. 可以容易地实现对请求的撤销和恢复。
5. 在需要的情况下，可以较容易地将命令记入日志。
#### Interpreter Pattern（解释器模式）
解释器模式是类的行为模式。给定一个语言之后，解释器模式可以定义出其文法的一种表示，并同时提供一个解释器。
客户端可以使用这个解释器来解释这个语言中的句子。  
模式所涉及的角色如下所示：
1. 抽象表达式(Expression)角色：声明一个所有的具体表达式角色都需要实现的抽象接口。这个接口主要是一个interpret()方法，称做解释操作。
2. 终结符表达式(Terminal Expression)角色：实现了抽象表达式角色所要求的接口，主要是一个interpret()方法；文法中的每一个终结符都有一个具体终结表达式与之相对应。比如有一个简单的公式R=R1+R2，在里面R1和R2就是终结符，对应的解析R1和R2的解释器就是终结符表达式。
3. 非终结符表达式(Nonterminal Expression)角色：文法中的每一条规则都需要一个具体的非终结符表达式，非终结符表达式一般是文法中的运算符或者其他关键字，比如公式R=R1+R2中，“+"就是非终结符，解析“+”的解释器就是一个非终结符表达式。
4. 环境(Context)角色：这个角色的任务一般是用来存放文法中各个终结符所对应的具体值，比如R=R1+R2，我们给R1赋值100，给R2赋值200。这些信息需要存放到环境角色中，很多情况下我们使用Map来充当环境角色就足够了。
#### Iterator Pattern（迭代器模式）
迭代器模式（Iterator），提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。  
1. 迭代器角色（Iterator）:定义遍历元素所需要的方法，一般来说会有这么三个方法：取得下一个元素的方法next()，判断是否遍历结束的方法hasNext()），移出当前对象的方法remove(),
2. 具体迭代器角色（Concrete Iterator）：实现迭代器接口中定义的方法，完成集合的迭代。
3. 容器角色(Aggregate):  一般是一个接口，提供一个iterator()方法，例如java中的Collection接口，List接口，Set接口等
4. 具体容器角色（ConcreteAggregate）：就是抽象容器的具体实现类，比如List接口的有序列表实现ArrayList，List接口的链表实现LinkList，Set接口的哈希列表的实现HashSet等。
#### Mediator Pattern（中介者模式）
用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，
从而使其耦合松散，而且可以独立地改变它们之间的交互。
#### Memento Pattern（备忘录模式）
#### Observer Pattern（观察者模式）
#### State Pattern（状态模式）
#### Strategy Pattern（策略模式）
策略模式属于对象的行为模式。其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。策略模式使得算法可以在不影响到客户端的情况下发生变化。
#### Template Method Pattern（[模板方法模式](http://www.cnblogs.com/java-my-life/archive/2012/05/14/2495235.html)）
模板方法模式是类的行为模式。准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些
抽象方法，从而对剩余的逻辑有不同的实现。这就是模板方法模式的用意。
模板方法中的方法可以分为两大类：模板方法和基本方法。

　　模板方法
　　一个模板方法是定义在抽象类中的，把基本操作方法组合在一起形成一个总算法或一个总行为的方法。

　　一个抽象类可以有任意多个模板方法，而不限于一个。每一个模板方法都可以调用任意多个具体方法。

　　基本方法
　　基本方法又可以分为三种：抽象方法(Abstract Method)、具体方法(Concrete Method)和钩子方法(Hook Method)。

　　●　　抽象方法：一个抽象方法由抽象类声明，由具体子类实现。在Java语言里抽象方法以abstract关键字标示。

　　●　　具体方法：一个具体方法由抽象类声明并实现，而子类并不实现或置换。

　　●　　钩子方法：一个钩子方法由抽象类声明并实现，而子类会加以扩展。通常抽象类给出的实现是一个空实现，作为方法的默认实现。
#### Visitor Pattern（[访问者模式](http://www.cnblogs.com/java-my-life/archive/2012/06/14/2545381.html)）
访问者模式是对象的行为模式。访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，
接受这个操作的数据结构则可以保持不变。类比：医院开的方子，可以被划价员计算医药费，可以被药房抓药

模式优缺点
   优点
      1、使得新增新的访问操作变得更加简单。
      2、能够使得用户在不修改现有类的层次结构下，定义该类层次结构的操作。
      3、将有关元素对象的访问行为集中到一个访问者对象中，而不是分散搞一个个的元素类中。
   缺点
      1、增加新的元素类很困难。在访问者模式中，每增加一个新的元素类都意味着要在抽象访问者角色中增加一个新的抽象操作，并在每一个具体访问者类中增加相应的具体操作，违背了“开闭原则”的要求。
      2、破坏封装。当采用访问者模式的时候，就会打破组合类的封装。
      3、比较难理解。貌似是最难的设计模式了。
 模式适用场景
       1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。
       2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作“污染”这些对象的类，也不希望在增加新操作时修改这些类。
  模式总结
       1、访问者模式封装了对象结构元素之上的操作，使得新增元素的操作变得非常简单。所以它比较适用于那么对象结构很少变化的类。
       2、访问者模式中对象结构存储了不同类型的元素对象，以供不同访问者访问。
