package spring21Zuoye;
// AOP 注解版的
public interface Video1Service {
    //视频的播放
    public void boFang();
    // 视频的暂停
    public void  suspend();
    //转金币
    public void ZhuanMoney();
    //视频 找不到了  丢了
    public void lost();
}
