package spring06Zuoye;

// 人 是 我们的主体  ，主要的类 ，他需要依赖 手机
public class Person {
    public Person() {
        System.out.println("人在容器中诞生了");
    }
    //接口都是抽象的
    private Eats eats;

    public void setEats(Eats eats) {
        this.eats = eats;
    }

    public void personeat() {
        System.out.println("人要吃好吃的");
        eats.eat();
    }
}
