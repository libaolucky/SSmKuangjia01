package spring10Zuoye01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentELTest {

    //使用spring 的el表达式  读取 bean 的属性值 的测试类
    @Test
    public void test01(){
        String xml="spring10Zuoye/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        StudentEL studentEL=ac.getBean("studentEl",StudentEL.class);
        System.out.println("studentEL = " + studentEL);

    }
}
