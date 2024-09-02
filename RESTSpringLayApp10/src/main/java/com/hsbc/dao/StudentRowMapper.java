package com.hsbc.dao;

import com.hsbc.model.Department;
import com.hsbc.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper <Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        Department dept=new Department();
        student.setDept(dept);
        student.setStudentId(rs.getInt("student_id"));
        student.setStudentName(rs.getString("student_name"));
        student.setStudentScore(rs.getDouble("student_score"));
        student.getDept().setDeptId(rs.getInt("dept_id"));
        return student;
    }
}
