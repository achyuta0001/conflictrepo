package com.hsbc.dao;

import com.hsbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class StudentDaoJdbcImpl implements StudentDao {
    @Autowired
    private JdbcTemplate template;
    //private JdbcClient client;


    @Override
    public boolean createStudent(Student student)  {
        String query = "insert into student(student_id,student_name,student_score,dept_id) values (?,?,?,?)";

        int result = template.update(query, student.getStudentId(), student.getStudentName(), student.getStudentScore(), student.getDept().getDeptId());
        return result == 1 ? true : false;
    }

    @Override
    public Student readStudentById(int studentId)  {
        String query="select * from student where student_id="+studentId;
        Student student=(Student) template.queryForObject(query,new StudentRowMapper());
        return student;
    }

    @Override
    public List<Student> readAllStudent() {
        String query="select * from student";
        List<Student> listofstudts =template.query(query,new StudentRowMapper());

        return listofstudts;
    }

    @Override
    public boolean updateStudent(int id,String name) {
        String query="update student set student_name=? where student_id=? ";
        int result=template.update(query,name,id);
        return result == 1? true:false;
    }

    @Override
    public boolean deleteStudent(int studentId) {
        String query="delete from student where student_id="+studentId;
        int result=template.update(query);
        return result == 1? true:false;
    }
}
