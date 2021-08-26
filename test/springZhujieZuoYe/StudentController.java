package springZhujieZuoYe;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    //查询全部
    public void selectAll(){
        //controller 层  service 层 --- 即：controller层依赖了service层
        studentService.SelectAll();
    }
    public void Add(){
        //controller 层  service 层 --- 即：controller层依赖了service层
        studentService.add();
    }
    public void del(){
        //controller 层  service 层 --- 即：controller层依赖了service层
        studentService.Del();
    }
    public void upd(){
        //controller 层  service 层 --- 即：controller层依赖了service层
        studentService.Update();
    }
}
