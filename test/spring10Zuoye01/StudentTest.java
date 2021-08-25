package spring10Zuoye01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test01(){
        String xml="spring10Zuoye/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        Student student=ac.getBean("student",Student.class);
        System.out.println("student = " + student);

    }
}
