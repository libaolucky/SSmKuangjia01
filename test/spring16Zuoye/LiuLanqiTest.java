package spring16Zuoye;

import org.junit.Test;

public class LiuLanqiTest {
    //测试静态代理
    @Test
    public void test01(){
        LiuLanqi liuLanqi=new LiuLanqi();
        Vpn vpn=new Vpn();
        vpn.setLiuLanqi(liuLanqi);
        vpn.Fangwen();

    }
}
