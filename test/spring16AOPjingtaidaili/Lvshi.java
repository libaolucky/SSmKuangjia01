package spring16AOPjingtaidaili;

public class Lvshi {
    private BeiGaoren beiGaoren; //代理类才是主体类，代理对象依赖了目标对象，代理对象包含了目标对象
    private  int Yuyan;

    //代理对象的方法，而且  必须 和目标 对象一样，因为 代理对象 也要目标对象的方法，不然怎么加速
    public void conNet() {
        //这个方法 要承接  目标对象的方法
       int yy=beiGaoren.getYuyan();
        this.Yuyan=yy+300;
        System.out.println("现在有律师的加持，语言能力值为： " + this.Yuyan);
    }

    public BeiGaoren getBeiGaoren() {
        return beiGaoren;
    }

    public void setBeiGaoren(BeiGaoren beiGaoren) {
        this.beiGaoren = beiGaoren;
    }

    public int getYuyan() {
        return Yuyan;
    }

    public void setYuyan(int yuyan) {
        Yuyan = yuyan;
    }
}
