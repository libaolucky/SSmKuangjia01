package spring06DI;
// 我是手机 对象，  我是次要的  ，我是被主体 人类来使用，来依赖的
public class Phone implements PlayGame{
    public Phone(){
        System.out.println("手机对象诞生了");
    }
    public void game(){
        System.out.println("手机 打游戏");
    }
}
