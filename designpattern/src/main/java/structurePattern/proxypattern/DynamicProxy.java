package structurePattern.proxypattern;

/**
 * Created by Miller on 2017/8/14 0014.
 * 动态代理类
 */

import java.lang.reflect.*;

/**
 * 动态创建代理对象，动态代理不需要实现接口，但是需要指定接口类型
 * 动态代理也叫做:JDK代理,接口代理

 JDK中生成代理对象的API
 代理类所在包:java.lang.reflect.Proxy
 JDK实现代理只需要使用newProxyInstance方法,但是该方法需要接收三个参数,完整的写法是:

 static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h )
 注意该方法是在Proxy类中是静态方法,且接收的三个参数依次为:

 ClassLoader loader,:指定当前目标对象使用类加载器,获取加载器的方法是固定的
 Class<?>[] interfaces,:目标对象实现的接口的类型,使用泛型方式确认类型
 InvocationHandler h:事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
 */
public class DynamicProxy {

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return java.lang.reflect.Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
                        System.out.println("proxy begin");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("proxy end");
                        return returnValue;
                    }
                }
        );
    }
}
















