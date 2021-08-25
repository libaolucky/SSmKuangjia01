package spring08autowire;

public class Computer implements GameInterface{
    public Computer(){
        System.out.println("电脑对象被创建");
    }
    public void game(){
        System.out.println("电脑打LOL");
    }
}
