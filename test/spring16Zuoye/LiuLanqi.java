package spring16Zuoye;
// 浏览器类 不能访问谷歌
public class LiuLanqi {
    private Boolean  google=false;

    public Boolean getGoogle() {
        return google;
    }

    public void setGoogle(Boolean google) {
        this.google = google;
    }

    public void Fangwen(){
        System.out.println(" 浏览器不能访问谷歌:" + this.getGoogle());
    }
}
