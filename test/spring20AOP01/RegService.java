package spring20AOP01;
//注册接口  主要接口
public interface RegService {
    // 注册一个会员
    public void addUser();  //切入点  spring20AOP01.RegService.addUser

    //登录之前，要有一个短信验证码
    public void loginUser();

    // 环绕通知 转账
    void transMoney();
}
