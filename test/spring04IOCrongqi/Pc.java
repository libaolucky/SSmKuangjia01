package spring04IOCrongqi;

public class Pc {
    //出生后的构造方法
    public Pc(){
        System.out.println(" 无参构造，就是对象一诞生 就会 执行的方法，比如：人一出生就会哭，这个哭就是构造方法 ");
        System.out.println(" 构造方法 是 对象一诞生就会执行的方法， 一般多用来 初始化自已的属性的，比如颜色" );
    }
    //对象  初始化方法
    public void initShow(){
        System.out.println("开机，，，，，");
        System.out.println("初始化方法 是 对象一诞生就会执行的方法 和构造方法不同的是，他多用 直接调用自已的方法");
    }
    //周期中， 成年中，， 打 CF LOL
    public void playGame(){
        System.out.println("电脑的普通方法，用来打游戏的");
    }
    //对象的死亡方法，  参考  过滤器 ，servlet
    public void destroyObj(){
        System.out.println("电脑中毒了 ，， 被砸了，，地球爆炸了，这就电脑死亡执行的方法 ");
    }
}
