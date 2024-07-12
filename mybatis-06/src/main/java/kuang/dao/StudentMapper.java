package kuang.dao;

import kuang.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
//    查询所有的老师信息以及对应的学生信息
    public List<Student> getStudent();
}
