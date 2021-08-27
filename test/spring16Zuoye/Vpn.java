package spring16Zuoye;
//浏览器  不能访问谷歌, false,,      vpn 可以访问谷歌  true ,
public class Vpn {   //代理类  主体类
    private LiuLanqi liuLanqi;
    private Boolean Fw;

    public void Fangwen(){
        //这个方法 要承接  目标对象的方法
        Boolean fangw=liuLanqi.getGoogle();
        this.Fw=true;
        System.out.println("用了vpn就可以访问谷歌:" + this.Fw);
    }

    public LiuLanqi getLiuLanqi() {
        return liuLanqi;
    }

    public void setLiuLanqi(LiuLanqi liuLanqi) {
        this.liuLanqi = liuLanqi;
    }

    public Boolean getFw() {
        return Fw;
    }

    public void setFw(Boolean fw) {
        Fw = fw;
    }
}
