package spring21AOP02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit注解  使用Spring单元测试
@ContextConfiguration(locations = "classpath:spring21AOP02/applicationContext.xml") //创建工厂注解
public class AccountTest {
   @Autowired
    private AccountService accountService;

    @Test
    public void test01(){
       accountService.findAll();
   }
}
