package kuang.dao;

import kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface TeacherMapper {

    @Select("Select * from mybatis.teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);

}
