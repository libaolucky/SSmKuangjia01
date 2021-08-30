package spring20Zuoye;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

// 通知类   ，都统称为 切面类
public class MessageAspect {
    public void sendMsg(){
        System.out.println("前置通知: 让我们来插播一条广告！！");
    }
    public void sendMsg1(){
        System.out.println("后置通知 -- 亲, 办理会员可以看vip");
    }
    // 环绕 通知的切面
    public void roundMsg(ProceedingJoinPoint pj){
        //我是上面的
        System.out.println("来让我们先验证一下吧！");
        //目标方法
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //我是下面的
        System.out.println("转账成功");
    }

    //异常
    public  void sendMsgError(JoinPoint joinPoint,Exception e){
        System.out.println("视频已失踪,推荐您看其他同类视频.");
    }
    //最终的通知
    public void finalMsg(){
        System.out.println(" =================== " );
        System.out.println("我们已给管理员的邮箱发 异常信息");
        System.out.println("最终的通知");
    }
}
