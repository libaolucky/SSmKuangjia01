package spring10Zuoye01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class ReadPropertiesTest {
        @Test
        public void test01(){ 
            String xml="spring10Zuoye/applicationContext.xml";
            ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
           Properties Dbla=ac.getBean("Dbla", Properties.class);
            System.out.println("Dbla = " + Dbla);
        }
}
