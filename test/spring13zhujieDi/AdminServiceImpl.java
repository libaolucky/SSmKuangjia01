package spring13zhujieDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
    //@Resource  //相当于我们 xml中的注入 注解1： 这个注解是 tomcat提供的  byName
    @Autowired //注解2： 是spring提供的，多用这个，  byType
    private AdminDAO adminDAO;

    @Override
    public void selectAll() {
        //service层 调用了 dao层---> 即：service 依赖了 dao层
        adminDAO.selectAll();
    }
}
