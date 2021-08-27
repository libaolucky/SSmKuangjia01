package spring16AOPjingtaidaili;
/*
*  代理对象，用于 增强 目标对象的方法
*   游戏  讯飞加速器
*   王宝强  宋吉吉
*   浏览器  vpn
*   被告人   律师
* */
//主体类
public class JiaSuQi {
   private Game game; //代理类才是主体类，代理对象依赖了目标对象，代理对象包含了目标对象
   private  int ws;

    //代理对象的方法，而且  必须 和目标 对象一样，因为 代理对象 也要目标对象的方法，不然怎么加速
    public void conNet() {
        //这个方法 要承接  目标对象的方法
        int wangsu = game.getWangSu();
        this.ws = wangsu - 400;
        System.out.println("现在打游戏的网速： " + this.ws);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }
}
