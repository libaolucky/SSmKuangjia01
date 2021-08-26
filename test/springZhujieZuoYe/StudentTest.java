package springZhujieZuoYe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void text01(){
        String xml="springZhujieZuoYe/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
       StudentController studentController=ac.getBean("studentController",StudentController.class);
        System.out.println("studentController = " + studentController);
        studentController.selectAll();
        studentController.Add();
        studentController.del();
        studentController.upd();
    }
}
