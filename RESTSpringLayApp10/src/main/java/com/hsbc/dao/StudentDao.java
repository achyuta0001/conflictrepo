package com.hsbc.dao;

import com.hsbc.model.Student;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    public boolean createStudent(Student student) ;
    public Student readStudentById(int studentId) ;
    public List<Student> readAllStudent();
    public boolean updateStudent(int id, String name);


    public boolean deleteStudent(int studentId);

}
