package spring17AOPjdkdongtaidaili;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

// jdk中的动态代理， 省去了代理对象 ， 代理对象 由程序员手写，变成了统一的jdk中的类，直接调用即可
public class YouxiTest {
    @Test
    public void text01(){
        Youxi youxi=new Youxi();
      Conn jdkProxy=(Conn) Proxy.newProxyInstance(youxi.getClass().getClassLoader(),
                youxi.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Integer integer= (Integer) method.invoke(youxi,args);
                        if(integer!=null){
                            integer=60;
                        }
                        return integer;
                    }
                }
        );
      int i=jdkProxy.conNet();
        System.out.println("i = " + i);
    }
}
