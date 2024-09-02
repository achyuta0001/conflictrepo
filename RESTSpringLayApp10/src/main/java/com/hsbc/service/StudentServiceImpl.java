package com.hsbc.service;

import com.hsbc.dao.StudentDao;
import com.hsbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;
import java.util.List;
@Service("service")

public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentDao dao=null;
    @Override
    public boolean addStudent(Student student) {

            boolean res=dao.createStudent(student);
            return res;


    }

    @Override
    public Student findStudentById(int studentId) {

            Student res=dao.readStudentById(studentId);
            return  res;
    }

    @Override
    public List<Student> findAllStudent() {
        return dao.readAllStudent();
    }

    @Override
    public boolean removeStudent(int studentId) {
        return dao.deleteStudent(studentId);
    }

    @Override
    public boolean changeStudent(int id, String name) {

        return dao.updateStudent(id,name);
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }
}
