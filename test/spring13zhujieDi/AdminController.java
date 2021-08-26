package spring13zhujieDi;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AdminController {
    @Resource
    private AdminService adminService; //接口的调用，面向抽象

    //查询全部
    public void selectAll(){
        //controller 层  service 层 --- 即：controller层依赖了service层
        adminService.selectAll();
    }
}
