package spring16AOPjingtaidaili;

import org.junit.Test;

public class BeiGaorenTest {
    //测试静态代理
    @Test
    public void test01(){
       BeiGaoren bei=new BeiGaoren();
       Lvshi lvshi=new Lvshi();
       lvshi.setBeiGaoren(bei);
        lvshi.conNet();
    }
}
