package spring07Di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring07DiTest {
    //06 讲的是set注入， 07讲 构造器注入
    @Test
    public void test01(){
        String xml="spring07Di/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        People people=ac.getBean("people",People.class);
        people.play();
    }
}
