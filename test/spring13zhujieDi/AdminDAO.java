package spring13zhujieDi;

import org.springframework.stereotype.Repository;

@Repository
public class AdminDAO {
    public void selectAll(){
        System.out.println("我是dao层 负责数据的 查询全部");
    }
}
