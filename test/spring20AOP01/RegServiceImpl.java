package spring20AOP01;

public class RegServiceImpl implements RegService {
    @Override
    public void addUser() {
        System.out.println("调用了dao，这个是会员的注册功能");
        int i=9/0;  //必须要写在 主体业务的方法中
        //注册完毕之后，应当给 顾客 发送一个短信，提示您已经注册了什么什么？
        // 订单。。。消费。。。 违规。。。短信通知！！
    }

    @Override
    public void loginUser() {
        System.out.println("调用了dao，这个是会员的登录功能");
    }

    @Override
    public void transMoney() {
        System.out.println(" 转账=====" );
    }
}
