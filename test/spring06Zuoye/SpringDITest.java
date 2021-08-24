package spring06Zuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {
    //作业1. spring 的思维导图
    //作业2. 新建一个 主体 人类，再建一个接口 叫做吃的， 实现类  方面面，火腿肠，螺蛳粉
    // 测试他们之间的依赖 ！！！

    @Test
    public void test01() {
        String xml = "spring06Zuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        //拿主体 人
        Person person = ac.getBean("Person", Person.class);
        person.personeat();

    }
}
