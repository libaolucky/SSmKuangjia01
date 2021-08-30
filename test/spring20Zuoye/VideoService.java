package spring20Zuoye;
// xml 版本的视频
public interface VideoService {
    /* 需要给 视频 的 播放 ,   暂停 ,  转金币,   视频找不见了,        设置   5大切面通知.
播放的时候, 提示 前置通知, 是 插播广告.   点击暂停, 给与一个后置通知, 提示说 亲, 办理会员可以看vip
点击  转金币的 先 提示 验证一下,  , 金币转成功后, 提示 转账成功,
当点击的视频找不见了, 提示 视频已失踪,推荐您看其他同类视频.
并, 给 管理员的邮箱发 异常信息.
    * */
    //视频的播放
    public void boFang();
    // 视频的暂停
    public void  suspend();
    //转金币
    public void ZhuanMoney();
    //视频 找不到了  丢了
    public void lost();

}
