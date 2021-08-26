package spring12zhujie;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component  叫做 通用注解
//@Component   //这个注解就相当于 xml里写了一个bean标签
//@Controller  //等于@Component  用于controller 层
//@Service  //等于@Component  用在service 层
//@Repository("ren")  // 可以起别名, 如果不起,那么这个id 就是 类名的首字母小写
@Repository  //等于@Component  用在dao 层，但是一般不用，因为 dao  有xml映射
   //@Component  @Controller  @Service  @Repository  四大注解
@Scope("prototype") // 加这个 就是 原型/多例   //<bean id="Human" class="spring04IOCrongqi.Pc" scope="prototype"></bean>
@Lazy  //加上这个 是懒加载
public class Human {
    public Human(){
        System.out.println("男人对象诞生了" );
    }

    @PostConstruct  //构造器之前的方法， 意思就是 生命周期的方法
   //<bean id="pc" class="spring04IOCrongqi.Pc"  init-method="initShow"></bean>
    public void initShow(){
        System.out.println("大哭 。。。。。");
    }

    @PreDestroy //  死亡方法 <bean id="pc" class="spring04IOCrongqi.Pc" destroy-method="destroyObj"></bean>
    public void destroy(){
        System.out.println("死前的遗嘱，，，，");
    }

}
