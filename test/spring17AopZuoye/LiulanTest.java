package spring17AopZuoye;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

// jdk中的动态代理， 省去了代理对象 ， 代理对象 由程序员手写，变成了统一的jdk中的类，直接调用即可
public class LiulanTest {
    @Test
    public void text01(){
        Liulan liu=new Liulan();
      Vpn jdkProxy=(Vpn) Proxy.newProxyInstance(liu.getClass().getClassLoader(),
              liu.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Boolean bool= (Boolean) method.invoke(liu,args);
                            bool=true;
                        return bool;
                    }
                }
        );
      Boolean i=jdkProxy.Fangwen();
        System.out.println("vpn可以访问谷歌：" + i);
    }
}
