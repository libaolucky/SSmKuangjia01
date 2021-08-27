package spring18Zuoye;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibFactory implements MethodInterceptor {
    private LiuLanqi1 liuLanqi1;

    public CglibFactory(){
        liuLanqi1=new LiuLanqi1();
    }
    //在浏览器中  产生子类
    public LiuLanqi1 cglibCreator(){
        //1. 用字节码的增强器
        Enhancer enhancer=new Enhancer();
        //2.指定一个父类
        enhancer.setSuperclass(LiuLanqi1.class);
        //3.调用 工厂执行
        enhancer.setCallback(this);
        //4.创建
       LiuLanqi1 ll= (LiuLanqi1) enhancer.create();
        return ll;
    }

    //  方法的拦截  实现浏览器可以访问的目的
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       Boolean b= (Boolean) method.invoke(liuLanqi1,objects);
         b=true;
        return b;
    }
}
