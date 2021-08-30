package spring21Zuoye;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("videoAspect")   //切面类
@Aspect  // 切面注解
public class VideoAspect {
    @Pointcut("execution(* spring21Zuoye.*.*(..) )")
    public void pt(){
        System.out.println("切入点表达式");
    }
//    @Before("pt()")
//    public void beforeMsg(){
//        System.out.println("前置通知: 让我们来插播一条广告！！");
//    }

    @AfterReturning("pt()")
    public void afterMsg(){
        System.out.println("后置通知 -- 亲, 办理会员可以看vip");
    }

//    @Around("pt()")  //环绕通知
//    public void aroundMsg(ProceedingJoinPoint joinPoint){
//        //我是上面的
//        System.out.println("来让我们先验证一下吧！");
//        try {
//            Object proceed = joinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        //我是下面的
//        System.out.println("转账成功");
//    }

    // 异常通知
    @AfterThrowing(value="pt()",throwing="e")
    public void throwing(JoinPoint joinPoint, Exception e){
        System.out.println(" 异常通知 " );
        System.out.println("视频已失踪,推荐您看其他同类视频.");
    }
    //最终通知
    @After("pt()")
    public void afterFinal(){
        System.out.println(" =================== " );
        System.out.println("我们已给管理员的邮箱发 异常信息");
        System.out.println("最终的通知");
    }

}
