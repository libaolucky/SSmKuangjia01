package spring18Aopcglibdongtaidaili;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibFactory implements MethodInterceptor {
    private Man man;

    public CGlibFactory(){
        man=new Man();
    }
    //在医院 收集 DNA 中 生产子类
    public Man cglibCreator(){
        //1. 用字节码的增强器
        Enhancer enhancer=new Enhancer();
        //2.指定一个父类
        enhancer.setSuperclass(Man.class);
        //3.调用 工厂执行
        enhancer.setCallback(this);
        //4.创建
        return (Man) enhancer.create();
    }
    //  方法的拦截  实现他爹的梦想
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Integer integer= (Integer) method.invoke(man, objects);
        integer=integer+410;
        return integer;
    }


}
