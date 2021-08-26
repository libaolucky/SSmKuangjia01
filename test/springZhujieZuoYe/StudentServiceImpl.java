package springZhujieZuoYe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public void SelectAll() {
        studentDAO.selectAll();
    }

    @Override
    public void add() {
        studentDAO.insert();
    }

    @Override
    public void Del() {
        studentDAO.del();
    }

    @Override
    public void Update() {
        studentDAO.update();
    }
}
