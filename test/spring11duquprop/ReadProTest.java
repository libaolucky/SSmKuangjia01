package spring11duquprop;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class ReadProTest {
    // 第一种 读取 properties
    @Test
    public void test01() {
        String xml = "spring11duquprop/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // 第二种读取 properties
    @Test
    public void test02() {
        String xml = "spring11duquprop/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource = ac.getBean("dataSource1", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //第三种  获取多种 属性为 string 没出来
    public void test03() {
        String xml = "spring11duquprop/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ReadPropertiesBean readPropertiesBean = ac.getBean("readPropertiesBean", ReadPropertiesBean.class);
        System.out.println("readPropertiesBean = " + readPropertiesBean);

    }
}
