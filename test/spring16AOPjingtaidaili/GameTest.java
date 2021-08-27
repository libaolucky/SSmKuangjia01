package spring16AOPjingtaidaili;

import org.junit.Test;

public class GameTest {
    //测试静态代理
    @Test
    public void test01(){
        Game wangzhe=new Game();
       JiaSuQi xunYou=new JiaSuQi();
       xunYou.setGame(wangzhe); //set注入，王者 注入了 迅游，迅游依赖了王者 ，迅游
        xunYou.conNet();
    }
}
