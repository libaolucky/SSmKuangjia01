package spring17AopZuoye;
//浏览器  用jdk的代理模式
public class Liulan implements Vpn {
    private Boolean  google=false;

    public Boolean getGoogle() {
        return google;
    }

    public void setGoogle(Boolean google) {
        this.google = google;
    }

    public Boolean Fangwen(){
        System.out.println(" 浏览器不能访问谷歌:" + google);
        return this.getGoogle();
    }
}
