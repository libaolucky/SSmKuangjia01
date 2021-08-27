package spring16AOPjingtaidaili;

public class BeiGaoren {
    private int yuyan=100;

    public int getYuyan() {
        return yuyan;
    }

    public void setYuyan(int yuyan) {
        this.yuyan = yuyan;
    }

    //目标对象的目的：  连接网速，目标对象 自身的方法  是不行的，想要不改变 源代码的基础上，增强这个方法
    public void conNet(){
        System.out.println("现在的语言能力值为 "+this.getYuyan());
    }
}
