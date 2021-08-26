package spring06DI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring06DiTest {
    // 刚刚 是以 set 的方式注入的，这叫做  set注入 ！！！ 常用的
    @Test
    public void test01(){
        String xml="spring06DI/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);

        //拿主体 人
        Person person=ac.getBean("person",Person.class);
       // System.out.println("person = " + person);
        person.paly();

        //思考题：现在  2 个类之间的 关系
        // 人  。。。。 手机，电脑 ，psp,小霸王

        //思考题： 如何 提高 依赖 效率 ？？？
        //使用接口， 同时 也解耦了代码，让依赖关系由 实体类依赖 变成  抽象的依赖，依赖关系就解开了
        //同理： 也解释  java 3层架构中， 为什么 要用到 接口，，，，

        //作业1. spring 的思维导图
        //作业2. 新建一个 主体 人类，再建一个接口 叫做吃的， 实现类  方面面，火腿肠，螺蛳粉
        // 测试他们之间的依赖 ！！！

        //oop 面向接口的编程
    }
}
