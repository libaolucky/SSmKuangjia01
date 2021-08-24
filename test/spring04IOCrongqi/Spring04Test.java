package spring04IOCrongqi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;
/**
 * 容器的由来：根据刚刚的 工厂模式 得出，一个项目中又打脸的对象
 * 那么 大量的对象需要管理，如果管理更方便  使用容器，把对象  统一处理
 *
 * Spring中的容器  IOC
 * IOC 有个思想：    控制反转  什么叫控制，给对象属性赋值的权利
 * 什么叫反转：   事情本来 由A控制，现在变为B控制
 *
 * 容器是负责控制反转的
 * */

public class Spring04Test {
   
//        创建对象的 创建三种方式
//            传统的对象，没有 容器的统一管理
    @Test
    public void test01(){
        //因为 我们说  spring 容器  是管理对象
        //对象的 创建  有几种方式呢？
        // 传统的创建对象  有3种方式
        //第一种： new 关键字
        Date date=new Date();  //1.创建对象方法
        System.out.println("date = " + date);
        System.out.println("========================");
        //第二种： static 静态方法创建   静态工厂创建
        Calendar calendar=Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println("========================");

        //第三种： 实例工厂的创建
        Date time=calendar.getTime();
        System.out.println("time = " + time);
        System.out.println("以上就是传统创建  对象的3重方式");

        //传统的创建对象 的 缺点：
        //1.控制权  在哪里？   现在  在test01 的方法中
        //2.对象创建的  执行顺序  有谁控制？   test01 的方法中

        // 下面  使用 spring 如何 管理对象 （创建，销毁，使用）
        

    }
    
    /*
    * spring 容器管理  对象 ，看spring 如何创建对象
    * */
     @Test
    public void test02(){
         //1.加载  容器的xml
         String xml="spring04IOCrongqi/applicationContext.xml";
         //2.xml 文件 一经加载，所有的对象 都已经诞生了  这就和 传统的test01 创建对象不一样了
         //达到了 对象 的统一管理， 也就是 对象的创建的 控制权  被spring 拿走了
         //以前是 new 出来的  对象 ，现在是 Spring 通过反射 拿到了 对象，这就是 控制权的改变 ，这就是控制反转
      ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
         System.out.println("ac = " + ac);
         //如何  取得对象
         Date date=ac.getBean("date",Date.class);
         System.out.println("date = " + date);

         //作用域：测试 spring 默认 创建对象是否是单例模式
         Pc pc1=ac.getBean("pc",Pc.class);
         Pc pc2=ac.getBean("pc",Pc.class);
         System.out.println("pc1 = " + pc1);
         System.out.println("pc2 = " + pc2);
         System.out.println(pc1==pc2);  //默认是单例模式 ， == 为true
         //加上  scope="prototype"  == 为false  默认是singleton
         ((ClassPathXmlApplicationContext) ac).close();  //关闭容器

         //如果  生命周期中使用  原型模式，那么 无法调用  对象 的摧毁方法 ，所以少用原型模式


     }
}
