package spring21Zuoye;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring21Zuoye/applicationContext.xml")
public class VideoTest {
    @Autowired
    private Video1Service video1Service;

    @Test
    public void test01(){
        video1Service.boFang();  // 前置
        System.out.println("==========");
        video1Service.suspend();  // 后置
        System.out.println("==========");
        video1Service.ZhuanMoney(); //环绕通知
       // video1Service.lost(); 异常通知 和最终通知
    }
}
