package spring20AOP01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

// 通知类   ，都统称为 切面类
public class MessageAspect {
    public void sendMsg(){
        System.out.println("给顾客发送了一条通知！！！！");
    }
    // 环绕 通知的切面
    public void roundMsg(ProceedingJoinPoint pj){
        //我是上面的
        sendMsg();
        //目标方法
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //我是下面的
        System.out.println("我记录了转账记录");

    }

    //异常
    public  void sendMsgError(JoinPoint joinPoint,Exception e){
        System.out.println("异常通知");
    }
    //最终的通知
    public void finalMsg(){
        System.out.println(" =================== " );
        System.out.println("最终的通知");
    }
}
