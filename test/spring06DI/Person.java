package spring06DI;
// 人 是 我们的主体  ，主要的类 ，他需要依赖 手机
public class Person {
    public Person() {
        System.out.println("人在容器中诞生了");
    }
    //接口都是抽象的
    private PlayGame playGame;

    public void setPlayGame(PlayGame playGame) {
        this.playGame = playGame;
    }

    //    private Phone phone; //人依赖了手机，所以 人就拥有了手机
//    private Psp psp; //人 依赖了 psp
//
//    public void setPhone(Phone phone) {  //set 是暴露给别人看的，让别人给你东西的
//        this.phone = phone;
//    }
//
//    public void setPsp(Psp psp) {
//        this.psp = psp;
//    }
//
    public void paly() {
        System.out.println("人要玩手机的方法");
        playGame.game();
//        //phone.game();
//        psp.game();
//    }
    }
}
