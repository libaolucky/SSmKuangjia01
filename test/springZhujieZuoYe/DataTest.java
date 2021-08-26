package springZhujieZuoYe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataTest {
    @Test
    public void tetx01(){
        String xml="springZhujieZuoYe/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        DataBean  dataBean=ac.getBean("dataBean",DataBean.class);
        System.out.println("dataBean = " + dataBean);
    }
}
