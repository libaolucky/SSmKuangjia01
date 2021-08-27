package spring18Zuoye;
//浏览器类  用CGlib的代理模式
public class LiuLanqi1 {
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
