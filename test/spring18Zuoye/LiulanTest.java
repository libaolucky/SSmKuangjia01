package spring18Zuoye;

import org.junit.Test;

public class LiulanTest {
    @Test
    public void test01(){
        LiuLanqi1 vpn=new CglibFactory().cglibCreator();//多态中的 父类 指向 子类对象，本质是儿子的对象
        Boolean i=vpn.Fangwen();
        System.out.println("用了vpn可以访问谷歌了：" + i);
    }
}
