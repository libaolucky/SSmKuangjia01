package spring10Zuoye03;
//新建2个类  一个 键盘   一个 cpu  使用xml 写出他们之间的依赖
// 键盘类 --主体
public class Keyboard {
    private Cpu cpu;

    //用  autowire  自动注入的方法
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Keyboard(){
        System.out.println(" 键盘对象诞生了" );
    }
    //有参   <constructor-arg index="0"> -----通过下标的构造参数方法
//    public Keyboard(Cpu cpu){
//        this.cpu=cpu;
//    }

    public void Dazi(){
        System.out.println("可以打字了");
        cpu.Controller();
    }
}
