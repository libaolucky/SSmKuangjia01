package springZhujieZuoYe;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
    //全查
    public void selectAll(){
        System.out.println("我是dao层 负责数据的 查询全部");
    }
    //新增
    public void insert(){
        System.out.println("我是dao层 负责添加");
    }
    //删除
    public void del(){
        System.out.println("我是dao层 负责删除");
    }
    //修改
    public void update(){
        System.out.println("我是dao层 负责修改");
    }
}
