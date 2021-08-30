package spring20Zuoye;

public class VideoServiceImpl implements VideoService {
    @Override
    public void boFang() {
        System.out.println("调用了dao,这个是视频播放功能");
    }

    @Override
    public void suspend() {
        System.out.println("调用了dao,这个是视频暂停功能");
    }

    @Override
    public void ZhuanMoney() {
        System.out.println("调用了dao,这个是转金币功能");
    }

    @Override
    public void lost() {
        System.out.println("这个是视频不见了，丢失了---");
        int i=1/0;
    }
}
