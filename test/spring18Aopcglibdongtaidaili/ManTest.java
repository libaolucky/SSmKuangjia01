package spring18Aopcglibdongtaidaili;

import org.junit.Test;

public class ManTest {
    @Test
    public void test01(){
        Man erzi=new CGlibFactory().cglibCreator(); //多态中的 父类 指向 子类对象，本质是儿子的对象
        int score=erzi.dream();
        System.out.println("score = " + score);
    }
}
