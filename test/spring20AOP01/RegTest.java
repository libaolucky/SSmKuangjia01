package spring20AOP01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegTest {
    //测试目的： 把message的切面  次要业务 融合在主要业务的  reg里面去
    // 用spring 去实现
    @Test
    public void test01(){
    String xml="spring20AOP01/applicationContext.xml";
    ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
    RegService regService=ac.getBean("regService",RegService.class);
    regService.addUser();
        System.out.println(" =============== " );
    regService.loginUser();
        System.out.println(" =============== " );
       // int i=9/0;  必须要写在 主体业务的方法中
        regService.transMoney();

    }
}
