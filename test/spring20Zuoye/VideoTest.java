package spring20Zuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VideoTest {
    //测试目的： 把message的切面  次要业务 融合在主要业务的  reg里面去
    // 用spring 去实现
    @Test
    public void test01() {
        String xml = "spring20Zuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        VideoService videoService=ac.getBean("videoService",VideoService.class);
//        videoService.boFang();  前置 --播放
//        System.out.println("===============");
//        videoService.suspend();  后置 -- 暂停
//        System.out.println("===============");
//        videoService.ZhuanMoney();  环绕 -- 转金币
        videoService.lost();  //异常通知和最终通知  -- 视频丢失
    }

    }
